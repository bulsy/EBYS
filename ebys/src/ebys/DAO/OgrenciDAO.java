package ebys.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Hashtable;

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
	public Ogrenci getByID(int ID) {
		Hashtable<NotTip, Integer> NotList= new Hashtable<NotTip, Integer>();
		Ders ders=null;
		String query= "Select * from course where id=\""+ID+"\"";
		DBconnection(query);
	    try {
			while(resultSet.next()){
				NotList.put(NotTip.VIZE, Integer.parseInt(resultSet.getString("vize")));
				NotList.put(NotTip.PROJE, Integer.parseInt(resultSet.getString("proje")));
				NotList.put(NotTip.FINAL, Integer.parseInt(resultSet.getString("final")));
				String dersAdi = resultSet.getString("dersAdi");
				String ogretmen =resultSet.getString("ogretmen");
				ders= new Ders(ID,dersAdi,ogretmen);
				ders.setNotList(NotList);	
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return ders;
		
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
