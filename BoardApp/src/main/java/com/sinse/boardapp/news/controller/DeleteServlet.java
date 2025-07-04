package com.sinse.boardapp.news.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sinse.boardapp.repository.NewsDAO;

public class DeleteServlet extends HttpServlet {
	NewsDAO newsDAO = new NewsDAO();

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		int news_id = Integer.parseInt(request.getParameter("news_id"));
		
		newsDAO.delete(news_id);
	}
}
