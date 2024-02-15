import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();

        System.out.println("Welcome to the To-Do List App!");
        //conditional flag
        while (true) {
            System.out.println("\n1. Add Task\n2. View Tasks\n3. Mark Task as Completed\n4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            //swtich case for selcection base
            switch (choice) {
                case 1:
                    System.out.print("Enter the task: ");
                    String task = scanner.nextLine();
                    tasks.add(task);
                    System.out.println("Task added!");
                    break;
                case 2:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks added yet.");
                    } else {
                        System.out.println("Tasks:");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;
                case 3:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks added yet.");
                    } else {
                        System.out.print("Enter the task number to mark as completed: ");
                        int taskNumber = scanner.nextInt();
                        if (taskNumber < 1 || taskNumber > tasks.size()) {
                            System.out.println("Invalid task number.");
                        } else {
                            tasks.remove(taskNumber - 1);
                            System.out.println("Task marked as completed.");
                        }
                    }
                    break;
                case 4:
                    //conclusive statement
                    System.out.println("Thank you for using the To-Do List App. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 4.");
            }
        }
    }
}
