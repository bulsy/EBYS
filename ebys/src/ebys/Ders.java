package ebys;
import java.util.*;


public class Ders {
    private String dersAdi;
    private String ogretmen;
    private String harfNotu;
    private int vizeNotu;
    private double vizeNotuYuzdesi;
    private int projeNotu;
    private double projeNotuYuzdesi;

    private float donemiciYuzdesi;
    private int finalNotu;
    private double finalNotuYuzdesi;

    private int dersKodu;

    public Ders(String dersAdi){
        this.dersAdi=dersAdi;
    }

    public Ders(String dersAdi, String ogretmen){
        this.dersAdi=dersAdi;
        this.ogretmen=ogretmen;
    }

    LinkedList<Ogrenci> ogrenciList;

    public Ders(int dersKodu, String dersAdi) {
        super();
        this.dersKodu = dersKodu;
        this.dersAdi = dersAdi;
        ogrenciList = new LinkedList<Ogrenci>();
    }

    public int getDersKodu() {
        return dersKodu;
    }

    public void setDersKodu(int dersKodu) {
        this.dersKodu = dersKodu;
    }

    public void ogrenciEkle(Ogrenci ogrenci){
        ogrenciList.add(ogrenci);

    }

    public float getDonemiciNotu() {
        return (float) (vizeNotu*vizeNotuYuzdesi+projeNotu*projeNotuYuzdesi);
    }

    public int getFinalNotu() {
        return finalNotu;
    }

    public int getProjeNotu() {
        return projeNotu;
    }

    public float getDonemYuzdesi() {
        return donemiciYuzdesi;
    }

    public String getDersAdi() {
        return dersAdi;
    }

    public int getVizeNotu() {
        return vizeNotu;
    }

    public void setFinalNotu(int finalNotu) {
        this.finalNotu = finalNotu;
    }

    public void setVizeNotu(int vizeNotu) {
        this.vizeNotu = vizeNotu;
    }

    public void setProjeNotu(int projeNotu) {
        this.projeNotu = projeNotu;
    }
    public void setProjeYuzdesi(double projeYuzdesi) {
        this.projeNotuYuzdesi=projeYuzdesi;
    }

    public double getFinalNotuYuzdesi() {
        return finalNotuYuzdesi;
    }

    public double getProjeNotuYuzdesi() {
        return projeNotuYuzdesi;
    }

    public double getVizeNotuYuzdesi() {
        return vizeNotuYuzdesi;
    }

    public float hesaplaDonemSonuNotu() {
        return (float) (getVizeNotu()*getVizeNotuYuzdesi()+getProjeNotu()*getProjeNotuYuzdesi()+getFinalNotu()*getFinalNotuYuzdesi());
    }
    public float getDonemSonuNotu(){return hesaplaDonemSonuNotu();}

    public String harfNotuHesapla(){
        if(getDonemSonuNotu()<45)
            harfNotu= "DC";
        else if(getDonemSonuNotu()>=45 && getDonemSonuNotu()<55)
            harfNotu="CC";
        else if(getDonemSonuNotu()>=55 && getDonemSonuNotu()<65)
            harfNotu="CB";
        else if(getDonemSonuNotu()>=65 && getDonemSonuNotu()<75)
            harfNotu="BB";
        else if(getDonemSonuNotu()>=75 && getDonemSonuNotu()<85)
            harfNotu="BA";
        else if(getDonemSonuNotu()>=85)
            harfNotu="AA";
        return harfNotu;
    }

    public String getHarfNotu(){return harfNotuHesapla();}


    public void setVizeYuzdesi(double v) {this.vizeNotuYuzdesi=v;
    }

    public void setFinalYuzdesi(double v) { this.finalNotuYuzdesi=v;
    }
}
