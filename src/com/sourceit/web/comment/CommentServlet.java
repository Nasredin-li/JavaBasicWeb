package com.sourceit.web.comment;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CommentServlet extends HttpServlet{
	
	@Override
	public void init() throws ServletException {
		super.init();
		
		
		
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("comment/comment.jsp").forward(req, resp);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String textcomment = req.getParameter("textcomment");
		PrintWriter out = resp.getWriter();
		out.print("<p>");
		out.print(username);
		out.print(" writes:<br></p>");
		out.print("<p>");
		out.print(textcomment);
		out.print("<br></p>");
	}
		
}
