package com.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;

import com.ac_pic.model.AcPicService;
import com.ac_pic.model.AcPicVO;

public class TestMain {

	public static void main(String[] args) {
		String createTime = "2022-08-21 23:04:30";
		System.out.println(createTime);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss",Locale.TAIWAN);
		LocalDateTime time = LocalDateTime.parse(createTime, formatter);
		System.out.println(time);
		
		
//		String dateTimeString = "18-04-2019 12:14:46";
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss", Locale.US);
//        LocalDateTime ldt = LocalDateTime.parse(dateTimeString , dtf);
//        System.out.println(ldt);
		
		
	}

}
