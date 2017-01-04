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
    public boolean dersAra(String dersAdi){
        for (Ders d : dersList){
            if (d.getDersAdi()==dersAdi)
                return true;
        }
        return false;
    }
    public void dersProjesi(Ders ders,boolean b, double projeYuzdesi) {
        for(Ders d:dersList){
            if(d.getDersAdi()==ders.getDersAdi()){
                if(b=true)
                	  ders.yuzdeBelirle(projeYuzdesi, "proje");
                else
                	  ders.yuzdeBelirle(0, "proje");
            }
        }
    }
    public void verilenDers(Ders ders) {
        dersList.add(ders);
    }
    public void dersYuzdeBelirle(Ders ders, double dersyuzde, String type) {
        for(Ders d:dersList){
            if(d.getDersAdi()==ders.getDersAdi()){
                ders.yuzdeBelirle(dersyuzde, type);
            }
        }
    }
  
}
