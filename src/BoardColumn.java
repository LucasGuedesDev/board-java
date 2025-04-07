import java.util.ArrayList;
import java.util.List;

public class BoardColumn {
    private String name;
    private List<Task> tasks;

    public BoardColumn(String name) {
        this.name = name;
        this.tasks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public boolean removeTask(Task task) {
        return tasks.remove(task);
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void printTasks() {
        System.out.println("[" + name + "]");
        if (tasks.isEmpty()) {
            System.out.println("  (vazio)");
        } else {
            for (Task task : tasks) {
                System.out.println("  " + task);
            }
        }
        System.out.println();
    }
}