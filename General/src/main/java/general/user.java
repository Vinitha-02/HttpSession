package general;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class user extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		String s= req.getParameter("username");
		String r= req.getParameter("Password");
	    res.setContentType("text/html");  

		PrintWriter out =res.getWriter();
		if(s.equals("vinitha")&&r.equals("12345")) {
		//	Cookie c= new Cookie("user",s)	;                                     //Cookies 
			//res.addCookie(c);
			//res.sendRedirect("pass");                                              //sendRedirect
			HttpSession ses= req.getSession(true);
			ses.setAttribute("user", s);
			res.sendRedirect("pass");                                              //sendRedirect

	
			
		}else {
			out.println("Sorry Incorrect username and password");
	       RequestDispatcher rd=req.getRequestDispatcher("Index.html");            //Request Dispatcher
	       rd.include(req, res);

			


		}
		

		
	}

}
