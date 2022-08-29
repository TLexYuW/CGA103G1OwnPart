package com.act.controller;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.act.model.ActService;
import com.act.model.ActVO;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.util.LocalDateTimeDeserializer;
import com.util.LocalDateTimeSerializer;

@WebServlet("/getOneAct")
public class GetOneActServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
        res.setContentType("text/html; charset=UTF-8");
        System.out.println("actSearchListPage <a> Request -> GetOneActServlet");
        
		String action = req.getParameter("action");
        if ("actInner".equals(action)) {
        	try {
				Integer actNo = Integer.parseInt(req.getParameter("actNo")); 
				ActService actService = new ActService();
				ActVO actVO = actService.getAll().stream().filter(act -> act.getAct_no() == actNo).findFirst().get();		
				GsonBuilder gsonBuilder = new GsonBuilder();  
				gsonBuilder.registerTypeAdapter(LocalDateTime.class, new LocalDateTimeSerializer());      
				gsonBuilder.registerTypeAdapter(LocalDateTime.class, new LocalDateTimeDeserializer());
				Gson gson = gsonBuilder.setPrettyPrinting().create();
				String personJsonString = gson.toJson(actVO);
				res.getWriter().write(personJsonString);
				res.sendRedirect("/CGA103G1/frontend/act/actDetailJoinPage.html");
				return;
			} catch (Exception e) {
				res.sendRedirect("/CGA103G1/frontend/act/actSearchListPage.html");
				return;
			}
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
	}

}
