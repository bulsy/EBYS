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
        ogretmenFakeDB=new OgretmenFakeDB();
        ogretmen=null;
    }
    public void ogretmenDersListesi(int ogretmenNO, String dersAdi){

        ogretmen=ogretmenFakeDB.getWithId(ogretmenNO);
        ogretmen.dersAra(dersAdi);

    }
    public void ogretmenDersEkle(int ogretmenNo, Ders ders){
        ogretmen=ogretmenFakeDB.getWithId(ogretmenNo);
        ogretmen.dersEkle(ders);
    }
    public void dersYuzdeGuncelle(int ogretmenNo , String dersAdi, Yuzde yuzde){
        ogretmen= ogretmenFakeDB.getWithId(ogretmenNo);
        Ders ders=null;
        ders=ogretmen.dersAra(dersAdi);
        ders.yuzdeBelirle(yuzde);
    }
    public Ogretmen getOgretmen(int ID){
        ogretmen=ogretmenFakeDB.getWithId(ID);
        return  ogretmen;
    }
    public void setOgretmen(int ID){

    }
    public void yeniOgrEkle(Ogretmen ogr){
        ogretmenFakeDB.save(ogr);
    }
}
