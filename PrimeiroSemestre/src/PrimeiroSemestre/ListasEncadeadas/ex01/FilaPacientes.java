package ListasEncadeadas.ex01;

public class FilaPacientes {

    private static class NO {
        String nome;
        int idade;
        NO prox;
    }

    private NO ini = null;
    private NO fim = null;

    public void enqueue(String nome, int idade) {
        NO novo = new NO();
        novo.nome = nome;
        novo.idade = idade;
        novo.prox = null;

        if (isEmpty()) {
            ini = novo;
        } else {
            fim.prox = novo;
        }

        fim = novo;
    }

    public boolean isEmpty() {
        return ini == null;
    }

    public void atenderPaciente() {
        if (isEmpty()) {
            System.out.println("Nenhum paciente na fila.");
            return;
        }

        System.out.println("Atendendo: " + ini.nome + " (" + ini.idade + " anos)");
        ini = ini.prox;

        if (ini == null) {
            fim = null;
        }
    }
}
