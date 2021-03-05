package encadeado;

public class ListaEncadeada<T> {
	
	private CelulaSimples<T> inicio,fim;
	private int tamanho;
	
	public ListaEncadeada() {
		inicio = null;
		fim = null;
		tamanho = 0;
	}
	
	public CelulaSimples<T> getInicio() {
		return this.inicio;
	}
	public CelulaSimples<T> getFim() {
		return this.fim;
	}
	
	public void addInicio(T elemento) {
		CelulaSimples<T> nova = new CelulaSimples<T>(elemento);
		
		if (this.tamanho == 0) {
            inicio = nova;
            fim = nova;
            this.tamanho ++;
        } else {
        	nova.setProximo(inicio);
        	inicio = nova;
        	this.tamanho++;
        	
        	
        }
	}
	
	public void addFim(T elemento) {
		CelulaSimples<T> nova = new CelulaSimples<T>(elemento);
		
		fim.setProximo(nova);
		fim = nova;
		tamanho++;
	}
	
	//wip
	public void add(T elemento,int posicao) {
		CelulaSimples<T> nova = new CelulaSimples<T>(elemento);
		CelulaSimples<T> aux = inicio;
		CelulaSimples<T> auxAnterio = inicio;
		int i = 0;
		if (this.tamanho == 0) {
            
            System.out.println("A lista est� vazia!!");
            
        } else if (posicao < 0) {
            System.out.println("A Posi��o " + posicao + " � Inv�lida!");
            
        } else if(posicao >= this.tamanho+1) {
        	System.out.println("A posi��o � maior que a lista, o elemnto sera adiocionado no fim");
        	addFim(elemento);
        	
        }else {
		while(true) {
			if(i == posicao) {
				nova.setProximo(aux.getProximo());
				auxAnterio.setProximo(nova);
				tamanho++;
				
				while(true) {
					auxAnterio = aux;
					aux = aux.getProximo();
					
					aux.setProximo(auxAnterio);
					
					if(aux.getProximo()!=null) {
						aux.setProximo(auxAnterio);
						aux = aux.getProximo();
					}else {
						break;
					}
				}
				break;
			}else {
				auxAnterio = aux;
				aux = aux.getProximo();
				i++;
			}
        }}
			
	}
	
	 public T Recupera(int posicao) {
	        
	        if (this.tamanho == 0) {
	            
	            System.out.println("A lista est� vazia!!");
	            return null;
	            
	        } else if (posicao < 0 || posicao >= this.tamanho) {
	            
	            System.out.println("A Posi��o " + posicao + " � Inv�lida!");
	            return null;
	            
	        } else {
	        	CelulaSimples<T> busca = inicio;
	            int i = 0;
	            while (i<tamanho) {
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
	 
	 public void removeInicio() {
	        
	        if (this.tamanho == 0) {
	            System.out.println("A lista est� vazia!");
	            
	        } else if (inicio == fim) {
	            
	            inicio = null;
	            fim = null;
	            this.tamanho -= 1;
	            
	        } else {
	            
	            inicio = inicio.getProximo();
	            this.tamanho -= 1;
	        }
	    }
	 
	 public int Tamanho() {
		 return this.tamanho;
	 }
	 
	 public void limpa() {
	        
	        if (this.tamanho == 0) {
	            System.out.println("A lista est� vazia!");
	            
	        } else {
	        	inicio = null;
	        	fim = null;
	        }
	 }
	 
	 public boolean existeDado(T elemento) {
		 CelulaSimples<T> aux = inicio; 
		 boolean existe = false;
		 while(aux.getProximo()!= null) {
			 if(aux.getElemento() == elemento) {
				 existe = true;
				 break;
			 }
			 aux = aux.getProximo();
		 }
		 return existe;
	}
	 
	 public void remover(int posicao) {
			if (this.tamanho == 0) {
	            
	            System.out.println("A lista est� vazia!!");
	            
	        } else if (posicao < 0 || posicao >= this.tamanho) {
	            
	            System.out.println("A Posi��o " + posicao + " � Inv�lida!");
	            
	        } else {
	        	CelulaSimples<T> busca = inicio;
	        	CelulaSimples<T> buscaAnterio = inicio;
	            int i = 0;
	            if(posicao==0) {
	            	removeInicio();
	            }else {
	            	while (i<tamanho) {
	                	
	                    if (i != posicao) {
	                    	buscaAnterio = busca;
	                        busca = busca.getProximo();
	                        i++;
	                    } else {
	                    	if(busca == fim) {
	                    		fim = buscaAnterio;
	                    		buscaAnterio.setProximo(null);
	                    	} else {
	                    		buscaAnterio.setProximo(busca.getProximo());
							}
	                    	tamanho = tamanho-1;
	                        break;
	                    }
	                }	
				}
	            
	            
	         }      
			
		}	
	 public void removerfim() {
		 CelulaSimples<T> busca = inicio;
	     CelulaSimples<T> buscaAnterio = inicio;
	         
	     	while (true) {
	         	buscaAnterio = busca;
                busca = busca.getProximo();
                if(busca == fim) {
                  	fim = buscaAnterio;
                   	buscaAnterio.setProximo(null);
                   	tamanho = tamanho-1;
                    break;
                }
                if(busca.getProximo() == null) {
                	break;        
				}
	         }    
		}	
	
	 
}
