package view;

import model.AbstracaoOrdem;
import model.Letras;
import model.ListaNaoOrdenada;
import model.ListaOrdenada;
import model.Marcador;
import model.Numeros;

public class Teste {

	public static void main(String[] args) {
		
		System.out.println("Listas ordenada");
		
		AbstracaoOrdem ordem = new ListaOrdenada(new Numeros());
		ordem.adicionar("Texto");
		ordem.adicionar("Exemplo");
		ordem.adicionar("Marcar");
		ordem.adicionar("Aniversario");
		ordem.adicionar("Convidados");
		ordem.imprimir();
		System.out.println();
		
		ordem = new ListaOrdenada(new Letras());
		ordem.adicionar("Texto");
		ordem.adicionar("Exemplo");
		ordem.adicionar("Marcar");
		ordem.adicionar("Aniversario");
		ordem.adicionar("Convidados");
		ordem.imprimir();
		System.out.println();
		
		ordem = new ListaOrdenada(new Marcador());
		ordem.adicionar("Texto");
		ordem.adicionar("Exemplo");
		ordem.adicionar("Marcar");
		ordem.adicionar("Aniversario");
		ordem.adicionar("Convidados");
		ordem.imprimir();
		System.out.println();
		
		System.out.println("Listas não ordenada");
		
		AbstracaoOrdem desordem = new ListaNaoOrdenada(new Numeros());
		desordem.adicionar("Texto");
		desordem.adicionar("Exemplo");
		desordem.adicionar("Marcar");
		desordem.adicionar("Aniversario");
		desordem.adicionar("Convidados");
		desordem.imprimir();
		System.out.println();
		
		desordem = new ListaNaoOrdenada(new Letras());
		desordem.adicionar("Texto");
		desordem.adicionar("Exemplo");
		desordem.adicionar("Marcar");
		desordem.adicionar("Aniversario");
		desordem.adicionar("Convidados");
		desordem.imprimir();
		System.out.println();
		
		desordem = new ListaNaoOrdenada(new Marcador('*'));
		desordem.adicionar("Texto");
		desordem.adicionar("Exemplo");
		desordem.adicionar("Marcar");
		desordem.adicionar("Aniversario");
		desordem.adicionar("Convidados");
		desordem.imprimir();
		
	}

}
