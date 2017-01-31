package ebys.Test;

import ebys.Ders;
import ebys.FakeDB.KayitliDersFakeDB;
import ebys.KayitliDers;
import ebys.Ogrenci;
import ebys.Service.KayitliDersService;
import org.junit.Test;

import static org.mockito.Mockito.*;

/**
 * Created by Bilge- on 31.1.2017.
 */
public class KayitliDersServiceTEST {
    Ders ders;
    Ogrenci ogrenci;
    KayitliDersService kdersService;
    KayitliDersFakeDB fakeDB;

    @Test
    public void derseKayitTest(){
        // Fixture SetUp
        Ders ders=mock(Ders.class);
        Ogrenci ogrenci=mock(Ogrenci.class);
        kdersService=new KayitliDersService();
        fakeDB = new KayitliDersFakeDB();
        KayitliDersFakeDB spyDB= //KayitliDersFakeDB'deki methodların doğru parametrelerle
                spy(fakeDB); //çağrılıp çağrılmadığını kontrol ediyoruz.
        kdersService.setKayitliDersFakeDB(spyDB);
        //SUT EXERCISE
        KayitliDers kayitliders=kdersService.derseKayit(ders,ogrenci);
        // BEHAVIORAL VERIFICATION
        verify(ders,times(1))
                .kayitliDersEkle(kayitliders); //Ders sınıfına kayitlidersin eklenmesinin kontrolü
        verify(ogrenci,times(1))
                .dersEkle(kayitliders);//ogrencinin aldığı derslere yeni eklenen dersin kontrolü
        verify(spyDB,times(1)).save(kayitliders);
        // PROCEDURAL BEHAVIOR VERIFICATION

    }

}
