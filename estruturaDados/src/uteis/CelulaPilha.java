package uteis;

public class CelulaPilha<T> {
	private CelulaPilha<T> anterior;
    private T elemento;

    public CelulaPilha() {
    	
    }

    public CelulaPilha(T elemento) {
        this.elemento = elemento;
    }

    public CelulaPilha(CelulaPilha<T> anterior, T elemento) {
        this.anterior = anterior;
        this.elemento = elemento;
    }

    public CelulaPilha<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(CelulaPilha<T> anterior) {
        this.anterior = anterior;
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }
}
