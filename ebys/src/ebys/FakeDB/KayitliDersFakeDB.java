package ebys.FakeDB;

import ebys.DAO.BaseDAO;
import ebys.KayitliDers;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;


public class KayitliDersFakeDB implements BaseDAO<KayitliDers>
{

    private List dersList=new Vector();

    public KayitliDersFakeDB(){}

    public KayitliDers getByID(int ID,int ogrId) {

        KayitliDers ders;
        Iterator i=dersList.iterator();
        while (i.hasNext()) {
            ders=(KayitliDers)i.next();
            if(ders.getDers().getDersKodu()==ID && ders.getOgrenci().getOgrenciNo()==ogrId)return ders;

        }
        return null;
    }

    @Override
    public void save(KayitliDers type) {
      dersList.add(type);
    }
    @Override
    public void update(KayitliDers updatedDers) {
        KayitliDers ders;
        Iterator i=dersList.iterator();
        while (i.hasNext()) {
            ders=(KayitliDers)i.next();
            if(ders.getDers().getDersKodu()==updatedDers.getDers().getDersKodu()
                    && ders.getOgrenci().getOgrenciNo()==updatedDers.getOgrenci().getOgrenciNo()) {
                dersList.remove(ders);
                dersList.add(updatedDers);
            }
        }
    }
    @Override
    public void delete(KayitliDers type) {

    }
    @Override
    public KayitliDers getWithId(int ID) {
        return null;
    }
}
