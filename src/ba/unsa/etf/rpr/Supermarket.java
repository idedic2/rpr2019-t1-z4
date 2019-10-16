package ba.unsa.etf.rpr;
import java.util.*;

public class Supermarket {

    private int velicina;
    private int kapacitet=1000;
    private Artikl[] art=new Artikl[kapacitet];
    public Supermarket(){
        velicina=0;
        art=new Artikl[kapacitet];
    }
    public void dodajArtikl(String naziv, double cijena, String kod){
        if(velicina>=kapacitet)throw new ArrayIndexOutOfBoundsException("Nema prostora");
        art[velicina++]=new Artikl(naziv,cijena, kod);

    }
    public void dodajArtikl(Artikl a){
        if(velicina>=kapacitet)throw new ArrayIndexOutOfBoundsException("Nema prostora");
        art[velicina++]=a;


    }
    public Artikl [] getArtikli(){
        return art;

    }

    public Artikl izbaciArtiklSaKodom(String kod){
        Artikl artiklSKodom=null;
          for(int i=0;i<velicina;i++){
              if(art[i].getKod()==kod){
                  artiklSKodom=art[i];
                  art[i]=null;
                  velicina--;
              }
          }
          return artiklSKodom;
    }

}
