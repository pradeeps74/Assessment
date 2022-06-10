package com.assessment.third;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ValidationServlet
 */
@WebServlet("/ValidationServlet")
public class ValidationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	HashMap<String, String> hm = new HashMap<String, String>();

	public ValidationServlet() {
		super();
		hm.put("1234567890159753", "8056");
		hm.put("1234567890357951", "9791");
		hm.put("2333775689663278", "8870");
	}

	public boolean validation(String cardNum, String pwd) throws InvalidCard, InvalidPassword {

		if (Pattern.matches("[0-9]{16}", cardNum)) {
			if (Pattern.matches("[0-9]{4}", pwd)) {
				if ((pwd.equals(pwd))&&(cardNum.equals(cardNum))) {
					System.out.println("valid card number and password");
				}
			} else {
				throw new InvalidPassword(pwd);
			}
		} else {
			throw new InvalidCard(cardNum);
		}
		return true;
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String cardNumber = request.getParameter("txtName");
		String password = request.getParameter("txtPassword");
		try {

			if (validation(cardNumber, password) == true) {
				for (Map.Entry m : hm.entrySet()) {
					if ((cardNumber.equals(m.getKey())) && (password.equals(m.getValue()))) {
						response.sendRedirect("OptiionsServlet");
					} 
					else {
						pw.print("your card number and password is not matched");
						break;
					}
				}
				
			}
		} catch (InvalidCard e) {
			// TODO Auto-generated catch block
			pw.print(e.show());
		} catch (InvalidPassword e) {
			// TODO Auto-generated catch block
			pw.print(e.show());
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
