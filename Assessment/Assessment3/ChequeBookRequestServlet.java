package com.assessment.third;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ChequeBookRequestServlet
 */
@WebServlet("/ChequeBookRequestServlet")
public class ChequeBookRequestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ChequeBookRequestServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();

		pw.print("<p>Thanks for your request for get cheque book," + "\n"
				+ "as soon as possible we processing your request");
		pw.print("<body>\n"
				+"<form>\n"
				+"<input type='submit' value='leave' name='leave'>"+"</form>"
				+"</body>");
		String leave = request.getParameter("leave");
		if(leave.contains(leave)) {
			pw.println("you can take your card now "+'\n'+"Thanks for coming");
			RequestDispatcher rd = request.getRequestDispatcher("index.html");
			rd.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
