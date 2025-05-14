package ListasEncadeadasGenericas;

public class LiastaIntCrescente {

    private class NO{
        int dado;
        NO prox;
    }

    private NO lista = null;

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

        }
    }

}
