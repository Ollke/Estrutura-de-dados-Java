package duplo;

public class CelulaDupla<T> {
	private CelulaDupla<T> proximo;
	private CelulaDupla<T> anterior;
    private T elemento;

    public CelulaDupla(){
    	
    }

    public CelulaDupla(T elemento) {
        this.elemento = elemento;
    }

    public CelulaDupla(CelulaDupla<T> proximo,CelulaDupla<T> anterior, T elemento) {
        this.proximo = proximo;
        this.elemento = elemento;
        this.anterior = anterior;
    }

    public CelulaDupla<T> getProximo() {
        return proximo;
    }

    public void setProximo(CelulaDupla<T> proximo) {
        this.proximo = proximo;
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }
    
    public void setAnterio(CelulaDupla<T> x) {
    	this.anterior = x;
    }
    
    public CelulaDupla<T> getAnterior() {
    	return this.anterior;
    }
}
