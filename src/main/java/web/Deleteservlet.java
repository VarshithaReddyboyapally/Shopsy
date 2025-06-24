package web;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/Delete")
public class Deleteservlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	 HttpSession hs=req.getSession(false);
	 if(hs!=null) {
		 String pcode=req.getParameter("pcode");
		 int k=new DeleteDao().delete(pcode);
		 if(k>0)
		 {
		req.setAttribute("msg","data deleted successfully!"); 
		req.getRequestDispatcher("delete.jsp").forward(req, res);
		 }
		 else {
			 req.setAttribute("emsg", "session expired or null");
				req.getRequestDispatcher("logout.jsp").forward(req, res);
		 }
		 
	 }
		
	}
	

}
