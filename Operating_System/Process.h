#ifndef PROCESS_H
#define PROCESS_H

#include <iostream>
#include <vector>
#include <algorithm>
#include <fstream>
#include <sstream>
#include <string>

class Process {
public:
	int processID = -1;
	int arrivalTime = 0;
	int fetchedByCPU = 0;
	int burstTime = 0;
	int burstTimeLeft = 0;
	int waitTime = 0;
	int responseTime = 0;
	int turnaroundTime = 0;
	int interrupted = 0;
	int priority = -1;
};

void enterProcessInfo(int &num, std::vector<Process> &P) {
	Process Temp;
	std::ifstream infile;
	infile.open("input2.txt");
	infile >> num;
	for (int i = 0; i < num; i ++) {
		infile >> Temp.arrivalTime >> Temp.burstTime;
		Temp.burstTimeLeft = Temp.burstTime;
		Temp.processID = i;
		P.push_back(Temp);
	}
}

void enterPriorityProcessInfo(int &num, std::vector<Process> &P) {
	Process Temp;
	std::ifstream infile;
	infile.open("inputPriority.txt");
	infile >> num;
	for (int i = 0; i < num; i ++) {
		infile >> Temp.arrivalTime >> Temp.burstTime >> Temp.priority;
		Temp.burstTimeLeft = Temp.burstTime;
		Temp.processID = i;
		P.push_back(Temp);
	}
}

void printProcessInfo(std::vector<Process> P) {
	for (int i = 0; i < P.size(); i ++) {
		std::cout << "Process with ID " << P[i].processID << " has arrival time " << P[i].arrivalTime << " and burst time " << P[i].burstTime << std::endl;
	}
	std::cout << "------------------------------------------------------" << std::endl;
}

void printPriorityProcessInfo(std::vector<Process> P) {
	for (int i = 0; i < P.size(); i ++) {
		std::cout << "Process with ID " << P[i].processID << " has arrival time " << P[i].arrivalTime << ", burst time " << P[i].burstTime << " and priority of " << P[i].priority << std::endl;
	}
	std::cout << "------------------------------------------------------" << std::endl;
}

void QuicksortArrival(std::vector<Process> &P) {
	std::sort(P.begin(), P.end(), [](const Process &a, const Process &b) {
		return a.arrivalTime < b.arrivalTime;
	});
	std::cout << "Done sorting." << std::endl;
}

void QuicksortBurstTime(std::vector<Process> &P) {
	std::sort(P.begin(), P.end(), [](const Process &a, const Process &b) {
		if (a.arrivalTime != b.arrivalTime)
			return a.arrivalTime < b.arrivalTime;
		return a.burstTime < b.burstTime;
	});
	std::cout << "Done sorting." << std::endl;
}

void QuicksortPriority(std::vector<Process> &P, int flag) {
	std::sort(P.begin(), P.end(), [flag](const Process &a, const Process &b) {
		if (a.arrivalTime != b.arrivalTime)
			return a.arrivalTime < b.arrivalTime;
		else if (flag == 0) // Lower Priority gets fetched first
			return a.priority < b.priority;
		return a.priority > b.priority; // Higher Priority gets fetched first
	});
	std::cout << "Done sorting." << std::endl;
}

void printAvgTime(std::vector<float> result) {
	std::cout << "Average wait time is " << result[0] << std::endl;
	std::cout << "Average response time is " << result[1] << std::endl;
	std::cout << "Average turnaround time is " << result[2] << std::endl;
}


#endif
