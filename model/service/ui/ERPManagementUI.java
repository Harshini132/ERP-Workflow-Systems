package ui;

import service.EmployeeService;
import service.TaskService;
import java.util.Scanner;

public class ERPManagementUI {
    private EmployeeService employeeService = new EmployeeService();
    private TaskService taskService = new TaskService();
    private Scanner scanner = new Scanner(System.in);

    public void start() {
        boolean running = true;

        while (running) {
            System.out.println("\n=== ERP WORKFLOW MANAGEMENT SYSTEM ===");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Assign Task");
            System.out.println("4. View Tasks");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> addEmployee();
                case 2 -> viewEmployees();
                case 3 -> assignTask();
                case 4 -> viewTasks();
                case 5 -> running = false;
                default -> System.out.println("Invalid choice!");
            }
        }
    }

    private void addEmployee() {
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Department: ");
        String dept = scanner.nextLine();
        System.out.print("Designation: ");
        String role = scanner.nextLine();
        System.out.print("Salary: ");
        double salary = Double.parseDouble(scanner.nextLine());

        employeeService.addEmployee(name, dept, role, salary);
        System.out.println("Employee added successfully!");
    }

    private void viewEmployees() {
        employeeService.getAllEmployees().forEach(System.out::println);
    }

    private void assignTask() {
        System.out.print("Task Title: ");
        String title = scanner.nextLine();
        System.out.print("Assign To: ");
        String assigned = scanner.nextLine();

        taskService.addTask(title, assigned);
        System.out.println("Task assigned successfully!");
    }

    private void viewTasks() {
        taskService.getAllTasks().forEach(System.out::println);
    }
}
