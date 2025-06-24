package web;
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;

@SuppressWarnings("unused")
public class Customerregisterdao {
	
	int k =0;
	
	public int custregister(CustomerBean cb) {
		
		try {
			Connection con = DBconnection.getCon();
		PreparedStatement ps=con.prepareStatement("insert into customertable values(?,?,?,?,?,?,?)");	
			ps.setString(1, cb.getUname());
			ps.setString(2, cb.getPsw());
			ps.setString(3, cb.getFname());
			ps.setString(4, cb.getLname());
			ps.setString(5, cb.getMail());
			ps.setString(6, cb.getCity());
			ps.setLong(7, cb.getPhno());
			 k= ps.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return k;
	}

}
