package visao;

import modelo.AppEscritorio;
import modelo.AppEscritorioFabrica;
import modelo.EditorApresentacaoFabrica;
import modelo.EditorPlanilhaFabrica;
import modelo.EditorTextoFabrica;

public class Cliente {

	public static void main(String[] args) {

		AppEscritorioFabrica editorTexto = new EditorTextoFabrica();		
		AppEscritorio appt = editorTexto.criarApp();
		System.out.println(appt.exibirInfo());
		
		
		
		AppEscritorioFabrica editorPlanilha = new EditorPlanilhaFabrica();
		AppEscritorio appP = editorPlanilha.criarApp();
		System.out.println(appP.exibirInfo());
		
		
		AppEscritorioFabrica editorApresentacao = new EditorApresentacaoFabrica();
		AppEscritorio appA = editorApresentacao.criarApp();
		System.out.println(appA.exibirInfo());

	}

}
