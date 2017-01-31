package ebys;
import java.util.*;

public class Ogretmen {
    private String dersAdi;
    private int ogretmenNo;
    private String adSoyad;
    LinkedList<Ders> dersList;
    
    public Ogretmen(int ogretmenNo, String adSoyad) {
        super();
        
        this.ogretmenNo = ogretmenNo;
        this.adSoyad = adSoyad;
        dersList= new LinkedList<Ders>();

    }
    public LinkedList<Ders> getDersList(){return this.dersList;}
    public void setDersList(LinkedList<Ders> dersList){
        this.dersList=dersList;
    }
    public int getOgretmenNo(){return this.ogretmenNo;}
    public Ders dersAra(Ders ders){
        for (Ders d : dersList){
            if (d.getDersAdi()==ders.getDersAdi())
                return d;
        }
        return null;
    }
    public void dersEkle(Ders ders){
        dersList.add(ders);
    }
    public void DersGuncelle(Ders ders){
        for (ListIterator<Ders> iter = dersList.listIterator(); iter.hasNext(); ) {
            Ders element = iter.next();
            if(element.getDersKodu()==ders.getDersKodu()){
                dersList.remove(element);
                dersList.add(ders);
            }
        }
    }

}
