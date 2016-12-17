package ebys;
import java.util.*;

public class Ogrenci {


    private int ogrenciNo;
    private String adSoyad;
    
    
    LinkedList<Ders> dersList;

    public Ogrenci(int ogrenciNo, String adSoyad) {
        super();
        this.ogrenciNo = ogrenciNo;
        this.adSoyad = adSoyad;
        dersList= new LinkedList<Ders>();

    }

    public void DersSec(Ders ders){
        dersList.add(ders);
    }
    public boolean DersAra(String dersAdi){
        for (Ders d : dersList){
            if (d.getDersAdi()==dersAdi)
                return true;
        }
        return false;
    }
    public void vizeNotu(Ders ders, int vizeNotu){
        for(Ders d:dersList){
            if(d.getDersAdi()==ders.getDersAdi()){
                ders.setVizeNotu(vizeNotu);
            }
        }
    }
    public void projeNotu(Ders ders, int projeNotu){
        for(Ders d:dersList){
            if(d.getDersAdi()==ders.getDersAdi()){
                ders.setProjeNotu(projeNotu);
            }
        }
    }
    public void finalNotu(Ders ders, int finalNotu){
        for(Ders d:dersList){
            if(d.getDersAdi()==ders.getDersAdi()){
                ders.setFinalNotu(finalNotu);
            }
        }
    }
    public int vizeNotuGoruntule(Ders ders){
        int vizeNotu = 0;
        for(Ders d:dersList){
            if(d.getDersAdi()==ders.getDersAdi()){
                vizeNotu=ders.getVizeNotu();
            }
        }
        return vizeNotu;
    }

    public int projeNotuGoruntule(Ders ders){
        int projeNotu = 0;
        for(Ders d:dersList){
            if(d.getDersAdi()==ders.getDersAdi()){
                projeNotu=ders.getProjeNotu();
            }
        }
        return projeNotu;
    }

    public int finalNotuGoruntule(Ders ders){
        int finalNotu = 0;
        for(Ders d:dersList){
            if(d.getDersAdi()==ders.getDersAdi()){
                finalNotu=ders.getFinalNotu();
            }
        }
        return finalNotu;
    }

    public double donemSonuNotu(Ders ders) {
            for(Ders d:dersList){
                if(d.getDersAdi()==ders.getDersAdi()){
                    return  ders.getDonemSonuNotu();
                }
            }
            return 0;
    }
    public String harfNotu(Ders ders) {
        for(Ders d:dersList){
            if(d.getDersAdi()==ders.getDersAdi()){
                return  ders.getHarfNotu();
            }
        }
        return null;
    }
}

