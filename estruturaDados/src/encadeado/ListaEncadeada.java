package encadeado;

import ED.Quarto;

public class ListaEncadeada<T> {
	
	private CelulaSimples inicio,fim;
	private int tamanho;
	
	public ListaEncadeada() {
		inicio = null;
		fim = null;
		tamanho = 0;
	}
	
	public CelulaSimples getInicio() {
		return this.inicio;
	}
	public CelulaSimples getFim() {
		return this.fim;
	}
	
	public void addInicio(T elemento) {
		CelulaSimples nova = new CelulaSimples(elemento);
		
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
		CelulaSimples nova = new CelulaSimples(elemento);
		
		fim.setProximo(nova);
		fim = nova;
		tamanho++;
	}
	
	//wip
	public void add(T elemento,int posicao) {
		CelulaSimples nova = new CelulaSimples(elemento);
		CelulaSimples aux = inicio;
		CelulaSimples auxAnterio = inicio;
		int i = 0;
		if (this.tamanho == 0) {
            
            System.out.println("A lista está vazia!!");
            
        } else if (posicao < 0) {
            System.out.println("A Posição " + posicao + " é Inválida!");
            
        } else if(posicao >= this.tamanho+1) {
        	System.out.println("A posição é maior que a lista, o elemnto sera adiocionado no fim");
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
	            
	            System.out.println("A lista está vazia!!");
	            return null;
	            
	        } else if (posicao < 0 || posicao >= this.tamanho) {
	            
	            System.out.println("A Posição " + posicao + " é Inválida!");
	            return null;
	            
	        } else {
	        	CelulaSimples busca = inicio;
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
	            System.out.println("A lista está vazia!");
	            
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
	            System.out.println("A lista está vazia!");
	            
	        } else {
	        	inicio = null;
	        	fim = null;
	        }
	 }
	 
	 public boolean existeDado(T elemento) {
		 CelulaSimples aux = inicio; 
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
	            
	            System.out.println("A lista está vazia!!");
	            
	        } else if (posicao < 0 || posicao >= this.tamanho) {
	            
	            System.out.println("A Posição " + posicao + " é Inválida!");
	            
	        } else {
	        	CelulaSimples busca = inicio;
	        	CelulaSimples buscaAnterio = inicio;
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
		 CelulaSimples busca = inicio;
	     CelulaSimples buscaAnterio = inicio;
	         
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
