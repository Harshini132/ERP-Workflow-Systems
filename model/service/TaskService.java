package service;

import model.Task;
import java.util.*;

public class TaskService {
    private List<Task> tasks = new ArrayList<>();
    private int nextTaskId = 501;

    public void addTask(String title, String assignedTo) {
        tasks.add(new Task(nextTaskId++, title, assignedTo, "Pending"));
    }

    public List<Task> getAllTasks() {
        return tasks;
    }
}
