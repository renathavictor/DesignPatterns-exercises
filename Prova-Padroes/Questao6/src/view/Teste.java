package view;

import model.Componente;
import model.ComponenteConcreto;
import model.InterceptadorCronometro;
import model.InterceptadorLog;
import model.InterceptadorMinuto;

public class Teste {

	public static void main(String[] args) {
		
		ComponenteConcreto concreto = new ComponenteConcreto();
		
		Componente componente = new InterceptadorCronometro(new InterceptadorLog(concreto));
		componente.executarTarefa();
		
		System.out.println();
		componente = new InterceptadorCronometro(new InterceptadorMinuto(concreto));
		componente.executarTarefa();
	}
}
