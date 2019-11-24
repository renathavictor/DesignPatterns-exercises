package model;

public class InterceptadorCronometro implements Componente {

	private Componente componente;
	
	public InterceptadorCronometro(Componente componente) {
		this.componente = componente;
	}
	
	@Override
	public void executarTarefa() {
		System.out.println("Interceptador Cronometro");

		long antes = System.currentTimeMillis();
		componente.executarTarefa();
		long depois = System.currentTimeMillis();
		System.out.println((depois - antes) + " ms");
	}

}
