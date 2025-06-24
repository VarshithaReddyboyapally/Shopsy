package web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/cus")
public class CloginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String uname = req.getParameter("uname");
		String pass = req.getParameter("psw");
		CustomerBean cb = new CustomerDao().custlogin(uname, pass);
		System.out.println(cb);
		if(cb==null) {
			req.setAttribute("msg", "invalid username and password");
			req.getRequestDispatcher("fail.jsp").forward(req, res);
		}
		
		else {
			
			HttpSession hs= req.getSession();
			hs.setAttribute("cbean", cb);
			//String N = cb.getUname();
			//req.setAttribute("uname",N);
			req.getRequestDispatcher("Success1.jsp").forward(req, res);
			
		}
		
		
	}

}
