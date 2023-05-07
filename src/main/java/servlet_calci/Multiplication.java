package servlet_calci;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Multiplication extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
System.out.println("hii vaishu yashv");
		
		String num1=req.getParameter("num1");//Integer (wrapper class) and ur are parsing it to integer value
		int n1=Integer.parseInt(num1);
		
		String num2=req.getParameter("num2");//total line is int n1=Integer.parseInt(req.getParameter("num1"));
	   int n2=Integer.parseInt(num2);
	   
	   res.getWriter().print("<h1> The Sum of "+n1+" and "+n2+" is"+(n1*n2)+"</h1> ");
		
		
		
		
		
		
		
		
		
		
		// 2 ways of mapping  --1.@Webservlet way 2.xml way(in the xml 8 line code)
		//xml code <servlet>
		//         <servlet-name> </servlet-name>
		//         <servlet-class> </servlet-class>
		//         </servlet>
		//<servlet-mapping>
		//<servlet-name>
		// <url-mapping>
		// </servlet-mapping>
		
	}

}
