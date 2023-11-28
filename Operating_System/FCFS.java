import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class FCFS {
    public static void main(String[] args) {
        ArrayList<Process> processes = new ArrayList<>();

        // Enter input
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter Arrival time " + (i + 1) + ":");
            int arrivalTime = input.nextInt();
            System.out.println("Enter Burst time " + (i + 1) + ":");
            int burstTime = input.nextInt();
            processes.add(new Process(i + 1, arrivalTime, burstTime));
        }

        // Sort processes by arrival time
        Collections.sort(processes, Comparator.comparingInt(Process::getArrivalTime));

        int currentTime = 0;
        int totalWaitingTime = 0;
        int totalTurnaroundTime = 0;
        int totalResponseTime = 0;

        for (Process process : processes) {
            // Process arrives
            if (process.getArrivalTime() > currentTime) {
                currentTime = process.getArrivalTime();
                process.setResponseTime(0);
            } else {
                process.setResponseTime(currentTime - process.getArrivalTime());

            }

            // Process execution
            process.setCompletionTime(currentTime + process.getBurstTime());
            process.calculateTurnaroundTime();
            process.calculateWaitingTime();

            // Accumulate total waiting time and total turnaround time
            totalWaitingTime += process.getWaitingTime();
            totalTurnaroundTime += process.getTurnaroundTime();
            totalResponseTime += process.getResponseTime();

            currentTime = process.getCompletionTime();
        }

        // Print the result
        System.out.println("PID\tAT\tBT\tCT\tTAT\tWT\tRT");
        for (Process process : processes) {
            System.out.println(
                    process.getPid() + "\t" +
                            process.getArrivalTime() + "\t" +
                            process.getBurstTime() + "\t" +
                            process.getCompletionTime() + "\t" +
                            process.getTurnaroundTime() + "\t" +
                            process.getWaitingTime() + "\t" +
                            process.getResponseTime());
        }

        // Calculate and print average waiting time and average turnaround time
        float averageWaitingTime = (float) totalWaitingTime / processes.size();
        float averageResponseTime = (float) totalResponseTime / processes.size();
        float averageTurnaroundTime = (float) totalTurnaroundTime / processes.size();

        System.out.println("Average Waiting Time: " + averageWaitingTime);
        System.out.println("Average Response Time: " + averageResponseTime);
        System.out.println("Average Turnaround Time: " + averageTurnaroundTime);

        input.close();
    }
}
