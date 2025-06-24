package web;
import java.sql.*;
public class DeleteDao {
	int k=0;
	public int delete(String pcode) {
		try {
			
		Connection con=DBconnection.getCon();
		PreparedStatement ps = con.prepareStatement("delete from product where procode=?");
		ps.setString(1,pcode);
		k=ps.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return k;
	}

}
