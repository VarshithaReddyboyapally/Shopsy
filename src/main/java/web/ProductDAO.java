package web;
import java.sql.*;
public class ProductDAO {
int k=0;
	public int insert(ProductBean pb) {
		Connection con = DBconnection.getCon();
		try {
		PreparedStatement ps = con.prepareStatement("insert into product values(?,?,?,?)");
		ps.setString(1, pb.getProcode());
		ps.setString(2, pb.getProname());
		ps.setLong(3, pb.getProprice());
		ps.setString(4, pb.getProstock());
		k = ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return k;
		
	}
	
	
}
