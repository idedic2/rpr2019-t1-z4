package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    void dodajArtikl() {
         Korpa k=new Korpa();
         k.dodajArtikl((new Artikl("ulje", 5, "2")));
         assertEquals(1, k.getVelicina());
    }

    @Test
    void getArtikli() {

    }

    @Test
    void izbaciArtiklSaKodom() {
    }

    @Test
    void dajUkupnuCijenuArtikala() {
    }
}