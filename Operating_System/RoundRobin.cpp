#include "RoundRobin.h"

int main() {
	int numberOfProcesses;
	int quantum;
	std::cout << "Enter quantum: ";
	std::cin >> quantum;
	std::vector<Process> P;
	enterProcessInfo(numberOfProcesses, P);
	QuicksortArrival(P);
	printProcessInfo(P);
	printAvgTime(calculateTime(numberOfProcesses, P, quantum));

	return 0;
}