package model;

public class ComponenteConcreto implements Componente {

	@Override
	public void executarTarefa() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
	}

	
}
