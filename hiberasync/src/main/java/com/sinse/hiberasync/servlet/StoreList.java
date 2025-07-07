package com.sinse.hiberasync.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.sinse.hiberasync.repository.StoreDAO;
import com.sinse.hiberasync.util.Message;

public class StoreList extends HttpServlet {
StoreDAO storeDAO = new StoreDAO();

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	response.setContentType("apllication/json");
	Gson gson = new Gson();
	PrintWriter out = response.getWriter();
	Message message = new Message();
	try {
		List list = storeDAO.selectAll();
		out.print(gson.toJson(list)); // 클라이언트가 받을 JSON 문자열 스트림에 넣기
	} catch (Exception e) {
		e.printStackTrace();
		message.setResult("fail");
		message.setMsg(e.getMessage());
		out.print(gson.toJson(message));
	}
	
	
	}
}