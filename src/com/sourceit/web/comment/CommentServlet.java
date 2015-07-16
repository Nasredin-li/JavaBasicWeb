package com.sourceit.web.comment;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CommentServlet extends HttpServlet {
	StringBuffer list=new StringBuffer();
	int i=0;
	@Override
	public void init() throws ServletException {
		super.init();

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.getRequestDispatcher("comment/comment.jsp").forward(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		String username = req.getParameter("username");
		String textcomment = req.getParameter("textcomment");

		if (username != "" && textcomment != "") {
			if(i/2==0){
				list.append("	");
				i++;
			}
			list.append(username + ": " + textcomment);
			list.append("</br>");
			
		}
		
		
		req.setAttribute("notesList", list);
		req.getRequestDispatcher("comment/comment.jsp").forward(req, resp);

	}

}
