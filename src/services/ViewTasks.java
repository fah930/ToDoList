package services;

public class ViewTasks {
    public void execute(TaskManager taskManager) {
        if (taskManager.getTasks().isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }
        System.out.println("Tasks:");
        for (var task : taskManager.getTasks()) {
            task.displayTask();
        }
    }
}
