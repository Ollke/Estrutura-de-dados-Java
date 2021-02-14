package duplo;

public class CelulaDupla {
	private CelulaDupla proximo;
	private CelulaDupla anterior;
    private Object elemento;

    public CelulaDupla(){
    	
    }

    public CelulaDupla(Object elemento) {
        this.elemento = elemento;
    }

    public CelulaDupla(CelulaDupla proximo,CelulaDupla anterior, Object elemento) {
        this.proximo = proximo;
        this.elemento = elemento;
        this.anterior = anterior;
    }

    public CelulaDupla getProximo() {
        return proximo;
    }

    public void setProximo(CelulaDupla proximo) {
        this.proximo = proximo;
    }

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }
    
    public void setAnterio(CelulaDupla x) {
    	this.anterior = x;
    }
    
    public CelulaDupla getAnterior() {
    	return this.anterior;
    }
}
