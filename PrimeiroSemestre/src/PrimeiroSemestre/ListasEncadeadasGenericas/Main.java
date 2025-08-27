package ListasEncadeadasGenericas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ListaIntCrescente lista = new ListaIntCrescente();

        System.out.println("Informe valor positivo para inserir (negativo encerrar): ");
        int valor = sc.nextInt();

        while(valor >= 0){
            lista.insere(valor);
            lista.mostra();
            System.out.println("Informe valor positivo para inserir (negativo encerrar): ");
            valor = sc.nextInt();
        }

        sc.close();
    }
}
