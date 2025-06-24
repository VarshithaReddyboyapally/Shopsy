package web;
import java.sql.*;

public class BuyDao {
	
	ProductBean pb = null;
	public ProductBean operationBuy(String pcode) {
		try {
	@SuppressWarnings("static-access")
	Connection con= new DBconnection().getCon();
	PreparedStatement ps = con.prepareStatement("select * from product where procode=?");
	ps.setString(1, pcode);
	ResultSet rs =ps.executeQuery();
	if(rs.next()) {
		pb = new ProductBean();
		pb.setProcode(rs.getString(1));
		pb.setProname(rs.getString(2));
		pb.setProprice(rs.getLong(3));
		pb.setProstock(rs.getString(4));
		    
	}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return pb ;
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
