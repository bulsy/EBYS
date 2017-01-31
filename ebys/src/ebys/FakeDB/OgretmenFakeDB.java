package ebys.FakeDB;

import ebys.DAO.BaseDAO;
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
    public Ogretmen getWithId(int ID) {
       Ogretmen ogretmen=null;
        Iterator i=ogretmenList.iterator();
        while (i.hasNext()) {
            ogretmen=(Ogretmen)i.next();
            if(ogretmen.getOgretmenNo()==ID)return ogretmen;

        }
        return null;
    }
    @Override
    public void save(Ogretmen type) {
        ogretmenList.add(type);
    }

    @Override
    public void update(Ogretmen type) {
    }
    @Override
    public void delete(Ogretmen type) {

    }
}
