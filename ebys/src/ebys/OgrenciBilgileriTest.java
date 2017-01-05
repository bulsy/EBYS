package ebys;
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
	 private Hashtable<String, Integer> notList;
	 private NotGoruntuleme notlar;
	 private Hashtable<String, Double> yuzdeList;
	 //private Hashtable<String, Integer> notlarList= mock(Hashtable.class);
	 

	@Before
	public void SetUp(){
		ogrenci = new Ogrenci(0513247,"Bilge ULUSAY");
		ders= new Ders(05223,"Test Driven Development","Oðuz Dikenelli");
		ders2= new Ders(05225,"Image Processing","Aybars UÐUR");
		notList=new Hashtable<String, Integer>();
		notlar= new NotGoruntuleme();      
		yuzdeList=new Hashtable<String, Double>();
	}
	
	
    @Test
    public void DerseKayitlanma() {
        ogrenci.dersEkle(ders);
        assertTrue("Ders Ekleme Baþarýsýz oldu!",ogrenci.dersAra(ders.getDersAdi()));
        
    }

    @Test
    public void ogrenciNotGoruntuleme(){
        notList.put("vize",70 );
        ogrenci.dersEkle(ders); 
        ders.setNotList(notList);
        assertEquals("Not Görüntüleme Baþarýsýz oldu!",50,notlar.notGoruntule(ders, "vize"));
       
    }

    @Test
    public void DonemSonuNotGoruntuleme(){
    	 ogrenci.dersEkle(ders); 
         ders.setNotList(notList);
         ders.setYuzdeList(yuzdeList);
         
         notList.put("vize",70 ); 
         notList.put("proje",80 ); 
         notList.put("final",90 ); 
         yuzdeList.put("vize",0.3); 
         yuzdeList.put("proje",0.1); 
         yuzdeList.put("final",0.6); 
       
        assertEquals(83,(int)notlar.notHesaplat(ders, "donemsonu"));
       
    }

    @Test
    public void harfNotuGoruntuleme()
    {
    	 ogrenci.dersEkle(ders); 
         ders.setNotList(notList);
         ders.setYuzdeList(yuzdeList);
         notList.put("vize",70 ); 
         notList.put("proje",80 ); 
         notList.put("final",90 ); 
        
         yuzdeList.put("vize",0.3); 
         yuzdeList.put("proje",0.1); 
         yuzdeList.put("final",0.6); 
     
        assertEquals("BA",(String)notlar.harfNotuHesapla(ders));

    }
    
}
