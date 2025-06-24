package web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/Viewproduct")
public class Viewproduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public Viewproduct() {
        super();  
    }

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		HttpSession hs = req.getSession(false);
		if(hs==null) {
	req.setAttribute("msg", "session expired...<br>");
	req.getRequestDispatcher("view.jsp").forward(req,res);
		}
		else {
	ArrayList<ProductBean>al = new ViewDAO().retrieve();
	
	hs.setAttribute("alist", al);//We store the product list in the session with the key "alist".
	req.getRequestDispatcher("view1.jsp").forward(req, res);

	}

	}
	}
