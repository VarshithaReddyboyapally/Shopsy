package web;
import java.sql.*;
public class CustomerDao {

	
	public  CustomerBean custlogin(String uname,String pass) {
		CustomerBean cb=null;
		try {
			Connection con = DBconnection.getCon();
			PreparedStatement ps =con.prepareStatement("select * from customertable where UNAME=? and PSW=?");
		ps.setString(1, uname);
		ps.setString(2,pass);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				cb= new CustomerBean();
				cb.setUname(rs.getString(1));			
				cb.setPsw(rs.getString(2));				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
	//	System.out.println(cb.getUname());
		return cb;
	}

}
