package ImplementacaoABB;

public class ABB {
    private class No{
        int data;
        No left, right;
    }

    public No root = null;

    public No insert(No p, int info){
        if(p == null){
            p = new No();
            p.data = info;
            p.left = null;
            p.right = null;
        }else if(info < p.data){
            p.right = insert(p.left, info);
        }else{
            p.right = insert(p.right, info);
        }
        return p;
    }

    public void show(No p){
        if(p != null){
            show(p.left);
            System.out.println(p.data);
            show(p.right);
        }
    }

}
