package uteis;

public class Pilha<T> {
	
	private CelulaPilha<T> topo;
	private int tamanho;
	
	public Pilha() {
		topo = null;
		tamanho = 0;
	}

    public boolean existeDado(T elemento) {

   		CelulaPilha<T> aux = topo;
   		
       	while(true) {
       		if(topo.getElemento() == elemento) {
       			return true;
       		}else {
       			
       			if(aux.getAnterior() != null) {
       				aux = aux.getAnterior();
       			}else {
       				break;
				}
       			
			}
       		
       		
       	}
       	return false;
    	
    }

    public boolean isEmpty() {
        return Tamanho() == 0;
    }
    

    public void push (T elemento) {
    	
    	CelulaPilha<T> aux = new CelulaPilha<T>(topo, elemento);
    	topo.setAnterior(aux);
    	topo = aux;
    	tamanho++;
    	
    	
     }
     
    public void Pop() {
    	if(tamanho>0) {
        	topo = topo.getAnterior();
        	tamanho = tamanho-1;
    	}else {
    		throw new ArrayIndexOutOfBoundsException("Pilha vazia");
    	}

    } 
    
    public T Top(){
    	if(topo.getElemento() != null) {
    		return topo.getElemento();
    	}
    	
    	throw new ArrayIndexOutOfBoundsException("Pilha vazia");
    } 
    
    public void pull(T elemento) {
    	
    	topo.setElemento(elemento);

    }
    
   public void limpa() {
	   
	   topo.setAnterior(null);

   }
    
    public int Tamanho() {
        return tamanho;
    }
    
}
