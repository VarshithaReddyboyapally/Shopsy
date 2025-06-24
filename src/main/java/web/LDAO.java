package web;
import java.sql.*;
public class LDAO {
	public AdminBean ab = null;
	public AdminBean login(String name, String password)
	{
	
		try {
		Connection con = DBconnection.getCon();
	PreparedStatement ps = con.prepareStatement("select * from ADMIN where name=? and password=?");
		ps.setString(1,name);
		ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				ab = new AdminBean();//store the retrieved data (username, password) from the database
				ab.setName(rs.getString(1));
				ab.setPassword(rs.getString(2));

				//ab.setEmail(rs.getString(2));
				//ab.setPhno(rs.getLong(3));
				//ab.setPassword(rs.getString(4));
				//ab.setCPassword(rs.getString(5));
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return ab;
		
		
	}

}
