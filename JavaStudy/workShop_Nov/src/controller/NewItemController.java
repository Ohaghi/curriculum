package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.NewItemService;

public class NewItemController extends HttpServlet{

	HttpServletRequest request;
	HttpServletResponse response;

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException,ServletException {
		try {

			String name = request.getParameter("item");
			String price = request.getParameter("price");
			String imageUrl = request.getParameter("img");
			String category = request.getParameter("category");
			int priceNum = Integer.parseInt(price);
			int categoryNum = Integer.parseInt(category);
			System.out.println("----------controller1-----------------------");

			NewItemService newItem = new NewItemService();
			newItem.insert(name,priceNum,imageUrl,categoryNum);

		} catch (Exception e) {
	        e.printStackTrace();
	    } finally {
	        ServletContext context = this.getServletContext();
	        RequestDispatcher dispatcher = context.getRequestDispatcher("/top.jsp");
	        try {
	        	System.out.println("-----------------controller2----------------");
				dispatcher.forward(request, response);
			} catch (ServletException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
	    }
	}

}
