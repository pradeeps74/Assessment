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
		response.getWriter().append("Served at: ").append(request.getContextPath());
		 response.setContentType("text/html");  
	        PrintWriter out=response.getWriter();  
	          
	        String sid=request.getParameter("id");  
	        int id=Integer.parseInt(sid);  
	        String EmpId=request.getParameter("empId");  
	        String EmpName=request.getParameter("name");  
	        String EmpAge=request.getParameter("age");  
	        String EmpPhoneNumber=request.getParameter("phoneNo");  
	        String designations=request.getParameter("Designations");
	        String EmpSalary=request.getParameter("salary");  
	    	
	          
	        Employee e=new Employee();  
	        e.setId(id);
	        e.setEmpId(EmpId);
			e.setEmpName(EmpName);
			e.setEmpAge(EmpAge);
			e.setEmpDesignation(designations);
			e.setEmpPhoneNumber(EmpPhoneNumber);
			e.setEmpSalary(EmpSalary);
	          
	        int status=EmployeeDao.update(e);  
	        if(status>0){  
	            response.sendRedirect("ViewServlet");  
	        }else{  
	            out.println("Sorry! unable to update record");  
	        }  
	          
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
