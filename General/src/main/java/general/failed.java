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

public class failed extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
	    res.setContentType("text/html");  

	PrintWriter out= res.getWriter();
	//Cookie[] ck = req.getCookies(); //Cookies
	//out.println("Welcome"+ck[0].getValue());
	HttpSession ses = req.getSession(); // HttpSession
	String q = (String)ses.getAttribute("user");
	out.println("Welcome "+q);
	}
	}
	
