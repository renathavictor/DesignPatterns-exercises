import java.util.ArrayList;
import java.util.List;

public class Adaptador extends SomadorExistente implements SomadorEsperado {

	public int somaVetor(int[] vetor) {
		List<Integer> arr = new ArrayList<Integer>(vetor.length);
		for (int i : vetor) {
			arr.add(i);
		}
		return somaLista(arr);
	}


}
