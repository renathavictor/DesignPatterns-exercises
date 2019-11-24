package model;

import java.util.Date;
import java.text.DateFormat;

public class InterceptadorLog implements Componente {

	private Componente componente;
		
	private DateFormat dataHoraAtual = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.MEDIUM);

	public InterceptadorLog(Componente componente) {
		this.componente = componente;
	}
	
	@Override
	public void executarTarefa() {
		System.out.println("Interceptador Log");
		System.out.println(dataHoraAtual.format(new Date(System.currentTimeMillis())) + ": tarefa vai ser executada");
		componente.executarTarefa();

	}

}
