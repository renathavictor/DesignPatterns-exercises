package visao;

import modelo.AppEscritorio;
import modelo.AppEscritorioFabrica;


public class Cliente {

	public static void main(String[] args) {

	AppEscritorioFabrica fabrica = new AppEscritorioFabrica();
	
	AppEscritorio texto = fabrica.getAppEscritorio("texto");
	texto.setNome("teste");
	texto.setPath("/caminho/");
	texto.setCopia(true);
	
	System.out.println(texto);
	
	AppEscritorio texto2;
	
	try {
		texto2 = texto.clonar();
		texto2.setEmail("teste@email.com");
		System.out.println(texto2);
	
	} catch (Exception e) {
		System.out.println(e);
	}
	

	}

}
