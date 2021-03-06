package com.twitter;
import java.util.LinkedList;
import com.twitter.poruke.TwitterPoruka;
/**
 * Ova Klasa predstavlja sve Twitter Poruke i osnovne metode nad njima
 * @author Dusica
 * @version 1.1
 */

public class Twitter {
	/**
	 * Lista twitter poruka
	 */
	private LinkedList<TwitterPoruka> poruke =
			new LinkedList<TwitterPoruka>();
	/**
	 * Metoda koja vraca sve twitter poruke.
	 * @return twitter poruke kao listu
	 */
	public LinkedList<TwitterPoruka> vratiSvePoruke(){
		return poruke;
	}
	/**
	 * Metoda kojom se pravi nova poruka i unosi na kraj liste.
	 * @param korisnik ime korisnika
	 * @param poruka teskt poruke
	 */
	public void unesi(String korisnik, String poruka) {
		//Pravi se nova poruka i puni podacima.
		TwitterPoruka tp = new TwitterPoruka();
		tp.setKorisnik(korisnik);
		tp.setPoruka(poruka);
		//Poruka se unosi u listu na kraj
		poruke.addLast(tp);
	}
	/**
	 * Metoda koja vraca niz poruka sa unetim parametrima.
	 * @param maxBroj kapacitet niza, broj poruka koje treba da vrati
	 * @param tag tag koji treba da sadrzi poruka
	 * @return poruke kao niz
	 * @throws java.lang.RuntimeException ako je unet nula ili prazan String
	 */
	public TwitterPoruka[] vratiPoruke(int maxBroj, String tag) {
		 if (tag==null || tag.isEmpty())
			throw new RuntimeException("Morate uneti tag");
		//Ako je maxBroj <=0, vraca maxBroj se postavlja na 100 poruka
		if (maxBroj<=0)
			maxBroj = 100;
		//Pomocna promenljiva koja predstavlja brojac upisanih poruka
		int brojac = 0;
		//Pomocni niz koja predstavlja rezultat pretrage tj. sadrzace
		//sve poruke koje u sebi imaju zadati tag
		TwitterPoruka[] rezultat = new TwitterPoruka[maxBroj];
		//Pretrazuju se poruke i traze se one koje sadrze tag.
		//Ako se nadje neka takva, i ako nije prekoracen maxBroj
		//ona se upisuje u niz. Ako je prekoracen maxBroj,pretraga
		//se prekida.
		for (int i = 0; i < poruke.size(); i++)
			if (poruke.get(i).getPoruka().indexOf(tag)!=-1)
				if (brojac < maxBroj){
					rezultat[brojac]=poruke.get(i);
					brojac++;
				}
				else break;
		return rezultat;
	}
} 