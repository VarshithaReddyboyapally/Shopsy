package web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/logout")
public class Logoutservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Logoutservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		HttpSession hs = req.getSession(false);
		if(hs==null) {
			req.setAttribute("logoutmsg","session expired");
		req.getRequestDispatcher("logout.jsp").forward(req, res);
		}
		else {
			
	hs.removeAttribute("alist");
	hs.removeAttribute("bbb");
	hs.invalidate();
	req.getRequestDispatcher("logout.jsp").forward(req, res);
		}
		
		
		
	}	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
