public class Main {
    public static void main(String[] args) {
        String[] tasks = new String[10];
        boolean[] isDone = new boolean[10];
        int taskCount = 0;
        var taskReporter = new TaskReporter(taskCount, tasks, isDone);
        taskReporter.taskReporter();
    }
}
