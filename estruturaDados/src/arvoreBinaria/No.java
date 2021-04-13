package arvoreBinaria;


public class No {
	No pai = null;
	No esquerda = null;
	No direita = null;
	int elemento,profundidade;
	
	public No(No pai, int elemento) {
		// TODO Auto-generated constructor stub
		
		this.pai = pai;
		this.elemento = elemento;
		this.profundidade = pai.getProfundidade() + 1;
	}
	public No(int elemento) {
		// TODO Auto-generated constructor stub
		this.elemento = elemento;
		this.esquerda = null;
		this.direita = null;
	}
	
	public No getDireita() {
		return direita;
	}
	
	public No getEsquerda() {
		return esquerda;
	}
	
	public No getPai() {
		return pai;
	}
	
	public int getElemento() {
		return elemento;
	}
	
	public int getProfundidade() {
		return profundidade;
	}
	
	public void setDireito(No direita) {
		this.direita = direita;
	}
	
	public void setEsquerdo(No esquerda) {
		this.esquerda = esquerda;
	}
	
	public void setElemento(int elemento) {
		this.elemento = elemento;
	}
	
	public void setPai(No pai) {
		this.pai = pai;
	}
	
	public void setProfundidade(int profundidade) {
		this.profundidade = profundidade;
	}
	
	public void add(int elemento, No pai) {
		
		if(elemento > this.elemento) {
			if(this.direita == null) {
				this.direita = new No(pai, elemento);
			}else {
				this.direita.add(elemento, direita);
			}
			
		}else {
			
			if(this.esquerda == null) {
				this.esquerda = new No(pai, elemento);
			}else {
				this.esquerda.add(elemento, esquerda);
			}
		}
		
	}
	
	public void LRN() {
		// left-right-no
		if(esquerda != null && direita != null) {
			

			esquerda.LRN();
			System.out.print(" "+ esquerda.getElemento());
			System.out.print(" "+ direita.getElemento());
			direita.LNR();
			
		}else if(esquerda != null && direita == null) {

			esquerda.LRN();
			System.out.print(" "+ esquerda.getElemento());
			
		}else if(direita != null && esquerda == null) {

			System.out.print(" "+ direita.getElemento());
			direita.LRN();
			
		}
	}
	
	public void NLR() {
		//no-left-right
		if(esquerda != null) {
			System.out.print(" "+ esquerda.getElemento());
			esquerda.NLR();
		}
		if(direita != null) {
			System.out.print(" "+ direita.getElemento());
			direita.NLR();
		}
	}
	
	public void LNR() {
		//wip
		//left-no-right
	
		if(esquerda != null && direita != null) {

			esquerda.LRN();
			System.out.print(" "+ esquerda.getElemento());
			System.out.print(" "+ direita.getElemento());
			
		}else if(esquerda != null && direita == null) {

			System.out.print(" "+ esquerda.getElemento());
			esquerda.LRN();
			
		}else if(direita != null && esquerda == null) {

			direita.LRN();
			System.out.print(" "+ direita.getElemento());
			
		}
	}
	
	public boolean Consulta(int pesquisa) {
		boolean existe = false;
		
		if(this.elemento == pesquisa) {
			existe = true;
			return existe;
		}else {
			
			if (esquerda != null) {
				existe = esquerda.Consulta(pesquisa);
				if(existe) {
					return existe;
				}
			}
			
			if (direita != null) {
				existe = direita.Consulta(pesquisa);
				if(existe) {
					return existe;
				}
			}
			
		}
		
		return existe;
	}
	
	public int NumeroNos() {
		int nos = 0;
		
		if(esquerda != null) {
			nos++;
			nos = nos + esquerda.NumeroNos();
		}
		
		if(direita != null) {
			nos++;
			nos = nos + direita.NumeroNos();
		}
		
		return nos;
	}
	
	public void ConsultaProfundidade(int pesquisa) {
		if(pesquisa == elemento) {
			System.out.println("O elemento "+pesquisa+" tem profundidade "+profundidade);
		}else {
			if(esquerda != null) {
				esquerda.ConsultaProfundidade(pesquisa);
			}
			if(direita != null) {
				direita.ConsultaProfundidade(pesquisa);
			}
		}
	}
	
	
	public void consultaGrau(int pesquisa) {
		
		if(pesquisa == elemento) {
			int grau = 0;
			
			if(esquerda != null) {
				grau++;
			}
			if(direita != null) {
				grau++;
			}	
			System.out.println("O elemento "+pesquisa+" tem grau "+grau);
		}else {
			if(esquerda != null) {
				esquerda.consultaGrau(pesquisa);
			}
			if(direita != null) {
				direita.consultaGrau(pesquisa);
			}
		}
	}
	
	public int consultaAltura(int pesquisa, boolean achei) {
		int alturaEsquerda = 0;
		int alturaDireita = 0;
		
		if(pesquisa == elemento) {
			achei = true;
			
			if(esquerda != null) {
				alturaEsquerda = esquerda.consultaAltura(pesquisa,achei);	
				alturaEsquerda++;
			}
			if(direita != null) {
				alturaDireita = direita.consultaAltura(pesquisa, achei);		
				alturaDireita++;
			}
			
			
			if(alturaDireita>alturaEsquerda) {
				return alturaDireita;
			}else {
				return alturaEsquerda;
			}
		}else {
			if(esquerda != null) {
				
				alturaEsquerda = esquerda.consultaAltura(pesquisa, achei);	
				if(achei) {
					alturaEsquerda++;
				}
			}
			if(direita != null) {
				alturaDireita = direita.consultaAltura(pesquisa, achei);	
				if(achei) {
					alturaDireita++;
				}
			}
			
			if(alturaDireita>alturaEsquerda) {
				return alturaDireita;
			}else {
				return alturaEsquerda;
			}
			
		}
	}
	
	public void inverter() {
		if(esquerda != null && direita != null) {
			No aux = esquerda;
			esquerda = direita;
			direita = aux;
			
			esquerda.inverter();
			direita.inverter();
			
		}else if(esquerda != null && direita == null) {
			
			direita = esquerda;
			esquerda = null;
			
			direita.inverter();
		}else if(direita != null && esquerda == null) {
			
			esquerda = direita;
			direita = null;
			
			esquerda.inverter();
		}
	}
	
	public void removerNo(int pesquisa) {
		if(pesquisa == elemento) {
			if(esquerda != null && direita != null) {
				
				if(pai.esquerda.elemento == elemento) {
					pai.esquerda = esquerda;
					esquerda.pai = pai;
					
				}else {
					pai.direita = esquerda;
					esquerda.pai = pai;
				}
				
				if(esquerda.esquerda != null && esquerda.direita != null) {
				
					esquerda.add(esquerda.direita.elemento, esquerda);
					
				}
				
				
				
			}else if(esquerda != null && direita == null) {
				if(pai.esquerda.elemento == elemento) {
					pai.esquerda = esquerda;
					esquerda.pai = pai;
				}else {
					pai.direita = esquerda;
					esquerda.pai = pai;
				}
				if(esquerda.esquerda != null && esquerda.direita != null) {
					
					
					
				}else if(esquerda.esquerda != null && esquerda.direita == null) {
					
				}else if(esquerda.esquerda != null && esquerda.direita != null) {
					
				}
				
				
			}else if(direita != null && esquerda == null) {
				
				if(pai.esquerda.elemento == elemento) {
					pai.esquerda = direita;
					direita.pai = pai;
				}else {
					pai.direita = esquerda;
					direita.pai = pai;
				}
				
			}else {
				if(pai.esquerda.elemento == elemento) {
					pai.esquerda = null;
				}else {
					pai.direita = null;
				}
			}
			
		}else {
			if(esquerda != null) {
				esquerda.removerNo(pesquisa);
			}
			if(direita != null) {
				direita.removerNo(pesquisa);
			}
			
		}
	}
	
}
