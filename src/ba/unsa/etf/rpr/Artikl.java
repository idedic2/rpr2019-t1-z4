package ba.unsa.etf.rpr;
import java.util.*;

public class Artikl {
    private String naziv;
    private double cijena;
    private int kod;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getCijena() {
        return cijena;
    }

    public void setCijena(double cijena) {
        this.cijena = cijena;
    }

    public int getKod() {
        return kod;
    }

    public void setKod(int kod) {
        this.kod = kod;
    }

    public Artikl(String naziv, double cijena, int kod) {
        this.naziv = naziv;
        this.cijena = cijena;
        this.kod = kod;
    }




}
