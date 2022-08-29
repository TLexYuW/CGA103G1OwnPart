package com.act_pic.controller;

import java.io.IOException;
import java.io.InputStream;

import javax.mail.Part;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.act_pic.model.ActPicService;
import com.act_pic.model.ActPicVO;

@WebServlet("/uploadActImage")
public class UploadActImageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
        res.setContentType("image/jpeg, image/jpg, image/png, image/gif");
	    res.setCharacterEncoding("UTF-8");
	    
        System.out.println("Fetch Request -> UploadActImageServlet");
        
        
        
		InputStream is = req.getInputStream();
		byte[] image = org.apache.commons.io.IOUtils.toByteArray(is);
//		byte[] image = is.readAllBytes();
	
		ActPicVO actPicVO = new ActPicVO();
		actPicVO.setAct_no(6);
		actPicVO.setAct_pic(image);
		
		ActPicService actPicService = new ActPicService();
		actPicService.uploadActPic(actPicVO);

		
	}

}
