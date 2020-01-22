package view;

import model.cenario.Cenario;
import model.cenario.CenarioFactory;
import model.dispositivo.CorAmarelaDecorator;
import model.dispositivo.Dispositivo;
import model.dispositivo.Luz;
import observer.CenarioObserver;
import observer.CenariosSubject;
import observer.TabelaObserver;

public class SmartHome {

	public static void main(String[] args) {
					
		CenarioFactory fabrica = new CenarioFactory();
				
		Cenario cenario1 = fabrica.montarCenario("Basico", "simples");
		//System.out.println(cenario1.sobreCenario());
		
		Cenario cenario2 = fabrica.montarCenario("Festa", "especial");
		
		// SETAR DISPOSITIVO
		Dispositivo dispositivo = new Luz();
		dispositivo = new CorAmarelaDecorator(dispositivo);
		//System.out.println(dispositivo.sobreDispositivo());
		
		//System.out.println(dispositivo.imprimir());
		
		// ADICIONAR DISPOSITIVO AO CENÁRIO
		cenario2.addDispositivos(dispositivo);
		
		System.out.println();
		// DEPOIS DE ADICIONADO UM DISPOSITIVO NO CENARIO
		System.out.println(cenario2.sobreCenario());
		
		System.out.println();
		System.out.println(" ---- DISPOSITIVOS DO CENÁRIO ESPECIAL ----\n");
		for (Dispositivo d : cenario2.getDispositivos()) {
			System.out.println(d.imprimir());			
		}

	}
}

