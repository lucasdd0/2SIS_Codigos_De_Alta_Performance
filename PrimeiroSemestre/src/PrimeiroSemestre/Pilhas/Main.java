package Pilhas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        pilha.init();
        Scanner sc = new Scanner(System.in);

        System.out.println("Empilhando elementos na pilha:");
        for (int i = 1; i <= 5; i++) {
            pilha.push(i * 10);
            pilha.imprimirPilha();
        }

        System.out.println("Desempilhando elementos da pilha:");
        while (!pilha.isEmpty()) {
            System.out.println("Elemento removido: " + pilha.pop());
            pilha.imprimirPilha();
        }

        sc.close();
    }
}
