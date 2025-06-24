package web;
import java.sql.*;
import java.util.ArrayList;
public class ViewDAO {

public ArrayList<ProductBean> al= new ArrayList<ProductBean>();
	
public ArrayList<ProductBean> retrieve(){
	
	try {
		
Connection con= DBconnection.getCon();	
PreparedStatement ps = con.prepareStatement("select *from product");	
ResultSet rs = ps.executeQuery();	
while(rs.next()) {	
ProductBean	 pb = new ProductBean();
pb.setProcode(rs.getString(1));	
pb.setProname(rs.getString(2));
pb.setProprice(rs.getLong(3));
pb.setProstock(rs.getString(4));	
 al.add(pb);
}
}
	catch(Exception e) {
		e.printStackTrace();
	}
	return al;
}
		

}
