package ebys;
import java.util.*;

public class Ogrenci {
  
	private int ogrenciNo;
    private String adSoyad;
    
    List<Ders> dersList;
    
    public Ogrenci(int ogrenciNo, String adSoyad) {
        super();
        this.ogrenciNo = ogrenciNo;
        this.adSoyad = adSoyad;
        dersList= new LinkedList<Ders>();

    }
    public int getOgrenciNo() {
  		return ogrenciNo;
  	}
  	public void setOgrenciNo(int ogrenciNo) {
  		this.ogrenciNo = ogrenciNo;
  	}
  	public String getAdSoyad() {
  		return adSoyad;
  	}
  	public void setAdSoyad(String adSoyad) {
  		this.adSoyad = adSoyad;
  	}
    public List<Ders> getDersList() {
		return dersList;
	}
	public void setDersList(List<Ders> dersList) {
		this.dersList = dersList;
	}
	public void dersEkle(Ders ders){
        dersList.add(ders);
    }
    public boolean dersAra(String dersAdi){
        for (Ders d : dersList){
            if (d.getDersAdi()==dersAdi)
                return true;
        }
        return false;
    }
 
}

