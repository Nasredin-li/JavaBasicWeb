package com.sourceit.web.pshen.ht23;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Note extends HttpServlet {
   
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
 
    		req.getRequestDispatcher("Comment.jsp").forward(req, resp);

    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    		String text = req.getParameter("comment");
    		req.setAttribute("text", req.getParameter("comment"));
    		req.getRequestDispatcher("Comment.jsp").forward(req, resp);
    		PrintWriter out = resp.getWriter();
 			out.print("<p>text<input/>");
    		
    	
    }
    
}



