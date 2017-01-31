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
    public void notGuncelle(int dersKod, int ogrenciId, Not not){
        kayitliDers=kayitliDersFakeDB.getByID(dersKod,ogrenciId);
        kayitliDers.setNot(not);
        kayitliDersFakeDB.update(kayitliDers);
    }
    public KayitliDers getKayitliDers(int  dersKod,int ogrID){
        kayitliDers=kayitliDersFakeDB.getByID(dersKod,ogrID);
        return kayitliDers;
    }
}
