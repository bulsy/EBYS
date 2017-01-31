package ebys;
import java.sql.SQLException;
import java.util.*;

public class Ogrenci {
  
	private int ogrenciNo;
    private String adSoyad;
    List<KayitliDers> dersList;

    public Ogrenci(int ogrenciNo, String adSoyad) {
        super();
        this.ogrenciNo = ogrenciNo;
        this.adSoyad = adSoyad;
        dersList= new ArrayList<KayitliDers>();

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
    public List<KayitliDers> getKayitliDersList() {
		return dersList;
	}
	public void setKayitliDersList(List<KayitliDers> dersList) {
		this.dersList = dersList;
	}
	public void dersEkle(KayitliDers ders){
        dersList.add(ders);
    }
   public boolean dersAra(KayitliDers d)throws ClassNotFoundException, SQLException{
	   return (dersList.contains(d))? true : false;
   }
 
}

