package ba.unsa.etf.rpr;

import static org.junit.jupiter.api.Assertions.*;

class ArtiklTest {

    @org.junit.jupiter.api.Test
    void getNaziv() {
        Artikl a=new Artikl("brasno", 20, "1");
        assertEquals("brasno", a.getNaziv());
    }



    @org.junit.jupiter.api.Test
    void getCijena() {
        Artikl a=new Artikl("brasno", 20, "1");
        assertEquals(20, a.getCijena());
    }



    @org.junit.jupiter.api.Test
    void getKod() {
        Artikl a=new Artikl("brasno", 20, "1");
        assertEquals("1", a.getKod());
    }
}