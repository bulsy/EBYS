package ebys.Test;
import ebys.*;

import static org.junit.Assert.*;
import java.util.Hashtable;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class OgrenciBilgileriTest {
	private Ogrenci ogrenci;
    private Ders ders;
    private Ders ders2;
    private Hashtable<NotTip, Integer> notList;
    private NotGoruntuleme notlar;
    private Hashtable<NotTip, Double> yuzdeList;
    private List<Ders> dersList;

    @Before
    public void SetUp(){
        ogrenci = new Ogrenci(0513247,"Bilge ULUSAY");

        ders= mock (Ders.class);
		when(ders.getDersAdi()).thenReturn("Test");
		dersList= mock(List.class);
		when(dersList.size()).thenReturn(1);
        ders2= new Ders(05225,"Image Processing","Aybars UGUR");
        notList=new Hashtable<NotTip, Integer>();
        notlar= new NotGoruntuleme();
        yuzdeList=new Hashtable<NotTip, Double>();
    }

    @Test
    public void DersKayitTest(){
        ogrenci.dersEkle(ders);
        assertEquals("Ders Ekleme Basarisiz oldu!",true,ogrenci.dersAra(ders.getDersAdi()));

    }
    @Test
    public void OgrenciDerslerininSayisi(){
	    ogrenci.dersEkle(ders);
    	assertEquals(ogrenci.getDersList().size(),dersList.size());
    }
    @Test
    public void ogrenciNotGoruntuleme (){
        notList.put(NotTip.VIZE,70 );
        ogrenci.dersEkle(ders2);
        ders.setNotList(notList);
        assertEquals("Not Görüntüleme Basarisiz oldu!",70,notlar.notGoruntule(ders2, NotTip.VIZE));

    }
    @Before
    public void SetUp2(){
        ogrenci.dersEkle(ders2);
        ders2.setNotList(notList);
        ders2.setYuzdeList(yuzdeList);

        notList.put(NotTip.VIZE,70 );
        notList.put(NotTip.PROJE,80 );
        notList.put(NotTip.FINAL,90 );
        yuzdeList.put(NotTip.VIZE,0.3);
        yuzdeList.put(NotTip.PROJE,0.1);
        yuzdeList.put(NotTip.FINAL,0.6);

    }

    @Test
    public void DonemSonuNotGoruntuleme(){

        assertEquals(83,(int)notlar.notHesaplat(ders2, DonemTip.DONEMSONU));

    }

    @Test
    public void harfNotuGoruntuleme()
    {

        assertEquals("BA",(String)notlar.harfNotuHesapla(ders2));

    }
    
}
