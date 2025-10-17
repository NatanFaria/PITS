import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tarefas;

    public TaskManager() {
        tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String nome, String descricao) {
        tarefas.add(new Task(nome, descricao));
    }

    public boolean editarTarefa(int index, String novoNome, String novaDescricao) {
        if (index < 0 || index >= tarefas.size()) {
            return false;
        }
        Task tarefa = tarefas.get(index);
        if (novoNome != null && !novoNome.isEmpty()) {
            tarefa.setNome(novoNome);
        }
        if (novaDescricao != null && !novaDescricao.isEmpty()) {
            tarefa.setDescricao(novaDescricao);
        }
        return true;
    }

    public boolean marcarTarefa(int index, boolean concluida) {
        if (index < 0 || index >= tarefas.size()) {
            return false;
        }
        tarefas.get(index).setConcluida(concluida);
        return true;
    }

    public boolean excluirTarefa(int index) {
        if (index < 0 || index >= tarefas.size()) {
            return false;
        }
        tarefas.remove(index);
        return true;
    }

    public List<Task> listarTarefas() {
        return tarefas;
    }
}