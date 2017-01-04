package ebys;
import static org.junit.Assert.*;

import java.util.Hashtable;

import org.junit.Test;


public class OgrenciBilgileriTest {
    @Test
    public void DerseKayitlanma() {
        Ogrenci ogrenci = new Ogrenci(0513247,"Bilge ULUSAY");
        Ders ders= new Ders(05223,"Test Driven Development","Oðuz Dikenelli");
        Ders ders2= new Ders(05225,"Image Processing","Aybars UÐUR");
        ogrenci.dersEkle(ders);
        assertTrue(ogrenci.dersAra(ders.getDersAdi()));
        assertTrue(ogrenci.dersAra(ders2.getDersAdi()));
    }

    @Test
    public void ogrenciNotGoruntuleme(){
        Ders ders= new Ders(05223,"Test Driven Development","Oðuz Dikenelli"); // SUT
        Ogrenci ogrenci = new Ogrenci(0513247,"Nagihan KALAYCI"); // SUT
        Hashtable<String, Integer> notList=new Hashtable<String, Integer>(); // SUT
        NotGoruntuleme notlar= new NotGoruntuleme();       
        notList.put("vize",70 ); // SUT
        notList.put("proje",80 ); // SUT
        notList.put("final",90 ); // SUT
        ogrenci.dersEkle(ders); 
        ders.setNotList(notList);
       

        assertEquals(70,notlar.notGoruntule(ders, "vize"));
        assertEquals(80,notlar.notGoruntule(ders, "proje"));
        assertEquals(90,notlar.notGoruntule(ders, "final"));
    }

    @Test
    public void DonemSonuNotGoruntuleme(){
    	 Ders ders= new Ders(05223,"Test Driven Development","Oðuz Dikenelli"); // SUT
    	 Ogrenci ogrenci = new Ogrenci(0513247,"Nagihan KALAYCI"); // SUT
    	 NotGoruntuleme notlar= new NotGoruntuleme();    
         Hashtable<String, Integer> notList=new Hashtable<String, Integer>(); // SUT
         Hashtable<String, Double> yuzdeList=new Hashtable<String, Double>(); // SUT
         ogrenci.dersEkle(ders); 
         ders.setNotList(notList);
         ders.setYuzdeList(yuzdeList);
         notList.put("vize",70 ); // SUT
         notList.put("proje",80 ); // SUT
         notList.put("final",90 ); // SUT
        
         yuzdeList.put("vize",0.3); // SUT
         yuzdeList.put("proje",0.1); // SUT
         yuzdeList.put("final",0.6); // SUT
         
        assertEquals(83,(int)notlar.notHesaplat(ders, "donemsonu"));
       
    }

    @Test
    public void harfNotuGoruntuleme()
    {
    	 Ders ders= new Ders(05223,"Test Driven Development","Oðuz Dikenelli"); // SUT
    	 Ogrenci ogrenci = new Ogrenci(0513247,"Nagihan KALAYCI"); // SUT
    	 ogrenci.dersEkle(ders); 
    	 NotGoruntuleme notlar= new NotGoruntuleme();    
    	 Hashtable<String, Integer> notList=new Hashtable<String, Integer>(); // SUT
         Hashtable<String, Double> yuzdeList=new Hashtable<String, Double>(); // SUT
         ders.setNotList(notList);
         ders.setYuzdeList(yuzdeList);
         notList.put("vize",70 ); // SUT
         notList.put("proje",80 ); // SUT
         notList.put("final",90 ); // SUT
        
         yuzdeList.put("vize",0.3); // SUT
         yuzdeList.put("proje",0.1); // SUT
         yuzdeList.put("final",0.6); // SUT
     
        assertEquals("BA",(String)notlar.harfNotuHesapla(ders));

    }
    
}
