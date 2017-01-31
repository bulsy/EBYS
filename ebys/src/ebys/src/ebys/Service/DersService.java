package ebys.Service;

import ebys.Ders;
import ebys.FakeDB.DersFakeDB;
import ebys.Yuzde;

/**
 * Created by Bilge- on 31.1.2017.
 */
public class DersService {

    private DersFakeDB dersFakeDB;
    private Ders ders;
    public DersService(){
        ders=null;
    }

    public void setDersFakeDB(DersFakeDB dersFakeDB) {
        this.dersFakeDB = dersFakeDB;
    }

    public void dersYuzdeGuncelleme(Ders ders, Yuzde yuzde){
        ders.yuzdeBelirle(yuzde);
        dersFakeDB.update(ders);
    }
    public Ders getDers(Ders ders){
        ders=dersFakeDB.getWithId(ders);
        return ders;
    }
    public void AddDers(Ders ders){
        dersFakeDB.save(ders);
    }



}
