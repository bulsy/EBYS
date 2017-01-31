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
    public Ders dersAra(String dersAdi){
        for (Ders d : dersList){
            if (d.getDersAdi()==dersAdi)
                return d;
        }
        return null;
    }
    public void dersEkle(Ders ders){
        dersList.add(ders);
    }
    public void verilenDers(Ders ders) {
        dersList.add(ders);
    }
}
