package com.twitter.poruke;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TwitterPorukaTest {

	private TwitterPoruka twp;

	@Before
	public void setUp() throws Exception {
		twp = new TwitterPoruka();
	}

	@After
	public void tearDown() throws Exception {
		twp = null;
	}

	@Test
	public void testSetKorisnik() {
		twp.setKorisnik("Dusica");
		assertEquals("Dusica",twp.getKorisnik());

	}
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetKorisnikNaNull() {
		twp.setKorisnik(null);

	}
	@Test  (expected = java.lang.RuntimeException.class)
	public void testSetPrazanKorisnik() {
		twp.setKorisnik("");

	}
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPorukaNaNull() {
		twp.setPoruka(null);
	}


	@Test
	public void testSetPoruka(){
		twp.setPoruka("Don't worry be happy! :) ");
		assertEquals("Don't worry be happy! :) ", twp.getPoruka());
	}
	
	@Test
	public void testSetPraznaPoruka(){
		twp.setPoruka("");
	}
	@Test (expected = java.lang.RuntimeException.class)
    public void testSetDuzinaVecaOd140(){
	twp.setPoruka("Knowing that Mrs. Mallard was afflicted with a heart trouble, great care was taken to break to her as gently as possible the news of her husband's death. It was her sister Josephine who told her, in broken sentences; veiled hints that revealed in half concealing. Her husband's friend Richards was there, too, near her. It was he who had been in the newspaper office when intelligence of the railroad disaster was received, with Brently Mallard's name leading the list of . He had only taken the time to assure himself of its truth by a second telegram, and had hastened to forestall any less careful, less tender friend in bearing the sad message.");
}

	@Test
	public void testToString() {
		twp.setKorisnik("Bob");
		twp.setPoruka("blabla");
		assertEquals("KORISNIK:"+twp.getKorisnik()+" PORUKA:"+twp.getPoruka(), twp.toString());
	}
}