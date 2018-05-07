package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import model.Customer;
import service.CustomerServiceImpl;
import service.RetailerServiceImpl;

public class ServletDemo extends HttpServlet {

	public void init() throws ServletException {

	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ServletContext context = getServletContext();
		WebApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(context);

		response.setContentType("text/html");

		if (request.getParameter("btn1") != null) {
			RetailerServiceImpl ret = (RetailerServiceImpl) ctx.getBean(RetailerServiceImpl.class);
			ArrayList<Customer> list1 = (ArrayList<Customer>) ret.viewCustomer();

			request.setAttribute("listServlet", list1);
			getServletConfig().getServletContext().getRequestDispatcher("/first.jsp").forward(request, response);

		}

		else if (request.getParameter("btn3") != null) {

			String str1 = request.getParameter("field1");
			CustomerServiceImpl cust1 = (CustomerServiceImpl) ctx.getBean(CustomerServiceImpl.class);

			String str2 = cust1.removeCustomer(str1);
			RetailerServiceImpl ret = (RetailerServiceImpl) ctx.getBean(RetailerServiceImpl.class);
			ArrayList<Customer> list1 = (ArrayList<Customer>) ret.viewCustomer();

			request.setAttribute("listServlet", list1);
			getServletConfig().getServletContext().getRequestDispatcher("/first.jsp").forward(request, response);

		} else if (request.getParameter("btn2") != null) {
			String str3 = request.getParameter("id");
			String str4 = request.getParameter("name1");
			String str5 = request.getParameter("addr");
			String str6 = request.getParameter("paymo");

			CustomerServiceImpl cust2 = (CustomerServiceImpl) ctx.getBean(CustomerServiceImpl.class);
			String str10 = cust2.addCustomer(str3, str4, str5, str6);

			RetailerServiceImpl ret = (RetailerServiceImpl) ctx.getBean(RetailerServiceImpl.class);
			ArrayList<Customer> list1 = (ArrayList<Customer>) ret.viewCustomer();

			request.setAttribute("listServlet", list1);
			getServletConfig().getServletContext().getRequestDispatcher("/first.jsp").forward(request, response);

		} else {
			getServletConfig().getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
		}

	}

	public void destroy() {

	}

}
