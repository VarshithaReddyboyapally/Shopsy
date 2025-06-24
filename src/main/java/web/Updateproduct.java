package web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/UpdateProduct")
public class Updateproduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public Updateproduct() {
        super();
        
    }


	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
	HttpSession hs = req.getSession(false);	
	if(hs!=null) {
		String pcode=req.getParameter("pcode");
		long price=Long.parseLong(req.getParameter("pprice"));
		String  stock=req.getParameter("pstock");
		int k=new UpdateDao().update(pcode, price, stock);
		if(k>0) {
req.setAttribute("msg","data updated successfully!");		
req.getRequestDispatcher("Update.jsp").forward(req, res);
		}
		
	}else {
		req.setAttribute("emsg", "session expired or null");
		req.getRequestDispatcher("logout.jsp").forward(req, res);
	}
		
		
	}

}
