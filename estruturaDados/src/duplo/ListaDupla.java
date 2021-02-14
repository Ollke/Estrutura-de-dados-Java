package duplo;

import encadeado.CelulaSimples;

public class ListaDupla<T> {
	private CelulaDupla inicio;
	private CelulaDupla fim;
	private int tamanho;
	
	public ListaDupla() {
		inicio = null;
		fim = null;
		tamanho = 0;
	}

	public CelulaDupla getInicio() {
		return this.inicio;
	}
	
	public CelulaDupla getFim() {
		return this.fim;
	}
	
	public void addInicio(T elemento) {
		CelulaDupla nova = new CelulaDupla(elemento);
		
		if (this.tamanho == 0) {
            inicio = nova;
            fim = nova;
            this.tamanho ++;
        } else {
        	inicio.setAnterio(nova);
        	nova.setProximo(inicio);
        	inicio = nova;
        	this.tamanho++;
        	
        	
        }
		
	}
	public void addFim(T elemento) {
		CelulaDupla nova = new CelulaDupla(elemento);
		
		if (this.tamanho == 0) {
            inicio = nova;
            fim = nova;
            this.tamanho ++;
        } else {
        	fim.setProximo(nova);
        	nova.setAnterio(fim);
        	fim = nova;
        	this.tamanho++;
        	
        	
        }
	}

	public void add(int posicao,T elemento) {
		CelulaDupla nova = new CelulaDupla(elemento);
        
        if (this.tamanho == 0) {
            
            System.out.println("A lista está vazia!!");

            
        } else if (posicao < 0 || posicao >= this.tamanho) {
            
            System.out.println("A Posição " + posicao + " é Inválida!");
 
            
        } else {
        	CelulaDupla busca = inicio;
            int i = 0;
            while (i<tamanho+1) {
                if (i != posicao) {
                    busca = busca.getProximo();
                    i++;
                } else {
                    break;
                }
            }
            
            nova.setProximo(busca.getProximo());
            busca.setProximo(nova);
            tamanho++;
         }      
        
	}

	public T Recupera(int posicao) {
        
        if (this.tamanho == 0) {
            
            System.out.println("A lista está vazia!!");
            return null;
            
        } else if (posicao < 0 || posicao >= this.tamanho) {
            
            System.out.println("A Posição " + posicao + " é Inválida!");
            return null;
            
        } else {
        	CelulaDupla busca = inicio;
            int i = 0;
            while (i<tamanho+1) {
                if (i != posicao) {
                    busca = busca.getProximo();
                    i++;
                } else {
                    break;
                }
            }
            
            return (T) busca.getElemento();
         }      
        
	}
	
	public void Remover(int posicao) {
     
     if (this.tamanho == 0) {
         
         System.out.println("A lista está vazia!!");
         
     } else if (posicao < 0 || posicao >= this.tamanho) {
         
         System.out.println("A Posição " + posicao + " é Inválida!");
         
     } else {
     	CelulaDupla busca = inicio;
         int i = 0;
         while (i<tamanho+1) {
             if (i != posicao) {
                 busca = busca.getProximo();
                 i++;
             } else {
                 break;
             }
         }
        busca.getAnterior().setProximo(busca.getProximo());
        this.tamanho = tamanho-1;
      }      
     
}
	 
	 public void removeInicio() {
	        
	        if (this.tamanho == 0) {
	            System.out.println("A lista está vazia!");
	            
	        } else if (inicio == fim) {
	            
	            inicio = null;
	            fim = null;
	            this.tamanho -= 1;
	            
	        } else {
	            
	            inicio = inicio.getProximo();
	            inicio.setAnterio(null);
	            this.tamanho -= 1;
	        }
	    }	
	 
	 public void removeFim() {
	        
	        if (this.tamanho == 0) {
	            System.out.println("A lista está vazia!");
	            
	        } else if (inicio == fim) {
	            
	            inicio = null;
	            fim = null;
	            this.tamanho -= 1;
	            
	        } else {
	            
	            fim = fim.getAnterior();
	            fim.setProximo(null);
	            this.tamanho -= 1;
	        }
	    }
	 
	 public int Tamanho() {
		 return this.tamanho;
	 }
	 
	 public void limpa() {
	        
	        if (this.tamanho == 0) {
	            System.out.println("A lista está vazia!");
	            
	        } else {
	        	inicio = null;
	        	fim = null;
	        	tamanho = 0;
	        }
	 }
	 
	 public boolean existeDado(T elemento) {
		 CelulaDupla aux = inicio; 
		 boolean existe = false;
		 int i = 0;
		 while(i<tamanho) {
			 if(aux.getElemento() == elemento) {
				 existe = true;
				 break;
			 }
			 if(aux.getProximo()==null) {
				 break;
			 }
			 aux = aux.getProximo();
			 i++;
		 }
		 return existe;
	}
	 
	 public void trocaPosicao(int posicao) {
	        
	        if (this.tamanho == 0) {
	            
	            System.out.println("A lista está vazia!!");

	            
	        } else if (posicao < 0 || posicao >= this.tamanho) {
	            
	            System.out.println("A Posição " + posicao + " é Inválida!");
	 
	            
	        } else if(posicao == tamanho-1) {
	        	System.out.println("O nó já ocupa a ultima posição");
	        	
	        }else if(posicao==0){
	        	fim.setProximo(inicio);
	        	fim = inicio;
	        	inicio = inicio.getProximo();
	        }else{
	        	CelulaDupla busca = inicio;
	            int i = 0;
	            while (i<tamanho+1) {
	                if (i != posicao) {
	                    busca = busca.getProximo();
	                    i++;
	                } else {
	                    break;
	                }
	            }
	            
	            if (busca.getAnterior()!=null) {
	            busca.getAnterior().setProximo(busca.getProximo());
	            }
		        busca.setProximo(null);
		        busca.setAnterio(fim);
		        fim.setProximo(busca);
		        fim = busca;
	            
	            
	            
	         }      
	 }
}
