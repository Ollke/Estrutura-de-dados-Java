package encadeado;

public class CelulaSimples {
	private CelulaSimples proximo;
    private Object elemento;

    public CelulaSimples() {
    	
    }

    public CelulaSimples(Object elemento) {
        this.elemento = elemento;
    }

    public CelulaSimples(CelulaSimples proximo, Object elemento) {
        this.proximo = proximo;
        this.elemento = elemento;
    }

    public CelulaSimples getProximo() {
        return proximo;
    }

    public void setProximo(CelulaSimples proximo) {
        this.proximo = proximo;
    }

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }
}
