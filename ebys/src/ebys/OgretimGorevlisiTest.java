package ebys;
import static org.junit.Assert.*;

import java.util.Hashtable;

import org.junit.Test;

public class OgretimGorevlisiTest {

       @Test
        public void YuzdeBelirleme() {
            Ogretmen ogretmen=new Ogretmen(0107,"Oðuz Dikenelli");
            Ders ders= new Ders(05223,"Test Driven Development","Oðuz Dikenelli"); // SUT
            Ogrenci ogrenci = new Ogrenci(0513247,"Bilge ULUSAY");
            Hashtable<String, Double> yuzdeList=new Hashtable<String, Double>(); // SUT
            ogretmen.verilenDers(ders);
            ogretmen.dersProjesi(ders,false,0);
            ders.setYuzdeList(yuzdeList);
            ogretmen.dersYuzdeBelirle(ders,0.4,"vize");
           
            assertEquals(0.4,yuzdeList.get("vize"), 0.0002);
        }
        

}
