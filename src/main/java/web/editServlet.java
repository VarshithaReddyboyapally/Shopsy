package web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

@WebServlet("/Edit")
public class editServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public editServlet() {
        super();
       
    }

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	HttpSession hs = req.getSession(false);	 
	AdminBean ab =(AdminBean)hs.getAttribute("bbb");
	@SuppressWarnings("unchecked")
	List<ProductBean>li =(List<ProductBean>)hs.getAttribute("alist");
	if(hs==null||ab==null||li.isEmpty()) {
		req.setAttribute("emsg", "session expired or null");
		req.getRequestDispatcher("logout.jsp").forward(req, res);
	}
	else {
		String p= req.getParameter("pcode");
		Iterator<ProductBean>itr = li.iterator();
		while(itr.hasNext()) {
			ProductBean pb= itr.next();
			if(p.equals(pb.getProcode())) {
				req.setAttribute("productedit", pb);//doubt
				req.getRequestDispatcher("editpage.jsp").forward(req, res);
			}
			else {
				System.out.println("something went wrong");
			}
		}
	}
	
	}
	

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
	}

}
