package ebys.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Hashtable;
import java.util.List;

import ebys.*;

public class OgrenciDAO implements BaseDAO<Ogrenci> {
	Connection con =null;
	String query=null;
	PreparedStatement preparedStatement=null;
	ResultSet resultSet=null;
	private void DBconnection(String query)throws ClassNotFoundException, SQLException{
		this.con= DBconnection.getDBcon().getDBConnection();
		this.query= query;
		this.preparedStatement = con.prepareStatement(query);
		this.resultSet= preparedStatement.executeQuery();
	}
	
	@Override
	public Ogrenci getByID(int ID) throws ClassNotFoundException, SQLException{
		Ogrenci ogrenci= null;
		List<Ders> dersList=null;
		String query= "Select * from course where id=\""+ID+"\"";
		DBconnection(query);
	    try {
			while(resultSet.next()){
				String dersAdi = resultSet.getString("dersAdi");
				String adSoyad =resultSet.getString("adSoyad");
				ogrenci= new Ogrenci(ID,adSoyad);
				while(resultSet.next()){
					Ders ders=(Ders)resultSet.getObject("Ders");
					dersList.add(ders);
				}	
				ogrenci.setDersList(dersList);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return ogrenci;
		
	}

	@Override
	public Ogrenci save(Ogrenci type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ogrenci update(Ogrenci type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Ogrenci type) {
		// TODO Auto-generated method stub
		
	}

}
