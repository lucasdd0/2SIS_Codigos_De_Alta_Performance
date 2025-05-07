package FilasEncadeadas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FilaInt fila = new FilaInt();
        fila.init();
        System.out.println("Informe valor positivo para inserir na fila: ");
        int valor = sc.nextInt();
        while(valor >= 0){
            fila.enqueue(valor);
            System.out.println("Informe valor positivo para inserir na fila: ");
            valor = sc.nextInt();
        }
        System.out.println("Esvaziando a fila");
        while (!fila.isEmpty()){
            System.out.println("Retirando valor: " + fila.dequeue());
        }

        sc.close();
    }
}
