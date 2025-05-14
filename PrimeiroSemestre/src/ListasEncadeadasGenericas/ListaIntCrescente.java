package ListasEncadeadasGenericas;

public class ListaIntCrescente {

    private class NO{
        int dado;
        NO prox;
    }

    private NO lista = null;

    public void mostra(){
        System.out.println("*************** Apresentacao da Lista ***************");
        NO aux = lista;
        while(aux != null){
            System.out.print(aux.dado + "\t");
            aux = aux.prox;
        }
        System.out.println("\n***************************************************");
    }

    public void insere(int elem){
        NO novo = new NO();
        novo.dado = elem;
        if(lista == null){
            lista = novo;
            novo.prox = null;
        }else if(novo.dado < lista.dado){
            novo.prox = lista;
            lista = novo;
        }else{
            NO aux = lista;
            boolean achou = false;
            while(aux.prox != null && !achou){
                if(aux.prox.dado < novo.dado){
                    aux = aux.prox;
                }
                else{
                    achou = true;
                }
            }
            novo.prox = aux.prox;
            aux.prox = novo;
        }
    }

}
