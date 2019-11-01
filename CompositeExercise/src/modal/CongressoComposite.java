package modal;

import java.util.ArrayList;
import java.util.List;

public class CongressoComposite extends Congresso {
	
	List<Participante> participantes = new ArrayList<Participante>();
	
	private int totalAssentos;
	
	public CongressoComposite() {
		super();
	}
	
	public void adicionar(Participante p) {
		if (totalAssentos > 0) {	
			if (p.getMembros() == null) {
				System.out.println("Participante adicionado");
				participantes.add(p);
				totalAssentos--;				
			} else {
				int membros = p.getMembros().size();
				if (membros <= totalAssentos) {
					System.out.println("Participante adicionado");
					participantes.add(p);
					totalAssentos -= membros;	
				}
			}
		}
	}
	
	public void totalParticipantes() {
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
	
	public void setTotalAssentos(int total) {
		this.totalAssentos = total;
	}

	
	public void totalAssentos() {
		System.out.println("Total de assentos restantes: "+ this.totalAssentos);
	}
	
	
}
