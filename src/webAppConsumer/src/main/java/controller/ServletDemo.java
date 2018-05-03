package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import model.Customer;
import service.RetailerServiceImpl;

public class ServletDemo extends HttpServlet {
	
	
	
	
	
	ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
	RetailerServiceImpl ret=(RetailerServiceImpl) app.getBean(RetailerServiceImpl.class);	
	ArrayList<Customer> list1=(ArrayList<Customer>) ret.viewCustomer();
	
	public void init() throws ServletException {
	    String message="Start";
	   }

	
	   public void doGet(HttpServletRequest request, HttpServletResponse response)
	      throws ServletException, IOException {
		   //WebApplicationContext springContext = WebApplicationContextUtils.getRequiredWebApplicationContext(request.getServletContext());
		   
	     //System.out.println("Inside doGet"+springContext);
	      response.setContentType("text/html");

	      PrintWriter out = response.getWriter();
	      request.setAttribute("listServlet", list1); 
	      getServletConfig().getServletContext().getRequestDispatcher("/first.jsp").forward(request,response);

	     
	   }

	   public void destroy() {
	      // do nothing.
	   }

}
