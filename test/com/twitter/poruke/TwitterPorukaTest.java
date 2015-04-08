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
	public void testToString() {
		twp.setKorisnik("Bob");
		twp.setPoruka("blabla");
		assertEquals("KORISNIK:"+twp.getKorisnik()+" PORUKA:"+twp.getPoruka(), twp.toString());
	}
}