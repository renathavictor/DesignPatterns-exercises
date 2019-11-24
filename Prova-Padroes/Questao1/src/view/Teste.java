package view;

import java.util.Map;

import model.MapAdapter;

public class Teste {

	public static void main(String[] args) {
		
		Object[][] matriz = new String[][] {{"Col 1", "Col 2", "Col 3"}, {"Um", "Dois", "Tres"}};

		Map<Object, Object> mapa = new MapAdapter(matriz);
		
		for (Object key : mapa.keySet()) {
			System.out.println(key + " => " + mapa.get(key));
		}
	}

}
