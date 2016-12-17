package ebys;
import static org.junit.Assert.*;
import org.junit.Test;


public class OgrenciBilgileriTest {
    @Test
    public void DerseKayitlanma() {
        Ogrenci ogrenci = new Ogrenci(0513247,"Bilge ULUSAY");
        Ders ders= new Ders(05223,"SOFTWARE ENGINEERING");
        ogrenci.DersSec(ders);
        //	ders.ogrenciEkle(ogrenci);
        assertTrue(ogrenci.DersAra(ders.getDersAdi()));
        //   assertTrue(ogrenci.DersAra("Test Development"));
    }

    @Test
    public void ogrenciNotGoruntuleme(){
        Ders ders= new Ders(05223,"SOFTWARE ENGINEERING");
        Ogrenci ogrenci = new Ogrenci(0513247,"Bilge ULUSAY");

        ogrenci.DersSec(ders); //dersi ekliyoruz.
        ogrenci.vizeNotu(ders,70);
        ogrenci.projeNotu(ders,80);
        ogrenci.finalNotu(ders,50);

        assertEquals(70,ogrenci.vizeNotuGoruntule(ders));
        assertEquals(80,ogrenci.projeNotuGoruntule(ders));
        assertEquals(50,ogrenci.finalNotuGoruntule(ders));
    }

    @Test
    public void DonemSonuNotGoruntuleme(){
        Ders ders= new Ders(05223,"SOFTWARE ENGINEERING");
        Ogrenci ogrenci = new Ogrenci(0513247,"Bilge ULUSAY");

        ogrenci.DersSec(ders); //dersi ekliyoruz.
        ders.setProjeYuzdesi(0.1f);
        ders.setVizeYuzdesi(0.3f);
        ders.setFinalYuzdesi(0.6f);


        ogrenci.vizeNotu(ders,70);
        ogrenci.projeNotu(ders,80);
        ogrenci.finalNotu(ders,50);

        assertEquals(59,(int)ogrenci.donemSonuNotu(ders));
       
    }

    @Test
    public void harfNotuGoruntuleme()
    {
        Ders ders= new Ders(05223,"SOFTWARE ENGINEERING");
        Ogrenci ogrenci = new Ogrenci(0513247,"Bilge ULUSAY");
        ogrenci.DersSec(ders); //dersi ekliyoruz.

        ders.setProjeYuzdesi(0.1f);
        ders.setVizeYuzdesi(0.3f);
        ders.setFinalYuzdesi(0.6f);

        ogrenci.vizeNotu(ders,70);
        ogrenci.projeNotu(ders,80);
        ogrenci.finalNotu(ders,50);

        ogrenci.donemSonuNotu(ders);

        assertEquals("CB",(String)ogrenci.harfNotu(ders));

    }
}
