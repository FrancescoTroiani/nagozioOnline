package org.generation.italy;

import java.util.HashMap;

public class Negozio {
	HashMap <String,Prodotto> elencoProdotti = new HashMap <>();
	
	public Negozio() {
		elencoProdotti.put("1", new Prodotto("1","maglietta",10.5f,5f,2));
		elencoProdotti.put("2", new Prodotto("2","felpa",15.5f,15f,3));
		elencoProdotti.put("3", new Prodotto("3","cappello",5f,10f,4));
		elencoProdotti.put("4", new Prodotto("4","pigiama",25.5f,15f,2));
		elencoProdotti.put("5", new Prodotto("5","pantaloni",20f,5f,1));
		}
	
	public void elencoProdotti() {
		for(String n : elencoProdotti.keySet())
			System.out.println(n+ " "+elencoProdotti.get(n).getDescrizione()+" "+elencoProdotti.get(n).getPrezzo()+"Ä "+elencoProdotti.get(n).getSconto()+"% "+elencoProdotti.get(n).getQuantit‡Disponibile()+" unit‡");	
		}
	public void sceltaProdotto(String codiceProdotto, int quantita) {
		if (elencoProdotti.containsKey(codiceProdotto)) 
		{
			if (elencoProdotti.get(codiceProdotto).getQuantit‡Disponibile()-quantita>=0) 
			{
						elencoProdotti.get(codiceProdotto).setQuantit‡Disponibile(quantita);
						System.out.println("Hai selezionato "+elencoProdotti.get(codiceProdotto).getDescrizione());
						System.out.println(codiceProdotto+ " "+elencoProdotti.get(codiceProdotto).getDescrizione()+" "+elencoProdotti.get(codiceProdotto).getPrezzo()+"Ä "+elencoProdotti.get(codiceProdotto).getSconto()+"% "+quantita+" unit‡");
			}else 
				System.out.println("quantit‡ non disponibile");
		}
		else 
			System.out.println("codice errato");
	}
}
