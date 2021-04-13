package arvoreBinaria;

public class Arvore {
	
	No raiz;
		
	public Arvore(int elemento) {
		raiz = new No(elemento);
	}
	
	public No getRaiz() {
		return raiz;
	}
	
	public void setRaiz(No raiz) {
		this.raiz = raiz;
	}
	
	public void add(int elemento) {
		if(elemento > raiz.elemento) {
			if(raiz.direita == null) {
				raiz.direita = new No(raiz, elemento);
			}else {
				raiz.direita.add(elemento, raiz.direita);
			}
			
		}else {
			if(raiz.esquerda == null) {
				raiz.esquerda = new No(raiz, elemento);
			}else {
				raiz.esquerda.add(elemento, raiz.esquerda);
			}
		}
	}
	
	//caminhamento	
	public void LRN() {

		System.out.println("left-right-no");
		raiz.LRN();
		System.out.print(" "+raiz.elemento);
		System.out.println(" ");
		
	}
	public void NLR() {

		System.out.println("no-left-right");
		System.out.print(raiz.elemento);
		raiz.NLR();
		System.out.println(" ");
	}
	public void LNR() {
		//wip
		System.out.println("left-no-right");
		System.out.print(raiz.elemento);
		raiz.LNR();

		System.out.println(" ");
	}

	
	//consultas
	public boolean Consulta(int pesquisa) {
		
		boolean existe = raiz.Consulta(pesquisa);
		return existe;
	}
	
	public int NumeroNos() {
		return raiz.NumeroNos() + 1;
	}
	
	public void ConsultaPronfundidade(int pesquisa) {
		raiz.ConsultaProfundidade(pesquisa);
	}
	
	public void ConsultaGrau(int pesquisa) {
		raiz.consultaGrau(pesquisa);
	}
	
	public void consultaAltura(int pesquisa) {
		int altura = raiz.consultaAltura(pesquisa, false);
		System.out.println("O elemento "+pesquisa+" tem altura "+altura);
	}
	
	//
	public void inverter() {
		System.out.println("Antes de inverter");
		NLR();
		raiz.inverter();
		System.out.println("Depois de inverter");
		NLR();
	}

	public void removerNo(int pesquisa){
		//wip
		raiz.removerNo(pesquisa);
	}
}
