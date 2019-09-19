package main;

import model.Aluguel;
import model.Cliente;
import model.Fita;
import model.Tipo;

public class Main {


	public static void main(String[] args) {

		Fita f1 = new Fita("Fita 1", Tipo.normal);
		Fita f2 = new Fita("Fita 2", Tipo.lancamento);
		
		Cliente c1 = new Cliente("Fulano");
		
		Aluguel a1 = new Aluguel(f1, 2);
		Aluguel a2 = new Aluguel(f2, 3);

		
		c1.adicionaAluguel(a1);
		c1.adicionaAluguel(a2);

		System.out.println(c1.extrato());
	}

}
