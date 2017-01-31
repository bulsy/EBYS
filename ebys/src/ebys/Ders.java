package ebys;
import java.util.*;

public class Ders {
    private String dersAdi;
    private String ogretmen;
    private int dersKodu;
    private Yuzde yuzde;
    private List<KayitliDers> Kayitlilarlist;


    public Ders(int dersKodu, String dersAdi,String ogretmen) {
        this.dersKodu = dersKodu;
        this.dersAdi = dersAdi;
        this.ogretmen= ogretmen;
        this.yuzde=new Yuzde();
        this.Kayitlilarlist= new ArrayList<KayitliDers>();

    }
    public Yuzde getYuzde() {
        return yuzde;
    }
	public int getDersKodu() {
        return dersKodu;
    }
    public void setDersKodu(int dersKodu) {
        this.dersKodu = dersKodu;
    }
	public String getDersAdi() {
		return dersAdi;
	}
	public void setDersAdi(String dersAdi) {
		this.dersAdi = dersAdi;
	}
    public void yuzdeBelirle(Yuzde yuzde){
		  this.yuzde=yuzde;
	  }
    public List<KayitliDers> getKayitlilarlist() {
        return Kayitlilarlist;
    }
    public void kayitliDersEkle(KayitliDers ders){
        Kayitlilarlist.add(ders);
    }
}
