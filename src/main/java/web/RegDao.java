package web;
import java.sql.*;
public class RegDao {
	int k=0;
	public int register(AdminBean ab) {
	
	Connection con =DBconnection.getCon();
	try {
		PreparedStatement ps = con.prepareStatement("insert into ADMIN values(?,?,?,?,?)");	
		ps.setString(1,ab.getName());
		ps.setString(2,ab.getEmail());
		ps.setLong(3,ab.getphno());
		ps.setString(4,ab.getPassword());
		ps.setString(5,ab.getCPassword());
		k = ps.executeUpdate();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return k;
	

}
}