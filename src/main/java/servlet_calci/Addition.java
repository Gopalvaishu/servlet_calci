package servlet_calci;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/add")// annotation webservlet is used to map a url to the particular class
public class Addition implements Servlet {// implements interface here for addition class

	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("hii radha gopal");
		
		String num1=req.getParameter("num1");//Integer (wrapper class) and ur are parsing it to integer value
		int n1=Integer.parseInt(num1);
		
		String num2=req.getParameter("num2");//total line is int n1=Integer.parseInt(req.getParameter("num1"));
	   int n2=Integer.parseInt(num2);
	   
	   res.getWriter().print("<h1> The Sum of "+n1+" and "+n2+" is"+(n1+n2)+"</h1> ");//u can write html code in the res.getWriter().print statement only so it will display the values in the front end.
		
	}

}
