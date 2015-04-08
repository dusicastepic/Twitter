package com.twitter;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.twitter.poruke.TwitterPoruka;

public class TwitterTest {
	Twitter t;

	@Before
	public void setUp() throws Exception {
		t = new Twitter();
	}

	@After
	public void tearDown() throws Exception {
		t = null;
	}

	@Test
	public void testVratiSvePoruke() {
		t.unesi("Mile", "Zdravo");
		assertEquals("Mile", t.vratiSvePoruke().get(0).getKorisnik());
		assertEquals("Zdravo", t.vratiSvePoruke().get(0).getPoruka());
	}

	@Test
	public void testUnesi() {
		t.unesi("Marija", "Hola");
		TwitterPoruka poruka = new TwitterPoruka();
		poruka.setKorisnik("Marija");
		poruka.setPoruka("Hola");
		assertEquals("Marija", t.vratiSvePoruke().get(0).getKorisnik());
		assertEquals("Hola", t.vratiSvePoruke().get(0).getPoruka());
		
		
	}

	@Test
	public void testVratiPoruke() {
		
		TwitterPoruka poruka1 = new TwitterPoruka();
		TwitterPoruka poruka2 =  new TwitterPoruka();
		poruka1.setKorisnik("Igor");
		poruka1.setPoruka("Zdravo");
		t.unesi("Igor", "Zdravo");
		poruka2.setKorisnik("Sanja");
		poruka2.setPoruka("Cao");
		t.unesi("Sanja", "Cao");
		assertEquals(poruka1.toString() ,t.vratiPoruke(2, "Zdravo")[0].toString());
	}

}
