package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.DetailService;

public class DetailController extends HttpServlet{

	HttpServletRequest request;
	HttpServletResponse response;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException,ServletException {
		try {
			int id = Integer.parseInt(request.getParameter("id"));
			DetailService detail = new DetailService();

			request.setAttribute("shohin", detail.showDetail(id));


		} catch (Exception e) {
	        e.printStackTrace();
	    } finally {
	        ServletContext context = this.getServletContext();
	        RequestDispatcher dispatcher = context.getRequestDispatcher("/detail.jsp");
	        try {
				dispatcher.forward(request, response);
			} catch (ServletException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
	    }
	}

}
