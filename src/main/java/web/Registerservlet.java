package web;

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/reg")
public class Registerservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Registerservlet() {
        super();
        
    }

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
		String uname = req.getParameter("fname");
		String mail = req.getParameter("mail");
		 Long phno = Long.parseLong(req.getParameter("phno"));
		String pass= req.getParameter("pass");
		String pass1 = req.getParameter("cpass");
		
		AdminBean ab = new AdminBean();
		
		ab.setName(uname);
		ab.setEmail(mail);
		ab.setPhno(phno);
		ab.setCPassword(pass1);
		ab.setPassword(pass);
	
		int k = new RegDao().register(ab);
		if(k>0)
		{
			req.setAttribute("msg", "register successfull");
			req.getRequestDispatcher("register.jsp").forward(req, res);
		}
		else {
			req.setAttribute("msg", "register unsuccessfull");
			req.getRequestDispatcher("error.jsp").forward(req, res);
		}
		
		
	}

}
