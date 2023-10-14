#ifndef ROUNDROBIN_H
#define ROUNDROBIN_H

#include "Process.h"

std::vector<float> calculateTime(int num, std::vector<Process> &P, int quantum) {
	int totalRunTime = 0;
	float avgWaitTime = 0, avgResponseTime = 0, avgTurnaroundTime = 0;
	
	while (!P.empty()) {
		totalRunTime = (totalRunTime < P[0].arrivalTime ? P[0].arrivalTime : totalRunTime);
		std::cout << "Process with ID " << P[0].processID << " has been fetched by CPU at " << totalRunTime << std::endl;

		if (P[0].burstTime == P[0].burstTimeLeft) {
			P[0].fetchedByCPU = totalRunTime;
			P[0].waitTime = P[0].responseTime = P[0].fetchedByCPU - P[0].arrivalTime;
		}
		P[0].waitTime += (P[0].interrupted > 0 ? totalRunTime - P[0].interrupted : 0);

		do {
			P[0].burstTimeLeft --;
			totalRunTime ++;
		} while ((P[0].burstTime - P[0].burstTimeLeft) % quantum != 0 && P[0].burstTimeLeft > 0);

		P[0].interrupted = totalRunTime;
		if (P[0].burstTimeLeft == 0) {
			P[0].turnaroundTime = P[0].interrupted - P[0].arrivalTime;
			avgWaitTime += P[0].waitTime;
			avgResponseTime += P[0].responseTime;
			avgTurnaroundTime += P[0].turnaroundTime;
			std::cout << "Process with ID " << P[0].processID << " has wait time of " << P[0].waitTime << ", response time of " << P[0].responseTime << " and turnaround time of " << P[0].turnaroundTime << std::endl;
			std::cout << "Process with ID " << P[0].processID << " has left CPU at " << P[0].interrupted << std::endl << "------------------------------------------------------" << std::endl;
			P.erase(P.begin());
		} else {
			std::cout << "Process with ID " << P[0].processID << " has left CPU at " << P[0].interrupted << std::endl << "------------------------------------------------------" << std::endl;
			Process Temp = P[0];
			P.erase(P.begin());
			P.push_back(Temp);
		}
		
	}

	if (P.empty())
		std::cout << "P is empty" << std::endl;

	std::vector<float> result(3);
	result[0] = avgWaitTime / num;
	result[1] = avgResponseTime / num;
	result[2] = avgTurnaroundTime / num;
	return result;

}

#endif