package com.twitter.poruke;
/**
 * Ova Klasa predstavlja Twitter poruku
 * @author Dusica
 * @version 1.1
 */
public class TwitterPoruka {
	/**
	 * Naziv korisnika
	 */
	private String korisnik;
	/**
	 * Tekst twitter poruke
	 */
	private String poruka;
	/**
	 * *
	 * metoda koja vraca ime korisnika.
	 @return naziv korisnika vraca kao String.	
	 */
	public String getKorisnik() {
	return korisnik;
	}
	/**
	 * metoda koja postavlja ime korisnika na unetu vrednost.
	 * @param korisnik naziv korisnika
	 * @throws java.lang.RuntimeException ako je ime korisnika prazan ili null String.
	 */
	public void setKorisnik(String korisnik) {
	if (korisnik==null || korisnik.equals(""))
	throw new RuntimeException(
	"Ime korisnika mora biti uneto");
	this.korisnik = korisnik;
	}
	/**
	 * Metoda koja vraca poruku korisnika
	 * @return poruku kao String
	 */
	public String getPoruka() {
	return poruka;
	}
	/**
	 * Metoda koja postavlja tekst poruke na unetu vrednost.
	 * @param poruka novi tekst poruke
	 * @throws java.lang.RuntimeException ako je null ili ako ima vise od 140 karaktera.
	 */
	public void setPoruka(String poruka) {
	if (poruka==null || poruka.length()>140)
	throw new RuntimeException(
	"Poruka mora biti uneta i mora imati najvise 140 znakova");
	this.poruka = poruka;
	}
	/**
	 * Metoda koja vraca ime korisnika i tekst poruke
	 */
	public String toString(){
	return "KORISNIK:"+korisnik+" PORUKA:"+poruka;
	} 

}
