package ebys.Service;

import ebys.Ders;
import ebys.FakeDB.KayitliDersFakeDB;
import ebys.KayitliDers;
import ebys.Not;
import ebys.Ogrenci;

/**
 * Created by Bilge- on 31.1.2017.
 */
public class KayitliDersService {

    private KayitliDersFakeDB kayitliDersFakeDB;
    private KayitliDers kayitliDers;

    public void setKayitliDersFakeDB(KayitliDersFakeDB fakeDB) {
        this.kayitliDersFakeDB=fakeDB;
    }
    public KayitliDers derseKayit(Ders ders, Ogrenci ogrenci){
        kayitliDers=new KayitliDers(ogrenci,ders);
        ogrenci.dersEkle(kayitliDers);
        ders.kayitliDersEkle(kayitliDers);
        this.kayitliDersFakeDB.save(kayitliDers);
        return kayitliDers;
    }
    public void notGuncelle(KayitliDers kders, Not not){
        kayitliDers=kayitliDersFakeDB.getByID(kders);
        kayitliDers.setNot(not);
        kayitliDersFakeDB.update(kayitliDers);
    }
    public KayitliDers getKayitliDers(KayitliDers kders,Ogrenci ogrenci){
        kayitliDers=kayitliDersFakeDB.getByID(kders);
        return kayitliDers;
    }
}
