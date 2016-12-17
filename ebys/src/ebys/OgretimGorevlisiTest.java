package ebys;
import static org.junit.Assert.*;
import org.junit.Test;

public class OgretimGorevlisiTest {

        @Test
        public void dersNotlariniBelirleme() {
            Ogretmen ogretmen=new Ogretmen(0107,"Oðuz Dikenelli");
            Ders ders= new Ders(05223,"SOFTWARE ENGINEERING");
            Ogrenci ogrenci = new Ogrenci(0513247,"Bilge ULUSAY");

            ogretmen.verilenDers(ders);
            ogretmen.dersProjesi(ders,false,0);
            ogretmen.vizeYuzdeBelirle(ders,0.4);
            ogretmen.finalYuzdeBelirle(ders,0.6);

            ogrenci.DersSec(ders);
            ogrenci.vizeNotu(ders,70);
            ogrenci.projeNotu(ders,0);
            ogrenci.finalNotu(ders,50);

            assertEquals(58, (int)ogrenci.donemSonuNotu(ders));
        }
}
