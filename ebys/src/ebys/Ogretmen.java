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

    public boolean DersAra(String dersAdi){
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
                    ders.setProjeYuzdesi(projeYuzdesi);
                else
                    ders.setProjeYuzdesi(0);
            }
        }
    }

    public void verilenDers(Ders ders) {
        dersList.add(ders);
    }

    public void vizeYuzdeBelirle(Ders ders, double v) {
        for(Ders d:dersList){
            if(d.getDersAdi()==ders.getDersAdi()){
                ders.setVizeYuzdesi(v);
            }
        }
    }

    public void finalYuzdeBelirle(Ders ders, double v) {
        for(Ders d:dersList){
            if(d.getDersAdi()==ders.getDersAdi()){
                ders.setFinalYuzdesi(v);
            }
        }
    }
}
