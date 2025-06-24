package web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/pro")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public ProductServlet() {
        super();
       
    }

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String pc = req.getParameter("pcode");
		String name =req.getParameter("pname");
		long price =Long.parseLong( req.getParameter("pprice"));
		String stock = req.getParameter("pstock");
		
		ProductBean pb = new ProductBean();
		pb.setProcode(pc);
		pb.setProname(name);
		pb.setProprice(price);
		pb.setProstock(stock);
		
	
		int k = new ProductDAO().insert(pb);
		
		if(k>0)
		{
//			String N = ab.getName();
//			req.setAttribute("name", N);
			req.setAttribute("msg","product added successfully!!");
			req.getRequestDispatcher("prosuccess.jsp").forward(req, res);
		}
		else {
			req.setAttribute("msg","product is not added!!");
			req.getRequestDispatcher("profail.jsp").forward(req, res);
		}
	}
		
}
