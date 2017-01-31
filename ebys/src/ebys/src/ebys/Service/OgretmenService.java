package ebys.Service;

import ebys.Ders;
import ebys.FakeDB.OgretmenFakeDB;
import ebys.Ogretmen;
import ebys.Yuzde;

/**
 * Created by Bilge- on 31.1.2017.
 */
public class OgretmenService {

    private OgretmenFakeDB ogretmenFakeDB;
    private Ogretmen ogretmen;

    public OgretmenService(){
        ogretmen=null;
    }

    public void setOgretmenFakeDB(OgretmenFakeDB ogretmenFakeDB) {
        this.ogretmenFakeDB = ogretmenFakeDB;
    }

    public void ogretmenDersListesi(Ogretmen ogretmen, Ders ders){

        ogretmen=ogretmenFakeDB.getWithId(ogretmen);
        ogretmen.dersAra(ders);

    }
    public void ogretmenDersEkle(Ogretmen ogretmenNo, Ders ders){
        ogretmen=ogretmenFakeDB.getWithId(ogretmen);
        ogretmen.dersEkle(ders);
    }
    public void dersYuzdeGuncelle(Ogretmen ogretmen ,Ders ders, Yuzde yuzde){
        ogretmen= ogretmenFakeDB.getWithId(ogretmen);
        Ders aders=null;
        aders=ogretmen.dersAra(ders);
        aders.yuzdeBelirle(yuzde);
        ogretmen.DersGuncelle(aders);
        ogretmenFakeDB.update(ogretmen);
    }
    public Ogretmen getOgretmen(Ogretmen ogr){
        ogretmen=ogretmenFakeDB.getWithId(ogr);
        return  ogretmen;
    }
    public void setOgretmen(int ID){

    }
    public void yeniOgrEkle(Ogretmen ogr){
        ogretmenFakeDB.save(ogr);
    }
}
