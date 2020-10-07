package com.ojas.controller;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.ojas.dao.FruitDAO;
import com.ojas.model.Fruit;
@WebServlet("/FruitRegistration")
public class FruitRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public FruitRegistration() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	
	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw =response.getWriter();
        String name=request.getParameter("name").trim();
        String address=request.getParameter("address").trim();
        String email=request.getParameter("email").trim();
        String fruitid=request.getParameter("fruitid").trim();
        String fruitname=request.getParameter("fruitname").trim();
        String bouncher=request.getParameter("bouncher").trim();
        System.out.println(name+" "+address+" "+email+" "+fruitid+" "+fruitname+" "+bouncher);
        Fruit reg = new Fruit(name,address,email,fruitid,fruitname,bouncher);
        FruitDAO obj = new FruitDAO();
        if(obj.addFruit(reg)) {
            pw.println("<h1 color=orange>you have registered successfully</h1>");
            pw.println("<br><a href=FruitList>display</a>");
           
        }
        else {
            pw.println("try again");
        }
    }
	

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
