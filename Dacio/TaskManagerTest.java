public class TaskManagerTest {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        manager.adicionarTarefa("Comprar leite", "Ir ao mercado e comprar leite");
        manager.adicionarTarefa("Estudar Java", "Revisar conceitos de OOP");

        System.out.println("Tarefas iniciais:");
        for (Task t : manager.listarTarefas()) {
            System.out.println(t);
        }

        manager.editarTarefa(1, "Estudar Java OO", null);

        manager.marcarTarefa(0, true);

        System.out.println("\nTarefas após edição e marcação:");
        for (Task t : manager.listarTarefas()) {
            System.out.println(t);
        }

        manager.excluirTarefa(1);

        System.out.println("\nTarefas após exclusão:");
        for (Task t : manager.listarTarefas()) {
            System.out.println(t);
        }
    }
}
