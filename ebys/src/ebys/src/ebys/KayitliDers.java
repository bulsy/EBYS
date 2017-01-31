package ebys;

import java.util.Hashtable;

public class KayitliDers {
     private Ogrenci ogrenci;
     private Ders ders;
     private Not not;


	public KayitliDers(){
    	 this.ogrenci=null;
    	 this.ders=null;
    	 this.not=new Not();
     }
     public KayitliDers(Ogrenci ogrenci,Ders ders){
    	 this.ogrenci=ogrenci;
    	 this.ders=ders;
    	 this.not=new Not();
     }
	public Ogrenci getOgrenci() {
		return ogrenci;
	}
	public void setOgrenci(Ogrenci ogrenci) {
		this.ogrenci = ogrenci;
	}
	public Ders getDers() {
		return ders;
	}
	public void setDers(Ders ders) {
		this.ders = ders;
	}
	public Not getNot() {
		return not;
	}
	public void setNot(Not not) {
		this.not = not;
	}

}
