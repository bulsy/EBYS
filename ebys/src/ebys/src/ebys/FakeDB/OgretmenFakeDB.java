package ebys.FakeDB;

import ebys.DAO.BaseDAO;
import ebys.Ders;
import ebys.Ogretmen;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/**
 * Created by nagihan on 30/01/2017.
 */
public class OgretmenFakeDB implements BaseDAO<Ogretmen> {

    private List<Ogretmen> ogretmenList=new Vector();
    @Override
    public Ogretmen getWithId(Ogretmen ogr) {
       Ogretmen ogretmen=null;
        Iterator i=ogretmenList.iterator();
        while (i.hasNext()) {
            ogretmen=(Ogretmen)i.next();
            if(ogretmen.getOgretmenNo()==ogr.getOgretmenNo())return ogretmen;

        }
        return null;
    }
    @Override
    public void save(Ogretmen type) {
        ogretmenList.add(type);
    }

    @Override
    public void update(Ogretmen updatedOgr) {
        Ogretmen ogr;
        Iterator i=ogretmenList.iterator();
        while (i.hasNext()) {
            ogr = (Ogretmen) i.next();
            if (ogr.getOgretmenNo() == updatedOgr.getOgretmenNo()){
                ogretmenList.remove(ogr);
                ogretmenList.add(updatedOgr);
            }
        }
    }
    @Override
    public void delete(Ogretmen type) {

    }
}
