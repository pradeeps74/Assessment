package com.vastpro.studentCrud;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SaveServlet
 */
@WebServlet("/SaveServlet")
public class SaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SaveServlet() {
		super();
		// TODO Auto-generated constructor stub
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
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String sid = request.getParameter("txtId");
		int id = Integer.parseInt(sid);
		String EmpId = request.getParameter("txtEmpId");
		String EmpName = request.getParameter("txtEmpName");
		String EmpAge = request.getParameter("txtEmpAge");
		String EmpDesignations = request.getParameter("designations");
		String EmpPhoneNumber = request.getParameter("txtEmpPhoneNum");

		String EmpSalary = request.getParameter("txtSalary");

		Employee e = new Employee();
		e.setId(id);
		e.setEmpId(EmpId);
		e.setEmpName(EmpName);
		e.setEmpAge(EmpAge);
		e.setEmpDesignation(EmpDesignations);
		e.setEmpPhoneNumber(EmpPhoneNumber);
		e.setEmpSalary(EmpSalary);

		int status = 0;
		try {
			status = EmployeeDao.insertEmployee(e);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		if (status > 0) {
			out.print("<p>Record saved successfully!</p>");
			request.getRequestDispatcher("Employee.html").include(request, response);
		} else {
			out.println("Sorry! unable to save record");
		}
		out.close();

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
