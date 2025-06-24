package web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/login")
public class Loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Loginservlet() {
        super();    
    }
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String name = req.getParameter("fname");
		String pass = req.getParameter("pass");
		AdminBean ab = new LDAO().login(name, pass);
	      System.out.println(ab);	
		if(ab==null) {
			req.setAttribute("msg", "invalid username and password");
			req.getRequestDispatcher("fail.jsp").forward(req, res);
		}
		else {
			HttpSession hs= req.getSession();
			hs.setAttribute("bbb",ab);
			String N = ab.getName();
			req.setAttribute("name", N);
			req.getRequestDispatcher("success.jsp").forward(req, res);
		}
	}

}
