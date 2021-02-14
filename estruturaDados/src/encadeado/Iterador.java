package encadeado;

import java.util.Iterator;

public class Iterador<T> implements Iterator{

    private CelulaSimples atual;

    public Iterador(CelulaSimples atual) {
        this.atual = atual;
    }
    
    @Override
    public boolean hasNext() {
        if(atual!=null){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object next() {
        T elemento = (T) atual.getElemento();
        atual = atual.getProximo();
        return elemento;
    }

    public CelulaSimples getAtual() {
        return atual;
    }
}