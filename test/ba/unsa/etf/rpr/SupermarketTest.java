package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;
import ba.unsa.etf.rpr.Supermarket;
import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {


    @Test
    void testDodajArtikl() {
        Supermarket s=new Supermarket();
        s.dodajArtikl(new Artikl("Biciklo", 1000, "1"));
        assertEquals( 1, s.getVelicina());

    }

    @Test
    void getArtikli() {
    }

    @Test
    void izbaciArtiklSaKodom() {
    }


}