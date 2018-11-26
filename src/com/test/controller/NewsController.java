package com.test.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.test.pojo.Newinfo1WithBLOBs;
import com.test.pojo.Newsinfo1Vo;
import com.test.service.Newinfo1Service;

@Controller
public class NewsController {
	@Autowired
	private Newinfo1Service newinfo1Service;
	
	@RequestMapping(value="/newsmain")
	public ModelAndView main(HttpServletRequest request){
		 ModelAndView modelAndView = new ModelAndView();
		 modelAndView.setViewName("news/news_main");
		 return modelAndView;
	 }

	@RequestMapping("/news")
	public String news(int id){
		if(id==1){
		 return "news/news_add";
		}else if(id==2){
			 return "redirect:/news_search.action";
		}
		else {
			return null;
		}
	 }
	
	@RequestMapping("/news_add")
	public String newsadd(Newinfo1WithBLOBs record,HttpServletRequest request) throws Exception{
		String title=record.getNewstitle();
		String desc=record.getNewsdesc();
		String picurl=record.getNewspicurl();
	
		record.setNewstitle(title);
		record.setNewsdesc(desc);
		record.setNewspicurl(picurl);
		if(title.equals("")||desc.equals("")||picurl.equals("")){
			System.out.println("不能有空值");
			return "news/news_add";
		}else {
			newinfo1Service.insertSelective(record);
			return "news/newssuccess";
		}	
	}
	
	@RequestMapping("/news_search")
	public ModelAndView newssearch(Newsinfo1Vo newsinfo1Vo) throws Exception{
		List<Newinfo1WithBLOBs> newsList=newinfo1Service.selectAll(newsinfo1Vo);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("newsList", newsList);
		modelAndView.setViewName("news/news_search");
		return modelAndView;
	}
	
	@RequestMapping("/news_updatequery")
	public String newsupdatequery(Model model,@RequestParam(value = "newsid", required = true)Integer newsid)throws Exception{
		Newinfo1WithBLOBs newinfo1WithBLOBs=newinfo1Service.selectByPrimaryKey(newsid);
		model.addAttribute("newsbyid",newinfo1WithBLOBs);
		return "news/news_change";
	}
	
	@RequestMapping("/news_update")
	public String newsupdate(Newinfo1WithBLOBs record)throws Exception{
		newinfo1Service.updateByPrimaryKeySelective(record);
		return "news/newssuccess";
	}
	
	@RequestMapping("/news_delete")
	public String newsdelete(Integer newsid) throws Exception{
		if(newsid.equals("")){
			return null;
		}else {
			newinfo1Service.deleteByPrimaryKey(newsid);
			return "news/newssuccess";
		}

	}
	
}
