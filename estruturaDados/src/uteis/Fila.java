package uteis;

public class Fila<T> {
	private CelulaSimples<T> inicio;
    private int tamanho;

    public Fila() {
		inicio = null;
		tamanho = 0;
	}
    
    public Fila(CelulaSimples<T> celula) {
		inicio = celula;
		tamanho = 1;
	}
    
    public boolean isEmpty() {
        return this.tamanho == 0;
    }
    
    public int Tamanho() {
    	return this.tamanho;
    }
    
    public void Inserir(T elemento) {
    	CelulaSimples<T> aux = inicio;
    	while(true) {
    		if(aux.getElemento()==null) {
    			aux.setElemento(elemento);
    			break;
    		}else {
    			aux = aux.getProximo();
    		}
    	}
    }
    
    public T Recuperar() {
    	return inicio.getElemento();
    }
    
    
    public void Alterar(T elemento) {
    	 inicio.setElemento(elemento); 
    }
    
    public void Remover() {
    	inicio = inicio.getProximo();
    }
    
    public void limpa() {
    	inicio.setProximo(null);
    }
}
