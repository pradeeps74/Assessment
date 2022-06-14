package com.vastpro.studentCrud;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ViewServlet
 */
@WebServlet("/ViewServlet")
public class ViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<a href='Employee.html'>Add New Employee</a>");
		out.println("<h1>Employees List</h1>");

		List<Employee> list = EmployeeDao.getAllEmployees();

		out.print("<table border='1' width='100%'");
		out.print("<tr><th>Id</th><th>EMpId</th><th>Name</th><th>Age</th><th>Designations</th><th>Phone number</th><th>salary</th></tr>");
		for (Employee e : list) {
			out.print("</td><td>" + e.getId() +"</td><td>" + e.getEmpId() + "</td><td>" + e.getEmpName()+"</td><td>" + e.getEmpAge() + "</td><td>"
					+ e.getEmpDesignation() + "</td><td>" + e.getEmpPhoneNumber()+"</td><td>" + e.getEmpSalary() + "</td></tr>");
		}
		out.print("</table>");

		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
