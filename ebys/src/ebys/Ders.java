package ebys;
import java.util.*;

public class Ders {
    private String dersAdi;
    private String ogretmen;
    private int dersKodu; 
    
    Hashtable<String, Integer> NotList;
    Hashtable<String,Double> YuzdeList;
    
    public Ders(int dersKodu, String dersAdi,String ogretmen) {
        this.dersKodu = dersKodu;
        this.dersAdi = dersAdi;
        this.ogretmen= ogretmen;
        NotList=new Hashtable<String, Integer>();
        YuzdeList=new Hashtable<String, Double>();      
    }
    public Hashtable<String, Integer> getNotList() {
		return NotList;
	}
	public void setNotList(Hashtable<String, Integer> notList) {
		NotList = notList;
	}
    public Hashtable<String, Double> getYuzdeList() {
		return YuzdeList;
	}
	public void setYuzdeList(Hashtable<String, Double> yuzdeList) {
		YuzdeList = yuzdeList;
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
	  public void NotEkle(int dersnot, String type){
	    	NotList.put(type, dersnot);
	  }
	  public void yuzdeBelirle(double dersyuzde, String type){
		  YuzdeList.put(type,dersyuzde);
	  }
}
