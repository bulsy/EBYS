package ebys.Test;
import ebys.*;

import static org.junit.Assert.*;

import java.util.Hashtable;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*; 

public class OgretimGorevlisiTest {
	
	 private Ders ders;
	 private Ogretmen ogretmen;
	 private Hashtable<NotTip, Double> yuzdeList;
     private List SpyDersListesi;
	@Before
	public void SetUp(){
		ders= new Ders(05223,"Test Driven Development","Oðuz Dikenelli");
		ogretmen = new Ogretmen(551664,"Oðuz DÝKENELLÝ");
		yuzdeList=new Hashtable<NotTip, Double>();
		SpyDersListesi= spy(List.class);
		stub(SpyDersListesi.size()).toReturn(5);
	}
       @Test
        public void YuzdeBelirleme() {
            
            ogretmen.verilenDers(ders);
            ogretmen.dersProjesi(ders,false,0);
            ders.setYuzdeList(yuzdeList);
            ogretmen.dersYuzdeBelirle(ders,0.4,NotTip.VIZE);
            assertEquals(0.4,yuzdeList.get(NotTip.VIZE), 0.0002);
        }
       @Test
       public void OgretmeninDersSayýsý(){
    	   assertEquals(5, SpyDersListesi.size());
       }

}