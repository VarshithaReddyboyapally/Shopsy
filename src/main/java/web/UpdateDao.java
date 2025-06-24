package web;
import java.sql.*;

public class UpdateDao {
	
	int k=0;
	
	public int update(String pcode,long price,String stock) {
	try {
	Connection con =DBconnection.getCon();	
	PreparedStatement ps = con.prepareStatement("update product set proprice =?,prostock=? where procode=?");
	ps.setString(3,pcode);
	ps.setLong(1, price);
   ps.setString(2, stock);
   k=ps.executeUpdate();
	}
	catch(Exception e) {	
	e.printStackTrace();	
	}
	return k;	
	}
	
	

}
