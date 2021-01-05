package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/novoJogador")
public class NovoJogador extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Novo Servlet");
		String atacante = request.getParameter("nome");
		PrintWriter out = response.getWriter();
		out.println("<p> Clube Atlético Mineiro </p>");
		out.print("<p> Jogador: " + atacante + " cadastrado com sucesso</p>");
	}

}
