package ebys;
import static org.junit.Assert.*;

import java.util.Hashtable;

import org.junit.Before;
import org.junit.Test;

public class OgretimGorevlisiTest {
	
	 private Ders ders;
	 private Ogretmen ogretmen;
	 private Hashtable<String, Double> yuzdeList;

	@Before
	public void SetUp(){
		ders= new Ders(05223,"Test Driven Development","Oðuz Dikenelli");
		ogretmen = new Ogretmen(551664,"Oðuz DÝKENELLÝ");
		yuzdeList=new Hashtable<String, Double>();
	}
       @Test
        public void YuzdeBelirleme() {
            
            ogretmen.verilenDers(ders);
            ogretmen.dersProjesi(ders,false,0);
            ders.setYuzdeList(yuzdeList);
            ogretmen.dersYuzdeBelirle(ders,0.4,"vize");
           
            assertEquals(0.4,yuzdeList.get("vize"), 0.0002);
        }
        

}
