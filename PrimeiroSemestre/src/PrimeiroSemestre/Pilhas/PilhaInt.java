package Pilhas;

import java.util.Scanner;

class Pilha {
    private final int N = 6;
    private int dados[] = new int[N];
    private int topo;

    public void init() {
        topo = 0;
    }

    public boolean isEmpty() {
        return topo == 0;
    }

    public boolean isFull() {
        return topo == N;
    }

    public void push(int elem) {
        if (!isFull()) {
            dados[topo] = elem;
            topo++;
        } else {
            System.out.println("Erro: Pilha cheia!");
        }
    }

    public int pop() {
        if (!isEmpty()) {
            topo--;
            return dados[topo];
        } else {
            System.out.println("Erro: Pilha vazia!");
            return -1;
        }
    }

    public int top() {
        if (!isEmpty()) {
            return dados[topo - 1];
        } else {
            System.out.println("Erro: Pilha vazia!");
            return -1;
        }
    }

    public void imprimirPilha() {
        System.out.print("Pilha: ");
        for (int i = 0; i < topo; i++) {
            System.out.print(dados[i] + " ");
        }
        System.out.println();
    }
}
