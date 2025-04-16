package FilaSequencial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FilaInt fila = new FilaInt();
        fila.init();
        int opcao;
        do {
            System.out.println("1 - Inserir o Processo na Fila");
            System.out.println("2 - Retirar o Processo da Fila para a execução");
            System.out.println("3 - Encerrar Atendimento");
            System.out.print("Opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("PID: ");
                    int pid = sc.nextInt();
                    fila.enqueue(pid);
                    break;
                case 2:
                    if (fila.isEmpty()) {
                        System.out.println("Não há processos na fila!");
                    } else {
                        pid = fila.dequeue();
                        System.out.println("Processo em excecução: " + pid);
                        System.out.println("... O processo doi concluido? (1-sim): ");
                        int resp = sc.nextInt();
                        if(resp == 1){
                            System.out.println("Processo " + pid + "foi concluido com sucesso");
                        }else{
                            fila.enqueue(pid);
                            System.out.println("Processo " + pid + "voltou para fila");
                        }
                    }
                    break;
                case 3:
                    if (fila.isEmpty()) {
                        System.out.println("Sistema será encerrado");
                    } else {
                        System.out.println("Ainda ha processos na fila");
                        System.out.println("deseja encerrar todos? (1-sim): ");
                        int resp = sc.nextInt();
                        if(resp == 1){
                            while(!fila.isEmpty()){
                                System.out.println("Encerrado processo: " + fila.dequeue());
                            }
                        }else{
                            opcao = -1;
                        }
                    }
                    break;
                default:
                    System.out.println("Opção Inválida");
            }

        } while (opcao != 3);
        System.out.println("Shutdown");
        sc.close();
    }
}

