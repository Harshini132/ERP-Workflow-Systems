package model;

public class Task {
    private int taskId;
    private String title;
    private String assignedTo;
    private String status;

    public Task(int taskId, String title, String assignedTo, String status) {
        this.taskId = taskId;
        this.title = title;
        this.assignedTo = assignedTo;
        this.status = status;
    }

    @Override
    public String toString() {
        return taskId + " | " + title + " | Assigned: " + assignedTo + " | Status: " + status;
    }
}
