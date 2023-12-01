package org.generation.italy;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*Scrivere un programma che simula il funzionamento di un negozio online.

		Le funzionalit� da realizzare sono:

		Inserimento prodotto: consente di inserire i dati di un nuovo prodotto al negozio. Ogni prodotto � caratterizzato da:
		codice (String): codice identificativo del prodotto (non � possibile inserire due prodotti con lo stesso codice)
		Descrizione (String)
		Prezzo (float)
		Sconto (float): percentuale di sconto da applicare eventualmente al prodotto (di default 0)
		Quantit� disponibile
		Elenco prodotti: per ogni prodotto vengono visualizzate le informazioni
		Applica sconto: si inserisce il codice di un prodotto e la percentuale di sconto da applicare
		Vendita prodotti:
		si chiede all'utente di scegliere un prodotto dall'elenco (inserendo il codice);
		si visualizzano le informazioni del prodotto scelto;
		si chiede la quantit� da acquistare;
		se la quantit� disponibile � sufficiente, il prodotto si aggiunge al "carrello della spesa" applicando eventuali sconti 
		(in questo caso mostrare sia il prezzo originale che il prezzo scontato)
		si visualizza il carrello attuale
		si chiede se si vuole procedere all'acquisto (in caso positivo si mostra il totale e si aggiornano le quantit� disponibili)*/
		
		Scanner sc = new Scanner(System.in);
		String codiceProdotto, risposta;
		int quantita;
		Negozio negozio = new Negozio();
		do 
		{
			negozio.elencoProdotti();
			System.out.println("Scegli un prodotto dall'elenco");
			codiceProdotto=sc.nextLine();
			System.out.println("Scegli la quantit�");
			quantita=Integer.parseInt(sc.nextLine());
			negozio.sceltaProdotto(codiceProdotto,quantita);
			System.out.println("\n\n\n\n");
		} while(true);
		

	}

}
