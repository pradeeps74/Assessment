package com.vastpro.studentCrud;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EditServlet
 */
@WebServlet("/EditServlet")
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditServlet() {
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
	        PrintWriter out=response.getWriter();  
	        out.println("<h1>Update Employee</h1>");  
	        String sid=request.getParameter("txtEmpId");  
	       // int id=Integer.parseInt(sid);  
	          
	        Employee e=EmployeeDao.getEmployeeById(sid);
	          
	        out.print("<form action='EditServlet2' method='post'>");  
	        out.print("<table>");  
	        out.print("<tr><td></td><td><input type='text' name='id' value='"+e.getId()+"'/></td></tr>");  
	        out.print("<tr><td>EmpId:</td><td><input type='hidden' name='empId' value='"+e.getEmpId()+"'/></td></tr>");  
	        out.print("<tr><td>Name:</td><td><input type='text' name='name' value='"+e.getEmpName()+"'/></td></tr>");  
	        out.print("<tr><td>Age:</td><td><input type='text' name='age' value='"+e.getEmpAge()+"'/></td></tr>");  
	        out.print("<tr><td>Designations:</td><td>");  
	        out.print("<select name='Designations' style='width:150px'>");  
	        out.print("<option>Developer</option>");  
	        out.print("<option>Tester</option>");  
	        out.print("<option>FullStack developer</option>");  
	        out.print("<option>Other</option>");  
	        out.print("</select>");  
	        out.print("</td></tr>");  
	        out.print("<tr><td>Phone NO:</td><td><input type='text' name='phoneNo' value='"+e.getEmpPhoneNumber()+"'/></td></tr>");
	        out.print("<tr><td>Salary:</td><td><input type='text' name='salary' value='"+e.getEmpSalary()+"'/></td></tr>");  
	        out.print("<tr><td colspan='2'><input type='submit' value='Edit & Save '/></td></tr>");  
	        out.print("</table>");  
	        out.print("</form>");  
	          
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
