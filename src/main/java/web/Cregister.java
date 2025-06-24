package web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/register")
public class Cregister extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public Cregister() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
String uname= req.getParameter("uname");
String pass = req.getParameter("psw");
String fname= req.getParameter("fname");
String lname= req.getParameter("lname");
String mail = req.getParameter("mail");
String cty = req.getParameter("city");
Long phno = Long.parseLong(req.getParameter("phno"));

CustomerBean cb = new CustomerBean();
cb.setUname(uname);
cb.setPsw(pass);
cb.setFname(fname);
cb.setLname(lname);
cb.setMail(mail);
cb.setCity(cty);
cb.setPhno(phno);
int k= new Customerregisterdao().custregister(cb);
if(k>0) {
	
	req.setAttribute("msg", "registration successfull!!!!!");
	req.getRequestDispatcher("register.jsp").forward(req, res);
}
else {
	req.setAttribute("msg", "registration unsuccessfull!!!!!");
	req.getRequestDispatcher("error.jsp").forward(req, res);
}
		
	}

}
