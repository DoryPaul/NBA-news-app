package com.test.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.xml.crypto.Data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import com.test.pojo.PlayerVo;
import com.test.pojo.PlayerWithBLOBs;
import com.test.pojo.QiuyuananalyseWithBLOBs;
import com.test.service.PlayerService;
import com.test.service.QiuyuananalyseService;

@Controller
public class QiuyuanController {

	@Autowired
	private PlayerService playerService;
	
	@Autowired
	private QiuyuananalyseService qiuyuananalyseService;
	
	@RequestMapping("/qiuyuan")
	public String qiuyua()throws Exception{
		return "qiuyuan/qiuyuan_add";
	}
	@RequestMapping("/qiuyuan_add")
	public ModelAndView  qiuyuanadd(PlayerWithBLOBs playerWithBLOBs,QiuyuananalyseWithBLOBs qiuyuan,PlayerVo playervo) throws Exception{
		String name=playerWithBLOBs.getName();
		String weizhi=playerWithBLOBs.getWeizhi();
		String shengao=playerWithBLOBs.getShengao();
		String tizhong=playerWithBLOBs.getTizhong();
		String qiudui=playerWithBLOBs.getBlengqiudui();
		CustomDateConverter converter=new CustomDateConverter();
		Date shengri=converter.convert(playerWithBLOBs.getData());
		playerWithBLOBs.setShengti(shengri);
		
		String touxiangpic=qiuyuan.getQiuyuanpicurl();
		String gongzi=qiuyuan.getGongzi();
		double score=qiuyuan.getScore(); 
		double assist=qiuyuan.getAssist(); 
		double block=qiuyuan.getBlock();
		double rebound=qiuyuan.getRebound();
		double steal=qiuyuan.getSteal();
		
		if(qiudui.equals("洛杉矶快船")){
			playerWithBLOBs.setQiuduiid(1);
		}else
		if(qiudui.equals("金州勇士")){
			playerWithBLOBs.setQiuduiid(2);
		}else
		if(qiudui.equals("克里夫兰骑士")){
			playerWithBLOBs.setQiuduiid(3);
		}else
		if(qiudui.equals("芝加哥公牛")){
			playerWithBLOBs.setQiuduiid(4);
		}else
		if(qiudui.equals("俄克拉荷马雷霆")){
			playerWithBLOBs.setQiuduiid(5);
		}else
		if(qiudui.equals("圣安东尼奥马刺")){
			playerWithBLOBs.setQiuduiid(6);
		}else
		if(qiudui.equals("休斯顿火箭")){
			playerWithBLOBs.setQiuduiid(7);
		}else
		if(qiudui.equals("犹他爵士")){
			playerWithBLOBs.setQiuduiid(8);
		}else
		if(qiudui.equals("孟菲斯灰熊")){
			playerWithBLOBs.setQiuduiid(9);
		}else
		if(qiudui.equals("丹佛掘金")){
			playerWithBLOBs.setQiuduiid(10);
		}else
		if(qiudui.equals("新奥尔良鹈鹕")){
			playerWithBLOBs.setQiuduiid(11);
		}else
		if(qiudui.equals("达拉斯小牛")){
			playerWithBLOBs.setQiuduiid(12);
		}else
		if(qiudui.equals("萨克拉门托国王")){
			playerWithBLOBs.setQiuduiid(13);
		}else
		if(qiudui.equals("明尼苏达森林狼")){
			playerWithBLOBs.setQiuduiid(14);
		}else
		if(qiudui.equals("洛杉矶湖人")){
			playerWithBLOBs.setQiuduiid(15);
		}else
		if(qiudui.equals("菲尼克斯太阳")){
			playerWithBLOBs.setQiuduiid(16);
		}else
		if(qiudui.equals("波士顿凯尔特人")){
			playerWithBLOBs.setQiuduiid(17);
		}else
		if(qiudui.equals("多伦多猛龙")){
			playerWithBLOBs.setQiuduiid(18);
		}else
		if(qiudui.equals("华盛顿奇才")){
			playerWithBLOBs.setQiuduiid(19);
		}else
		if(qiudui.equals("亚特兰大老鹰")){
			playerWithBLOBs.setQiuduiid(20);
		}else
		if(qiudui.equals("密尔沃基雄鹿")){
			playerWithBLOBs.setQiuduiid(21);
		}else
		if(qiudui.equals("印第安纳步行者")){
			playerWithBLOBs.setQiuduiid(22);
		}else
		if(qiudui.equals("迈阿密热火")){
			playerWithBLOBs.setQiuduiid(23);
		}else
		if(qiudui.equals("底特律活塞")){
			playerWithBLOBs.setQiuduiid(24);
		}else
		if(qiudui.equals("夏洛特黄蜂")){
			playerWithBLOBs.setQiuduiid(25);
		}else
		if(qiudui.equals("纽约尼克斯")){
			playerWithBLOBs.setQiuduiid(26);
		}else
		if(qiudui.equals("奥兰多魔术")){
			playerWithBLOBs.setQiuduiid(27);
		}else
		if(qiudui.equals("费城76人")){
			playerWithBLOBs.setQiuduiid(28);
		}else
		if(qiudui.equals("布鲁克林篮网")){
			playerWithBLOBs.setQiuduiid(29);
		}else
		if(qiudui.equals("波特兰开拓者")){
			playerWithBLOBs.setQiuduiid(30);
		}
		
		if(name.equals("")||weizhi.equals("")||shengao.equals("")||tizhong.equals("")|| 
				qiudui.equals("")|| shengri.equals("")||touxiangpic.equals("")||gongzi.equals("")||
				score==0||assist==0||block==0||rebound==0||steal==0){
			return null;
		}else {
			 playerService.insertSelective(playerWithBLOBs);
			 qiuyuananalyseService.insertSelective(qiuyuan);
			 List<PlayerWithBLOBs> playerList=playerService.selectAll(playervo);
				ModelAndView modelAndView=new ModelAndView();
				modelAndView.addObject("playerList",playerList);
				modelAndView.setViewName("qiuyuan/qiuyuan_search");
				return modelAndView;
		}	
	}
	
	@RequestMapping("/qiuyuan_search")
	public ModelAndView qiuyuansearch(PlayerVo playervo) throws Exception{
		List<PlayerWithBLOBs> playerList=playerService.selectAll(playervo);
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("playerList",playerList);
		modelAndView.setViewName("qiuyuan/qiuyuan_search");
		return modelAndView;
	}
	
	
	@RequestMapping("/qiuyuan_delete")
	public ModelAndView qiuyuandelete(Integer id,PlayerVo playervo)throws Exception{
		if(id.equals("")){
			return null;
		}else {
			playerService.deleteByPrimaryKey(id);
			List<PlayerWithBLOBs> playerList=playerService.selectAll(playervo);
			ModelAndView modelAndView=new ModelAndView();
			modelAndView.addObject("playerList",playerList);
			modelAndView.setViewName("qiuyuan/qiuyuan_search");
			return modelAndView;
		}
	}
	
	@RequestMapping("/qiuyuanbyid")
	public String qiuyuanbyid(Model model,Integer id)throws Exception{
		PlayerWithBLOBs playerWithBLOBs=playerService.selectByPrimaryKey(id);
		model.addAttribute("player", playerWithBLOBs);
		return "qiuyuan/qiuyuan_update";
		
	}
	
	@RequestMapping("/qiuyuan_update")
	public ModelAndView qiuyuanupdate(PlayerWithBLOBs playerWithBLOBs,PlayerVo playervo)throws Exception{
		String qiudui=playerWithBLOBs.getBlengqiudui();
		if(qiudui.equals("洛杉矶快船")){
			playerWithBLOBs.setQiuduiid(1);
		}else
		if(qiudui.equals("金州勇士")){
			playerWithBLOBs.setQiuduiid(2);
		}else
		if(qiudui.equals("克里夫兰骑士")){
			playerWithBLOBs.setQiuduiid(3);
		}else
		if(qiudui.equals("芝加哥公牛")){
			playerWithBLOBs.setQiuduiid(4);
		}else
		if(qiudui.equals("俄克拉荷马雷霆")){
			playerWithBLOBs.setQiuduiid(5);
		}else
		if(qiudui.equals("圣安东尼奥马刺")){
			playerWithBLOBs.setQiuduiid(6);
		}else
		if(qiudui.equals("休斯顿火箭")){
			playerWithBLOBs.setQiuduiid(7);
		}else
		if(qiudui.equals("犹他爵士")){
			playerWithBLOBs.setQiuduiid(8);
		}else
		if(qiudui.equals("孟菲斯灰熊")){
			playerWithBLOBs.setQiuduiid(9);
		}else
		if(qiudui.equals("丹佛掘金")){
			playerWithBLOBs.setQiuduiid(10);
		}else
		if(qiudui.equals("新奥尔良鹈鹕")){
			playerWithBLOBs.setQiuduiid(11);
		}else
		if(qiudui.equals("达拉斯小牛")){
			playerWithBLOBs.setQiuduiid(12);
		}else
		if(qiudui.equals("萨克拉门托国王")){
			playerWithBLOBs.setQiuduiid(13);
		}else
		if(qiudui.equals("明尼苏达森林狼")){
			playerWithBLOBs.setQiuduiid(14);
		}else
		if(qiudui.equals("洛杉矶湖人")){
			playerWithBLOBs.setQiuduiid(15);
		}else
		if(qiudui.equals("菲尼克斯太阳")){
			playerWithBLOBs.setQiuduiid(16);
		}else
		if(qiudui.equals("波士顿凯尔特人")){
			playerWithBLOBs.setQiuduiid(17);
		}else
		if(qiudui.equals("多伦多猛龙")){
			playerWithBLOBs.setQiuduiid(18);
		}else
		if(qiudui.equals("华盛顿奇才")){
			playerWithBLOBs.setQiuduiid(19);
		}else
		if(qiudui.equals("亚特兰大老鹰")){
			playerWithBLOBs.setQiuduiid(20);
		}else
		if(qiudui.equals("密尔沃基雄鹿")){
			playerWithBLOBs.setQiuduiid(21);
		}else
		if(qiudui.equals("印第安纳步行者")){
			playerWithBLOBs.setQiuduiid(22);
		}else
		if(qiudui.equals("迈阿密热火")){
			playerWithBLOBs.setQiuduiid(23);
		}else
		if(qiudui.equals("底特律活塞")){
			playerWithBLOBs.setQiuduiid(24);
		}else
		if(qiudui.equals("夏洛特黄蜂")){
			playerWithBLOBs.setQiuduiid(25);
		}else
		if(qiudui.equals("纽约尼克斯")){
			playerWithBLOBs.setQiuduiid(26);
		}else
		if(qiudui.equals("奥兰多魔术")){
			playerWithBLOBs.setQiuduiid(27);
		}else
		if(qiudui.equals("费城76人")){
			playerWithBLOBs.setQiuduiid(28);
		}else
		if(qiudui.equals("布鲁克林篮网")){
			playerWithBLOBs.setQiuduiid(29);
		}else
		if(qiudui.equals("波特兰开拓者")){
			playerWithBLOBs.setQiuduiid(30);
		}
		CustomDateConverter converter=new CustomDateConverter();
		Date data=converter.convert(playerWithBLOBs.getData());
		playerWithBLOBs.setShengti(data);
		playerService.updateByPrimaryKeySelective(playerWithBLOBs);
		List<PlayerWithBLOBs> playerList=playerService.selectAll(playervo);
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("playerList",playerList);
		modelAndView.setViewName("qiuyuan/qiuyuan_search");
		return modelAndView;
	}
}
