import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class OgrenciDBTest {
    private OgrenciDB ogrenciDB;
    private DBHelper dbHelper;

    @Before
    public void setup() throws Exception{
        dbHelper=mock(DBHelper.class);
    }

    @Test
    public void getNotTest(){
        double not=70;
        Ogrenci ogrenci= mock(Ogrenci.class);
        Ders ders=mock(Ders.class);
        when(ders.getNotList().get(NotTip.VIZE)).thenReturn((int) not);

        assertEquals(70, ogrenciDB.getOgrenciNot(ders,ogrenci,NotTip.VIZE,not));

    }




}
