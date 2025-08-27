package ImplementacaoABB;

import java.util.Scanner;

public class Menu {
    ABB abb = new ABB();

    Scanner sc = new Scanner(System.in);
    int option;
    do{
        System.out.println("0 - Sair");
        System.out.println("1 - Inserir 1 valor na ABB");
        System.out.println("2 - Apresenta ABB (em ordem)");
        System.out.println("Opção: ");
        option = sc.nextInt();
        switch (option){
            case 0:
                System.out.println("Fecha a execução");
                break;
            case 1:
                System.out.println("Valor a ser inserido");
                int valor = sc.nextInt();
                abb.root = abb.insert(abb.root, valor);
                break;
            case 2:
                System.out.println();
                abb.show(abb.root);
                System.out.println();
                break;
            default:

        }
    }while(option ! = 0);

}
