package com.vastpro.studentCrud;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EditServlet2
 */
@WebServlet("/EditServlet2")
public class EditServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		//pw.print("save servlet");
		
		String empid=request.getParameter("txtEmpId");
		String designation=request.getParameter("txtDesignation");
		String salary=request.getParameter("txtSalary");
		
		
		Employee e=new Employee();
	    e.setEmpId(empid);
		e.setEmpDesignation(designation);
		e.setEmpSalary(salary);
		
		int status = EmployeeDao.update(e);
		pw.print("connection success");
		if(status>0)
		{
			pw.print("data saves successfully ");
			response.sendRedirect("Employee.html");
		}
		else 
		{
			pw.print("unable to upadte the data");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
