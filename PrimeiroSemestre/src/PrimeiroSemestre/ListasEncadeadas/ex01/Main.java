package ListasEncadeadas.ex01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        FilaPacientes fila = new FilaPacientes();

        while(true){
            System.out.println("\n1. Adicionar paciente");
            System.out.println("2. Atender paciente");
            System.out.println("3. Encerrar");
            int op = sc.nextInt();

            if (op == 1) {
                System.out.print("Nome: ");
                String nome = sc.next();
                System.out.print("Idade: ");
                int idade = sc.nextInt();
                fila.enqueue(nome, idade);
            } else if (op == 2) {
                fila.atenderPaciente();
            } else if (op == 3) {
                System.out.println("Encerrando atendimento.");
                break;
            }
        }

    }
}
