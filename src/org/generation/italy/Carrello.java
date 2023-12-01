package org.generation.italy;

import java.util.ArrayList;

public class Carrello {
	private ArrayList<Prodotto> a =new ArrayList<>();	
	
	public boolean richiesta(boolean scelta) {
		return scelta;
	}
	public void aggiungi(Prodotto elemento) {
		a.add(elemento);
		
	}
}

