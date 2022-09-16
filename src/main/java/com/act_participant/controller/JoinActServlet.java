package com.act_participant.controller;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.act.model.ActService;
import com.act_participant.model.ActParticipantService;
import com.act_participant.model.ActParticipantVO;
import com.google.gson.Gson;
import com.mem.model.MemService;

@WebServlet("/joinAct")
public class JoinActServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
        res.setContentType("application/json, text/html; charset=UTF-8");
        res.setCharacterEncoding("UTF-8");
		System.out.println("fetch Request -> JoinActServlet");
		HttpSession session = req.getSession();
		Integer actNo =  (Integer) session.getAttribute("actNo");
		Integer memNo1 =  (Integer) session.getAttribute("memNo1");
		Integer memNo2 = (Integer) session.getAttribute("memNo2");
		Integer memNo3 = (Integer) session.getAttribute("memNo3");

		String memLoginAcc1 = (String) session.getAttribute("memNoAcc1");
		String memLoginAcc2 = (String) session.getAttribute("memNoAcc2");
		String memLoginAcc3 = (String) session.getAttribute("memNoAcc3");
	
		MemService memService = new MemService();
		String memAcc = memService.getOneMem(3).getMem_email();
		Gson gson = new Gson();
		ActService actService = new ActService();
		ActParticipantService actParticipantService = new ActParticipantService();
		
		List<ActParticipantVO> findActPartiMenNoList = 
		actParticipantService.getAll().stream().filter(actP -> actP.getAct_no() == actNo).toList();		
		findActPartiMenNoList.forEach(System.out::println);
		boolean isJoin = false;
		
		for (ActParticipantVO actParticipantVO : findActPartiMenNoList) {
			if(actParticipantVO.getMem_no() == memNo3) {
				isJoin = true;
			}
		}		
		
		System.out.println("isJoin = " + isJoin);
		
		Integer actMaxCount =
				actService.getAll().stream().filter(act -> act.getAct_no() == actNo).findFirst().get().getAct_max_count();
		System.out.println("actMaxCount: " + actMaxCount);
		Integer actCurrentCount =
				actService.getAll().stream().filter(act -> act.getAct_no() == actNo).findFirst().get().getAct_current_count();
		System.out.println("actCurrentCount: " + actCurrentCount);
		
		if(!isJoin) {
			if ((memAcc).equals(memLoginAcc3) && actMaxCount > actCurrentCount) {
			    LocalDateTime currentTime = LocalDateTime.now();
				actParticipantService.addActParticipant(actNo, memNo3, currentTime);			
				String resInfo ="";			
				actService.updateActPeopleAmount(actNo, actCurrentCount+1);
				resInfo = gson.toJson("加入成功");
				res.getWriter().write(resInfo);
			}else {
				String resInfo = gson.toJson("加入失敗，活動已超過最大限制人數，無法加入");
				res.getWriter().write(resInfo);	
			}
		}else {
			String resInfo = gson.toJson("你已經加入過此活動！");
			res.getWriter().write(resInfo);
		}
	}

}
