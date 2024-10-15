public class TaskDisplay {
    private final int taskCount;
    private final String[] tasks;
    private final boolean[] isDone;

    public TaskDisplay(String[] tasks, boolean[] isDone, int taskCount) {
        this.tasks = tasks;
        this.isDone = isDone;
        this.taskCount = taskCount;
    }
    public void displayTasks() {
        System.out.println("Your Tasks:");
        for (int i = 0; i < taskCount; i++) {
            System.out.println((i + 1) + ". " + tasks[i] + " - " + (isDone[i] ? "Done" : "Not Done"));
        }
        System.out.println();
        System.out.println("______________________________________________________________________");
    }
}
