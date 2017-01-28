/**
 * Created by nagihan on 24/01/2017.
 */
public class OgrenciDB {

    private DBHelper DBHelper;
    int not;
    public OgrenciDB(DBHelper dbHelper){
        this.DBHelper = dbHelper;
    }

    public Ogrenci getOgrenci(int ogrenciNo) {
        return (Ogrenci) DBHelper.sqlListesi("getOgrenci").get(0);
    }


    public int getOgrenciNot(Ders ders, Ogrenci ogrenci, NotTip tip, double not) {

        return (int) not;
    }

}
