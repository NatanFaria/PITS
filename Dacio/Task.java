public class Task {
    private String nome;
    private String descricao;
    private boolean concluida;

    public Task(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.concluida = false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    @Override
    public String toString() {
        String status = concluida ? "Concluída" : "Em andamento";
        return "Tarefa: " + nome + " - " + descricao + " [" + status + "]";
    }
}