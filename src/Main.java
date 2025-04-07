public class Main {
    public static void main(String[] args) {
        Board board = new Board();

        // Criando colunas
        BoardColumn toDo = new BoardColumn("To Do");
        BoardColumn inProgress = new BoardColumn("In Progress");
        BoardColumn done = new BoardColumn("Done");

        // Adicionando colunas ao board
        board.addColumn(toDo);
        board.addColumn(inProgress);
        board.addColumn(done);

        // Criando tarefas
        Task task1 = new Task("Estudar Java", "Estudar coleções em Java");
        Task task2 = new Task("Projeto da faculdade", "Desenvolver tela de login");

        // Adicionando tarefas
        toDo.addTask(task1);
        toDo.addTask(task2);

        // Print inicial
        System.out.println("Board Inicial:");
        board.printBoard();

        // Movendo uma tarefa
        board.moveTask("Estudar Java", "To Do", "In Progress");

        // Print após movimentação
        System.out.println("Board Atualizado:");
        board.printBoard();
    }
}