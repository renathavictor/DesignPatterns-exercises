package modal;

import java.util.ArrayList;
import java.util.List;

public class CongressoComposite extends Congresso {
	
	List<Participante> participantes = new ArrayList<Participante>();
	
	public CongressoComposite() {
		super();
	}
	
	public void adicionar(Participante p) {
		System.out.println("Participante adicionado");
		participantes.add(p);
	}
	
	public void totalParticipantes() {}
	
	public void totalAssentos() {
		int total = 0;
		for (Participante participante : participantes) {
			if (participante.getMembros() != null) {
				total += participante.getMembros().size();
			} else {
				total++;
			}
		}
		
		System.out.println("Total de participantes: " + total);
	}
	
	
}
