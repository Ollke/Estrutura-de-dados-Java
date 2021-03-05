package uteis;

public class Vetor<T> {

    //Vetor Gen�rico	
    private T[] vetor;

    //Vari�vel que controla quantidade de elementos do vetor
    private int qntElementos = 0;

    //Construtor espec�fico da Classe Vetor
    public Vetor(int tam) {
        
        //Criando um novo vetor gen�rico
        vetor = (T[]) new Object[tam]; 
        
        this.qntElementos = tam;
        
    }

    //M�todo que verifica se existe dado em uma posi��o do vetor
    public boolean existeDado(int pos) {
        return vetor[pos] != null;
    }

    //M�todo que retorna o valor de uma posi��o do vetor
    public T Recuperar(int pos) {
        if ((pos < 0 && pos > Tamanho()) || (!existeDado(pos))) {
            throw new ArrayIndexOutOfBoundsException("Posi��o Inv�lida");
        }
        return vetor[pos];
    }

    //M�todo que verifica se o vetor est� vazio
    public boolean vazio() {
        return Tamanho() == 0;
    }


   //M�todo que adiciona no vetor
     public void Adicionar (T elemento) {
         if (Tamanho() == vetor.length) {
             redimensionar();
         }

         for (int i = 0; i < vetor.length; i++) {
             if (vetor[i] == null) {
                 vetor[i] = elemento;
                 qntElementos++;
                 break;
             }
         }
     }
     
     public void AdicionarInicio (T elemento) {
         if (Tamanho() == vetor.length) {
             redimensionar();
         }

         T[] aux = vetor;
     	vetor = (T[]) new Object[aux.length];
     	vetor[0] = elemento;
     	
     	for (int i = 0; i < aux.length; i++) {
             if (vetor[i] == null) {
                 vetor[i] = aux[i-1];
             }
         }
     }
    
    public void AdicionarFim (T elemento) {
        if (Tamanho() == vetor.length) {
            redimensionar();
        }

        for (int i = vetor.length-1; i > -1; i = i-1) {
            if (vetor[i] != null) {
                vetor[i+1] = elemento;
                break;
            }
        }
    }

   //M�todo que remove do vetor em uma determinada posi��o
    public void Remover(int posicao) throws ArrayIndexOutOfBoundsException {
    	if(posicao > 0 && posicao < vetor.length) {
    		vetor[posicao] = null;
    	}
    }

    //M�todo que remove do in�cio do vetor
    public void RemoverInicio() {
    	
    	for (int i = 0; i < vetor.length; i++){
            if (vetor[i] != null){
                vetor[i] = null;
                break;
            }
        }

    }

    //M�todo que remove do fim do vetor
    public void RemoverFim() {
    	for (int i = vetor.length; i > 0; i = i-1) {
            if (vetor[i] != null) {
                vetor[i] = null;
                break;
            }
        }

    }

    
    //M�todo que retorna o tamanho atual do vetor
    public int Tamanho() {
        return qntElementos;
    }

    //M�todo que limpa/apaga todas as posi��es do vetor
    public void Limpar() {
    	for (int i = 0; i < vetor.length; i++)    	{
            if (vetor[i] != null){
                vetor[i] = null;}
            }

    }

    //M�todo que dobra o tamanho do vetor caso ele atinja o seu tamanho.
    public void redimensionar(){
    	T[] aux = vetor;
    	vetor = (T[]) new Object[aux.length*2];
    	
    	for (int i = 0; i < aux.length; i++) {
            if (vetor[i] == null) {
                vetor[i] = aux[i];
            }
        }

    }
}