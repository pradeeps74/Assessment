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
 * Servlet implementation class BalanceEnquiryServlet
 */
@WebServlet("/BalanceEnquiryServlet")
public class BalanceEnquiryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static double balance=15000 ;  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BalanceEnquiryServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String wd = request.getParameter("withdraw");
		double b = Double.parseDouble(wd);
		balance=balance-b;
		pw.print("your balance is "+balance);
		}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
