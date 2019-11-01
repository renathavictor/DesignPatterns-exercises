package view;

import modal.CongressoComposite;
import modal.Individuo;
import modal.Instituicao;
import modal.Participante;

public class ProgramacaoCongresso {

	public static void main(String[] args) {
		
		CongressoComposite congresso = new CongressoComposite();
		congresso.setTotalAssentos(10);
		
		Participante p1 = new Individuo("participante 1");	
		Participante p2 = new Individuo("participante 2");	
		Participante p3 = new Individuo("participante 3");
		Participante p4 = new Individuo("participante 4");

		Participante i1 = new Instituicao("IFPB");
		i1.addMembros(p1);
		i1.addMembros(p2);
		
		congresso.adicionar(i1);
		congresso.adicionar(p3);
		congresso.adicionar(p4);
		
		congresso.totalParticipantes();
		congresso.totalAssentos();
		
		
	}
}
