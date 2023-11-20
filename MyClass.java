package t.a.c;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyClass
 */
@WebServlet(description = "My1stproject", urlPatterns = { "/MyClassurl" })
public class MyClass extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter po=response.getWriter();
		String n=request.getParameter("name");
		String c=request.getParameter("city");
		String g=request.getParameter("gen");
		po.print("Its from doPost method...Your name is:"+n+" and you stay in:"+c+" You are:"+g);
	}
	
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter po=response.getWriter();
		String n=request.getParameter("name");
		String c=request.getParameter("city");
		po.print("Its from doGet method...Your name is:"+n+" and you stay in:"+c);
	}

}
