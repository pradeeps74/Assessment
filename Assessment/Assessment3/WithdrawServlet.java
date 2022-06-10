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
 * Servlet implementation class WithdrawServlet
 */
@WebServlet("/WithdrawServlet")
public class WithdrawServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static double balance = 15000;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public WithdrawServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();

		pw.print("<body>\n" + "<form>\n" + "<input type='text' placeholder='WithdrawAmount' name='txtWithdrawAmount'>"
				+ "<input type='submit' value='proceed'>" + "</form>" + "</body>");
		String withdrawAmount = request.getParameter("txtWithdrawAmount");
		double withdraw = Double.parseDouble(withdrawAmount);

		if (withdraw <= balance) {
			pw.print("amount is available");
			pw.print("Your withdraw amount is :" + withdraw);
			pw.print("<form><input type='hidden' name='withdraw' value=' " + withdraw + "'/>");
			pw.print("<input type='submit'  value='checkbalance' formaction='BalanceEnquiryServlet'/>");
			pw.print("<input type='submit'  value='goBack' formaction='index.html'/>");
		} else {
			pw.print("Unavailable amount");
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
