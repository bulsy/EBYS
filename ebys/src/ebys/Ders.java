import java.util.Hashtable;

public class Ders {

        private String dersAdi;
        private String ogretmen;
        private int dersKodu;

        Hashtable<NotTip, Integer> NotList;
        Hashtable<NotTip,Double> YuzdeList;

        public Ders(int dersKodu, String dersAdi,String ogretmen) {
            this.dersKodu = dersKodu;
            this.dersAdi = dersAdi;
            this.ogretmen= ogretmen;
            NotList=new Hashtable<NotTip, Integer>();
            YuzdeList=new Hashtable<NotTip, Double>();
        }
        public Hashtable<NotTip, Integer> getNotList() {
            return NotList;
        }
        public void setNotList(Hashtable<NotTip, Integer> notList) {
            NotList = notList;
        }
        public Hashtable<NotTip, Double> getYuzdeList() {
            return YuzdeList;
        }
        public void setYuzdeList(Hashtable<NotTip, Double> yuzdeList) {
            YuzdeList = yuzdeList;
        }
        public int getDersKodu() {
            return dersKodu;
        }
        public void setDersKodu(int dersKodu) {
            this.dersKodu = dersKodu;
        }
        public String getDersAdi() {
            return dersAdi;
        }
        public void setDersAdi(String dersAdi) {
            this.dersAdi = dersAdi;
        }
        public void NotEkle(int dersnot, NotTip type){
            NotList.put(type, dersnot);
        }
        public void yuzdeBelirle(double dersyuzde, NotTip type){
            YuzdeList.put(type,dersyuzde);
        }

}
