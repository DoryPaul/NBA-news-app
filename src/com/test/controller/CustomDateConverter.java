package com.test.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.crypto.Data;

import org.springframework.core.convert.converter.Converter;

//日期转换器
public class CustomDateConverter implements Converter<String, Date>{

	@Override
	public Date convert(String source) {
		//实现 将日期串转成日期类型(格式是yyyy-MM-dd HH:mm:ss)
		Date a = null;
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
		try {
			//转成直接返回
			a=simpleDateFormat.parse(source);
		} catch (ParseException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		//如果参数绑定失败返回nul
		return a;
		
	}
}
