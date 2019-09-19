package factory.view;

import factory.model.FactoryUsuario;
import factory.model.Usuario;

public class Main {

	public static void main(String[] args) {
		
		FactoryUsuario fabrica = new FactoryUsuario();
		
		Usuario user1 = fabrica.getUsuario("Maria", "feminino");
		System.out.println(user1.saudacao());
		
		Usuario user2 = fabrica.getUsuario("João", "masculino");
		System.out.println(user2.saudacao());
		
		Usuario user3 = fabrica.getUsuario("Jack", "");
		System.out.println(user3.saudacao());
		
	}
}
