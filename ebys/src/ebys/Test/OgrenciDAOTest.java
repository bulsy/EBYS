package ebys.Test;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.sql.SQLException;

import ebys.*;

import org.junit.Before;

import ebys.DAO.*;


public class OgrenciDAOTest {

	 private Ogrenci ogrenci;
	 private DersDAO dersDAO;
	 int ID=0;
	 
	 public Ogrenci CreateAnonymousOgrenci(){
		 ogrenci = new Ogrenci(0513247,"Bilge ULUSAY");
		 return ogrenci;
	 }
     @Before
     public void SetUp() throws ClassNotFoundException, SQLException{
    	 CreateAnonymousOgrenci();
    	 dersDAO= mock (DersDAO.class);
 		 when(dersDAO.getByID(ID).getDersAdi()).thenReturn("Test");
     }
     public void DersKayitTesti() throws ClassNotFoundException, SQLException{
    	 int ID=34156;
    	 ogrenci.dersEkle(dersDAO.getByID(ID));
         assertEquals("Ders Ekleme Basarisiz oldu!",true,ogrenci.dersAra( dersDAO.getByID(ID).getDersAdi()));

    	 
     }
}
