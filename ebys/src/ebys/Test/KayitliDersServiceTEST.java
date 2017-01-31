package ebys.Test;

import ebys.Ders;
import ebys.FakeDB.KayitliDersFakeDB;
import ebys.KayitliDers;
import ebys.Not;
import ebys.Ogrenci;
import ebys.Service.KayitliDersService;
import org.junit.Test;
import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

/**
 * Created by Bilge- on 31.1.2017.
 */
public class KayitliDersServiceTEST {
    Ders ders;
    Ogrenci ogrenci;
    KayitliDersService kdersService;
    KayitliDersFakeDB fakeDB;
    @Before
    public void setUp(){
        kdersService=new KayitliDersService();
        ders=mock(Ders.class);
        ogrenci=mock(Ogrenci.class);
    }
    @Test
    public void derseKayitTest(){
        // Fixture SetUp
        fakeDB = new KayitliDersFakeDB();
        KayitliDersFakeDB spyDB= //KayitliDersFakeDB'deki methodların doğru parametrelerle
                spy(fakeDB); //çağrılıp çağrılmadığını kontrol ediyoruz.
        kdersService.setKayitliDersFakeDB(spyDB); //Servisimize fake databasemizi ekliyoruz!!!!
        //SUT EXERCISE
        KayitliDers kayitliders=kdersService.derseKayit(ders,ogrenci); //Fake databesimize kayıtlı ders ekliyoruz!!!
        // BEHAVIORAL VERIFICATION
        verify(ders,times(1))
                .kayitliDersEkle(kayitliders); //Ders sınıfına kayitlidersin eklenmesinin kontrolü
        verify(ogrenci,times(1))
                .dersEkle(kayitliders);//ogrencinin aldığı derslere yeni eklenen dersin kontrolü
        verify(spyDB,times(1)).save(kayitliders);
        // PROCEDURAL BEHAVIOR VERIFICATION
    }
    @Test
    public void notGuncelleTest(){
        // Fixture SetUp
        kdersService.setKayitliDersFakeDB(new KayitliDersFakeDB()); //Servisimize fake databaseimizi ekledik!!
        KayitliDers kders=kdersService.derseKayit(ders,ogrenci); //Fake databaseimize kayıtlı ders ekledik!!
        Not not=mock(Not.class);
        when(not.getProje()).thenReturn(100); //STUBBING
        //SUT EXERCISE
        kdersService.notGuncelle(kders,not);
        // STATE VERIFICATION
         assertEquals("Not Guncellenemedi!",100,kders.getNot().getProje());
    }

}
