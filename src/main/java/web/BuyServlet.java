package web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/Buy1")
public class BuyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

	HttpSession hs = req.getSession(false);	

	String code=req.getParameter("pcode");
	
	ProductBean pb=new BuyDao().operationBuy(code);
	if(pb==null)
	{
		req.setAttribute("msg", "no data");
		req.getRequestDispatcher("buyfail.jsp").forward(req, res);
	}
	else {
		req.setAttribute("buy1", pb);
		hs.setAttribute("pb", pb);
		req.getRequestDispatcher("buy.jsp").forward(req, res);
	}
	

}
}

