package ba.unsa.etf.rpr;
import java.util.*;

public class Supermarket {
    private Artikl[] art=new Artikl[1000];
    public void dodajArtikl(String naziv, double cijena, int kod){
        art.add(new Artikl(naziv,cijena, kod));

    }
    public void dodajArtikl(Artikl a){

    }
    public Artikl [] getArtikli(){


    }

    public Artikl izbaciArtiklSaKodom(int kod){

    }




}
