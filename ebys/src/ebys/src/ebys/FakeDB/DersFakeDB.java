package ebys.FakeDB;

import ebys.DAO.BaseDAO;
import ebys.Ders;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;


public class DersFakeDB implements BaseDAO<Ders> {

    private List<Ders> dersList=new Vector();
    private Ders ders=null;
    public DersFakeDB(){
        ders=null;
    }

    @Override
    public Ders getWithId(Ders d) {
        Iterator i=dersList.iterator();
        while (i.hasNext()) {
            ders=(Ders)i.next();
            if(ders.getDersKodu()==d.getDersKodu())return ders;
        }
        return null;
    }
    @Override
    public void save(Ders type) {
        dersList.add(type);

    }
    @Override
    public void update(Ders updatedDers) {
        Ders iders;
        Iterator i=dersList.iterator();
        while (i.hasNext()) {
            iders = (Ders) i.next();
            if (iders.getDersKodu() == updatedDers.getDersKodu()){
                dersList.remove(iders);
                dersList.add(updatedDers);
            }
        }
    }
    @Override
    public void delete(Ders type) {

    }
}
