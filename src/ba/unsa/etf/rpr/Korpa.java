package ba.unsa.etf.rpr;

public class Korpa {
public int kapacitet=50;
public int velicina;
public Artikl [] artikli=new Artikl[kapacitet];

public Korpa(){
    velicina=0;
    artikli=new Artikl[kapacitet];
}

    public int getVelicina() {
        return velicina;
    }

    public Boolean dodajArtikl(Artikl a){
  if(velicina>=kapacitet)return false;
  artikli[velicina++]=a;
  return true;

}
public Artikl [] getArtikli(){
       return artikli;
}
public Artikl izbaciArtiklSaKodom(String kod){
    Artikl artiklSKodom=null;
    for(int i=0;i<velicina;i++){
        if(artikli[i].getKod()==kod){
            artiklSKodom=artikli[i];
            artikli[i]=null;
            velicina--;
        }
    }
    return artiklSKodom;
}
public int dajUkupnuCijenuArtikala(){
 int sumaCijena=0;
 for(Artikl a: artikli){
     sumaCijena+=a.getCijena();
 }
 return sumaCijena;
}


}
