package encadeado;

public class CelulaSimples<T> {
	private CelulaSimples<T> proximo;
    private T elemento;

    public CelulaSimples() {
    	
    }

    public CelulaSimples(T elemento) {
        this.elemento = elemento;
    }

    public CelulaSimples(CelulaSimples<T> proximo, T elemento) {
        this.proximo = proximo;
        this.elemento = elemento;
    }

    public CelulaSimples<T> getProximo() {
        return proximo;
    }

    public void setProximo(CelulaSimples<T> proximo) {
        this.proximo = proximo;
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }
}
