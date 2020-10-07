package com.ojas.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.ojas.dao.FruitDAO;
import com.ojas.model.Fruit;

@WebServlet("/FruitList")
public class FruitList extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public FruitList() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
	   PrintWriter pw = response.getWriter();
		FruitDAO dao = new FruitDAO();
		ArrayList<Fruit> fruitList = dao.listFruits();
		pw.println("<table bgcolor=yellow align=center border=1>");
		for (Fruit e : fruitList) {
			pw.println("<tr><td>" + e.getName() + "</td>");
			pw.println("<td>" + e.getAddress() + "</td>");
			pw.println("<td>" + e.getEmail() + "</td>");
			pw.println("<td>" + e.getFruitid() + "</td>");
			pw.println("<td>" + e.getFruitname() + "</td>");
			pw.println("<td>" + e.getBrouncher() + "</td>");
		}
		pw.println("</table>");
	}
}
