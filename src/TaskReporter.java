import java.util.Scanner;

public class TaskReporter {
    private int taskCount;
    private final String[] tasks;
    private final boolean[] isDone;

    public TaskReporter(int taskCount, String[] tasks, boolean[] isDone) {
        this.taskCount = taskCount;
        this.tasks = tasks;
        this.isDone = isDone;
    }

    public void taskReporter() {
        while (true) {
            MenuReport.printMenu();
            int choice = (int) Console.readNumber("Choose an option: ", 1, 4);

            if (choice == 1) {
                if (taskCount == tasks.length) {
                    System.out.println("Task list is full!");
                } else {
                    Scanner scanner = new Scanner(System.in);
                    System.out.print("Enter new task: ");
                    tasks[taskCount] = scanner.nextLine();
                    taskCount++;
                }
            } else if (choice == 2) {
                int taskNumber = (int) Console.readNumber("Enter task number to mark as done: ", 1, taskCount);
                isDone[taskNumber - 1] = true;
            } else if (choice == 3) {
                var taskDisplay = new TaskDisplay(tasks, isDone, taskCount);
                taskDisplay.displayTasks();
            } else if (choice == 4) {
                break;
            }
        }
    }
}
