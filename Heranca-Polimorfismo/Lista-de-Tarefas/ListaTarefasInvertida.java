/* Implemente a classe pública ListaTarefasInvertida (subclasse de ListaTarefas). Esta classe deve implementar dois métodos:

public boolean adicionarTarefa(Tarefa novaTarefa): recebe uma nova tarefa e adiciona no início da lista. O método retorna true caso a inserção seja realizada (ou seja, havia espaço disponível no vetor de tarefas) ou retorna false caso contrário (vetor já estava cheio).
public void listarTarefasPorTipo(int tipo): imprime na tela todas as tarefas de um determinado tipo.*/
public class ListaTarefasInvertida extends ListaTarefas{
    @Override
    public boolean adicionarTarefa(Tarefa novaTarefa) {
        if (qtdTarefas >= tarefas.length) {
            return false;
        }    
        for (int i = tarefas.length - 1; i > 0; i--) {
            tarefas[i] = tarefas[i - 1];
        }    
        tarefas[0] = novaTarefa;
        qtdTarefas++;
        return true;
        
    }
    public void listarTarefasPorTipo(int tipo) {
        for (int i = 0; i < qtdTarefas; i++) {
            if (tarefas[i].getTipo() == tipo) {
            imprimirItem(tarefas[i]);
            }
        }
    }
}
