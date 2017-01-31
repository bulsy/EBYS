package ebys.FakeDB;

import ebys.DAO.BaseDAO;
import ebys.Ogrenci;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/**
 * Created by nagihan on 30/01/2017.
 */
public class OgrenciFakeDB implements BaseDAO<Ogrenci>{

    private List<Ogrenci> ogrenciList=new Vector();


    public void yuzdeBelirle(double yuzde){

    }

    @Override
    public Ogrenci getWithId(Ogrenci ogrenci) {
        Ogrenci ogr=null;
        Iterator i=ogrenciList.iterator();
        while (i.hasNext()) {
            ogr=(Ogrenci)i.next();
            if(ogr.getOgrenciNo()==ogrenci.getOgrenciNo())return ogr;

        }
        return null;
    }

    @Override
    public void save(Ogrenci type) {
        ogrenciList.add(type);

    }


    @Override
    public void update(Ogrenci type) {

    }

    @Override
    public void delete(Ogrenci type) {

    }
}
