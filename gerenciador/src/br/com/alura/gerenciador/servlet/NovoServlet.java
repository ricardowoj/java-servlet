package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NovoServlet
 */
@WebServlet("/NovoServlet")
public class NovoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Novo Servlet");
		String atacante = request.getParameter("atacante");
		PrintWriter out = response.getWriter();
		out.println("<p> Aqui é GALO! </p>");
		out.print("<p> Atacante: " + atacante + "</p>");
	}

}
