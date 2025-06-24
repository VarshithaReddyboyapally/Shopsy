package web;
import java.sql.Connection;
import java.sql.DriverManager;


public class DBconnection {
	 private static Connection con=null;
	 DBconnection() {}
	 static {
		 try {
			 Class.forName(DBinfo.driver);
			 con = DriverManager.getConnection(DBinfo.dbURL,DBinfo.uName,DBinfo.uPassWord);	 
		 }
		 catch(Exception e){
			 e.printStackTrace();
		 }
		 
	 }
	 public static Connection getCon()
	    {
		 return con;
		 }

}