package ebys.Test;

import ebys.Ders;
import ebys.FakeDB.DersFakeDB;
import ebys.FakeDB.OgretmenFakeDB;
import ebys.Ogretmen;
import ebys.Service.DersService;
import ebys.Service.OgretmenService;
import ebys.Yuzde;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

/**
 * Created by Bilge- on 31.1.2017.
 */
public class DersServiceTEST {
    DersService dersService;
    Ders ders;
    @Before
    public void SetUp(){
        dersService = new DersService();
        dersService.setDersFakeDB(new DersFakeDB()); //Fake databasemizi set ettik.
        ders=mock(Ders.class);
    }
    @Test
    public void dersYuzdeGuncelleTesti(){
        Yuzde yuzde= mock(Yuzde.class);
        when(yuzde.getVize()).thenReturn(0.4); //STUB
        dersService.AddDers(ders);
        //SUT EXERCISE
        dersService.dersYuzdeGuncelleme(ders,yuzde);
        //VERIFICATION
        verify(ders,times(1)).yuzdeBelirle(yuzde);

    }

}
