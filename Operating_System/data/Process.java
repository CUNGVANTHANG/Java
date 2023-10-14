package data;

public class Process {
    private int pid;
    private int arrivalTime;
    private int burstTime;
    private int completionTime;
    private int turnaroundTime;
    private int waitingTime;
    private int responseTime;

    public Process(int pid, int arrivalTime, int burstTime) {
        this.pid = pid;
        this.arrivalTime = arrivalTime;
        this.burstTime = burstTime;
        this.completionTime = -1;
        this.responseTime = -1;
    }

    public int getPid() {
        return pid;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public int getBurstTime() {
        return burstTime;
    }

    public int getCompletionTime() {
        return completionTime;
    }

    public void setCompletionTime(int completionTime) {
        this.completionTime = completionTime;
    }

    public int getTurnaroundTime() {
        return turnaroundTime;
    }

    public void calculateTurnaroundTime() {
        turnaroundTime = completionTime - arrivalTime;
    }

    public int getWaitingTime() {
        return waitingTime;
    }

    public void calculateWaitingTime() {
        waitingTime = turnaroundTime - burstTime;
    }

    public int getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(int responseTime) {
        this.responseTime = responseTime;
    }
}