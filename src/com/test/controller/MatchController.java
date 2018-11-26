package com.test.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.test.pojo.Match1;
import com.test.pojo.MatchWithBLOBs;
import com.test.pojo.ZhiboWithBLOBs;
import com.test.service.Match1Service;
import com.test.service.MatchService;

@Controller
public class MatchController {
/*@Autowired
private MatchService matchService;*/
	
	@Autowired
	private Match1Service match1Service;

@RequestMapping(value="/matchmain")
public ModelAndView main(HttpServletRequest request){
	ModelAndView modelAndView=new ModelAndView();
	modelAndView.setViewName("match/match_main");
	return modelAndView;
}

@RequestMapping("/match")
public String match(int id){
	if(id==1){
		return "match/match_add";
	}else if (id==2) {
		return "redirect:/match_start.action";
	}else if (id==3) {
		return "redirect:/match_end.action";
	}else {
		return "redirect:/match_frame.action";
	}
}

@RequestMapping("/match_frame")
public ModelAndView main()throws Exception{
	 ModelAndView modelAndView = new ModelAndView();
	 modelAndView.setViewName("match/match_frame");
	return modelAndView;
}
@RequestMapping("/match_add")
/*public String matchadd(MatchWithBLOBs matchWithBLOBs)throws Exception{
	String team1=matchWithBLOBs.getTeam1();
	String team2=matchWithBLOBs.getTeam2();
	Integer te=matchWithBLOBs.getTeam1support();
	if(team1.equals("=请选择客队=")||team2.equals(">=请选择主队=")){
		return null;
	}else {
		matchService.insertmost(matchWithBLOBs);
		return "match/match_success";
	}
}*/
public String matchadd(Match1 record)throws Exception{
	String team1=record.getPlayer1();
	String team2=record.getPlayer2();
	//Integer te=matchWithBLOBs.getTeam1support();
	if(team1.equals("=请选择客队=")||team2.equals(">=请选择主队=")){
		return null;
	}else {
		match1Service.insertSelective(record);
		return "match/match_success";
	}
}

@RequestMapping("/match_start")
/*public ModelAndView main(MatchWithBLOBs matchWithBLOBs)throws Exception{
	List<MatchWithBLOBs> matchList=matchService.selectAll(matchWithBLOBs);
	ModelAndView modelAndView=new ModelAndView();
	modelAndView.addObject("matchList",matchList);
	modelAndView.setViewName("match/match_start");
	return modelAndView;
}*/
public ModelAndView main(Match1 record)throws Exception{
	List<Match1> matchList=match1Service.selectStart(record);
	ModelAndView modelAndView=new ModelAndView();
	modelAndView.addObject("matchList",matchList);
	modelAndView.setViewName("match/match_start");
	return modelAndView;
}
@RequestMapping("/match_end")
/*public ModelAndView main1(MatchWithBLOBs matchWithBLOBs)throws Exception{
	List<MatchWithBLOBs> matchListend=matchService.selectAll(matchWithBLOBs);
	ModelAndView modelAndView=new ModelAndView();
	modelAndView.addObject("matchListend",matchListend);
	modelAndView.setViewName("match/match_end");
	return modelAndView;
}*/
public ModelAndView main1(Match1 record)throws Exception{
	List<Match1> matchListend=match1Service.selectEnd(record);
	ModelAndView modelAndView=new ModelAndView();
	modelAndView.addObject("matchListend",matchListend);
	modelAndView.setViewName("match/match_end");
	return modelAndView;
}

@RequestMapping("/match_delete")
/*public String matchdelete(Integer id)throws Exception{
	if(id.equals("")){
		return null;
	}else {
		matchService.deleteByPrimaryKey(id);
		return "match/match_success";
	}
}*/
public String matchdelete(Integer id)throws Exception{
	if(id.equals("")){
		return null;
	}else {
		match1Service.deleteByPrimaryKey(id);
		return "match/match_success";
	}
}

@RequestMapping("/matchbyid")
/*public String matchbyid(Model model,Integer id)throws Exception{
	if(id.equals("")){
		return null;
	}else {
		MatchWithBLOBs matchWithBLOBs=matchService.selectByPrimaryKey(id);
		model.addAttribute("match", matchWithBLOBs);
		return "match/match_update";
	}
}*/
public String matchbyid(Model model,Integer id)throws Exception{
	if(id.equals("")){
		return null;
	}else {
		Match1 match1=match1Service.selectByPrimaryKey(id);
		model.addAttribute("match", match1);
		return "match/match_update";
	}
}
@RequestMapping("/match_update")
/*public String match_update(MatchWithBLOBs matchWithBLOBs)throws Exception{
	matchService.updateByPrimaryKeySelective(matchWithBLOBs);
	return "match/match_success";
}*/
public String match_update(Match1 match1)throws Exception{
	match1Service.updateByPrimaryKeySelective(match1);
	return "match/match_success";
}


@RequestMapping("/matchbyzhibo")
/*public String matchbyzhibo(Model model,Integer id)throws Exception{
	if(id.equals("")){
		return null;
	}else {
		MatchWithBLOBs matchWithBLOBs=matchService.selectByPrimaryKey(id);
		model.addAttribute("match", matchWithBLOBs);
		List<ZhiboWithBLOBs> zhiboList =matchService.selectByMatchid(id);
		model.addAttribute("zhiboList", zhiboList);
		return "match/match_zhibo";
	}
}*/
public String matchbyzhibo(Model model,Integer id)throws Exception{
	if(id.equals("")){
		return null;
	}else {
		Match1 match1=match1Service.selectByPrimaryKey(id);
		model.addAttribute("match", match1);
		List<ZhiboWithBLOBs> zhiboList =match1Service.selectByMatchid(id);
		model.addAttribute("zhiboList", zhiboList);
		return "match/match_zhibo";
	}
}
 @RequestMapping("/matchzhibo")
/* public String matchzhibo(HttpServletRequest request,Model model,
		 MatchWithBLOBs matchWithBLOBs,ZhiboWithBLOBs zhiboWithBLOBs )throws Exception{
	 Integer matchid;
	 matchid=Integer.valueOf( request.getParameter("matchid"));
	 matchService.updateByPrimaryKeySelective(matchWithBLOBs);
	 MatchWithBLOBs matchList=matchService.selectByPrimaryKey(matchid);
		model.addAttribute("match", matchList);
		String content=zhiboWithBLOBs.getContent();
	 
		if(content.equals("")){
			System.out.println("评论为空");
		}else{
		 matchService.insert(zhiboWithBLOBs);
		}
		List<ZhiboWithBLOBs> zhiboList =matchService.selectByMatchid(matchid);
		model.addAttribute("zhiboList", zhiboList);
		
	 return "match/match_zhibo";
 }
}*/
 public String matchzhibo(HttpServletRequest request,Model model,
		 Match1 match1,ZhiboWithBLOBs zhiboWithBLOBs )throws Exception{
	 Integer matchid;
	 String score;
	 matchid=Integer.valueOf( request.getParameter("matchid"));
	 score=request.getParameter("score");
	 match1.setId(matchid);
     match1.setScore(score);
	 // zhiboWithBLOBs.setMatchid(matchid);
	 match1Service.updateByPrimaryKeySelective(match1);
	 Match1 matchList=match1Service.selectByPrimaryKey(matchid);
		model.addAttribute("match", matchList);
		String content=zhiboWithBLOBs.getContent();
	 
		if(content.equals("")){
			System.out.println("评论为空");
		}else{
		 match1Service.insert(zhiboWithBLOBs);
		}
		List<ZhiboWithBLOBs> zhiboList =match1Service.selectByMatchid(matchid);
		model.addAttribute("zhiboList", zhiboList);
		
	 return "match/match_zhibo";
 }
}
