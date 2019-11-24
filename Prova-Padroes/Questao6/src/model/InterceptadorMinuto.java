package model;

import java.util.Calendar;
import java.util.Date;

public class InterceptadorMinuto implements Componente {

	private Componente componente;
		
	public InterceptadorMinuto(Componente componente) {
		this.componente = componente;
	}
	
	@Override
	public void executarTarefa() {
		System.out.println("Interceptador Minuto");
		Date data = new Date(System.currentTimeMillis());
		Calendar calendario = Calendar.getInstance();
		
		calendario.setTime(data);
		int minuto = calendario.get(Calendar.MINUTE);
		
		if ((minuto % 2) == 0) {
			System.out.println("Execucao interrompida em minuto par: " + data);
		} else {
			componente.executarTarefa();			
		}

	}

}
