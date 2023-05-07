package servlet_calci;

import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet implementation class Divisionn
 */
public class Divisionn extends GenericServlet implements Servlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Hello vaishu and yashvanth good morning");
		double n1=Double.parseDouble(request.getParameter("num1"));
		double n2=Double.parseDouble(request.getParameter("num2"));
		response.getWriter().print("<h1> The Sum of "+n1+" and "+n2+" is"+(n1/n2)+"</h1> ");
		
		
		
		
	}

}
