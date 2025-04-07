import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<BoardColumn> columns;

    public Board() {
        this.columns = new ArrayList<>();
    }

    public void addColumn(BoardColumn column) {
        columns.add(column);
    }

    public void moveTask(String taskTitle, String fromColumn, String toColumn) {
        Task taskToMove = null;
        BoardColumn from = null, to = null;

        for (BoardColumn column : columns) {
            if (column.getName().equalsIgnoreCase(fromColumn)) {
                from = column;
            }
            if (column.getName().equalsIgnoreCase(toColumn)) {
                to = column;
            }
        }

        if (from != null && to != null) {
            for (Task task : from.getTasks()) {
                if (task.getTitle().equalsIgnoreCase(taskTitle)) {
                    taskToMove = task;
                    break;
                }
            }
            if (taskToMove != null) {
                from.removeTask(taskToMove);
                to.addTask(taskToMove);
                System.out.println("Tarefa movida com sucesso!");
            } else {
                System.out.println("Tarefa não encontrada.");
            }
        } else {
            System.out.println("Coluna inválida.");
        }
    }

    public void printBoard() {
        for (BoardColumn column : columns) {
            column.printTasks();
        }
    }
}