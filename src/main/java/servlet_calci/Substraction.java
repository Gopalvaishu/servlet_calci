package servlet_calci;
//GenericServlet implements from Servlet bcz if u do  servlet all methods will come and we wont use all methods only we use service so waste of other methods thts y we go fo only GenericServlet 
import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/sub")
public class Substraction extends GenericServlet {//so if we use GenericServlet we get only one method tht is service enough for our class
//Genericservlet is an abstract class inherits servlet interface
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
System.out.println("hii vaishu vishnu");
		
		String num1=req.getParameter("num1");//Integer (wrapper class) and ur are parsing it to integer value
		int n1=Integer.parseInt(num1);
		
		String num2=req.getParameter("num2");//total line is int n1=Integer.parseInt(req.getParameter("num1"));
	   int n2=Integer.parseInt(num2);
	   
	   res.getWriter().print("<h1> The Sum of "+n1+" and "+n2+" is"+(n1-n2)+"</h1> ");
		
	}

}	

	
		
	


