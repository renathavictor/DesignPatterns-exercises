package model;

import java.util.HashMap;

public class MapAdapter extends HashMap<Object, Object> {

	private static final long serialVersionUID = 1L;

	public MapAdapter(Object[][] matriz) {

		if (matriz.length == 2) {
			for (int i = 0; i < matriz[0].length; i++) {
				put(matriz[0][i], matriz[1][i]);
			}			
		} else {
			System.out.println("Quantidade de linhas invalidas.");
		}
	}
}
