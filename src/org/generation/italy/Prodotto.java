package org.generation.italy;

public class Prodotto {
	/*codice (String): codice identificativo del prodotto (non Ë possibile inserire due prodotti con lo stesso codice)
	Descrizione (String)
	Prezzo (float)
	Sconto (float):
	*/
Prodotto (String codice, String descrizione, float prezzo, float sconto, int quantit‡Disponibile)
{
	this.codice=codice;
	this.descrizione=descrizione;
	this.prezzo=prezzo;
	this.sconto=sconto;
	this.quantit‡Disponibile=quantit‡Disponibile;
}
	
private	String codice, descrizione;							
private	float prezzo,sconto;
private int quantit‡Disponibile;


public float getSconto() {
	return sconto;
}
public void setSconto(float sconto) {
	this.sconto = sconto;
}
public String getCodice() {
	return codice;
}
public void setCodice(String codice) {
	this.codice = codice;
}
public String getDescrizione() {
	return descrizione;
}
public void setDescrizione(String descrizione) {
	this.descrizione = descrizione;
}
public float getPrezzo() {
	return prezzo;
}
public void setPrezzo(float prezzo) {
	this.prezzo = prezzo;
}
public int getQuantit‡Disponibile() {
	return quantit‡Disponibile;
}
public void setQuantit‡Disponibile(int quantit‡) {
	quantit‡Disponibile-=quantit‡;
}
public void ApplicaSconto (String codice,float perc) 
	{
	if (codice.equals(this.codice))
		this.prezzo=prezzo-(prezzo*perc/100);
	}

}

