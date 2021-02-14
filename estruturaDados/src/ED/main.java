package ED;

import duplo.ListaDupla;
import encadeado.ListaEncadeada;
import encadeado.ListaEncadeadaQuarto;
import encadeado.CelulaSimples;
import uteis.Aluno;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Quarto q1 = new Quarto(1,1);
		Quarto q2 = new Quarto(2,2);
		Quarto q3 = new Quarto(3,3);
		Quarto q4 = new Quarto(4,4);
		
		ListaEncadeadaQuarto lista = new ListaEncadeadaQuarto();
		
		lista.addInicio(q1);
		lista.addInicio(q2);
		lista.addInicio(q3);
		lista.addInicio(q4);
		
		System.out.println(lista.Recupera(0));
		System.out.println(lista.Recupera(1));
		System.out.println(lista.Recupera(2));
		System.out.println(lista.Recupera(3));
		
		lista = lista.organizarQuartos(lista);
		
		System.out.println(lista.Recupera(0));
		System.out.println(lista.Recupera(1));
		System.out.println(lista.Recupera(2));
		System.out.println(lista.Recupera(3));
		

		 
		
	}

}