package com.test.controller;

import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.Session;
import org.aspectj.weaver.ast.Var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.test.pojo.User;
import com.test.pojo.UserQueryVo;
import com.test.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping("/login")
	public String login(){
		return "login";
	}
	 @RequestMapping(value="/checklogin")
	 public String checklogin(HttpSession session,HttpServletRequest request,String username,String password) throws Exception{
		 //调用login方法来验证是否是注册用户
	        User user = userService.checkLogin(username, password);
	    
	        if (user != null) {
	            if (user.getUsername().equals(username) && user.getPassword().equals(password)){
	            	// 在session中保存用户身份信息
	    			session.setAttribute("username", username);
	    			//session.setAttribute("isLogin", "yes");
	    			return "redirect:/main.action";
	            	//return "redirect:/userList.action"; 
	            }
	        else {
	        	request.setAttribute("errorLogin", "用户名或密码错误");
	        	return "login";
	        	//request.getSession().setAttribute("message", "用户名或密码错误！");
			}
	         }else {
	        	 request.setAttribute("errorLogin", "用户名或密码错误");
	        	 return "login";
			}

	    }
	 
	@RequestMapping(value="/register")
	 public String register( User user,HttpServletRequest request) throws Exception{
		 String username=request.getParameter("resname");
		 String password=request.getParameter("respassword");
		 String identity=request.getParameter("identity");
		 user.setUsername(username);
		 user.setPassword(password);
		 user.setIdentity(identity);
		 if(username!=null&&password!=null&&identity!=null){
			 userService.register(user); 
			 return "redirect:login";
		 }else{
			 return "register";
		 }
	 }
	 
	 @RequestMapping(value="/userList")
	 public ModelAndView userList(HttpServletRequest request,UserQueryVo userQueryVo)throws Exception{
		
		 List<User> userList=userService.userList(userQueryVo);
			// 返回ModelAndView
			ModelAndView modelAndView = new ModelAndView();
			// 相当 于request的setAttribut，在jsp页面中通过itemsList取数据
			modelAndView.addObject("userList", userList);
			modelAndView.setViewName("user/userList");
				return modelAndView;
		 
	 }
	 @RequestMapping("/deleteUser")
	 public String deleteUser(Integer user_id)throws Exception{
		 if(user_id!=null){
		userService.deleteByPrimaryKey(user_id);
		 //userService.deleteByPrimaryKey(4);
		return "success";}
		 else {
			return null;
		}
		 
	 }
	 
	 @RequestMapping("/findUser")
	 public ModelAndView findUserByName(UserQueryVo userQueryVo)throws Exception{
		 List<User> userList=userService.findUserByName(userQueryVo);
		// 返回ModelAndView
			ModelAndView modelAndView = new ModelAndView();
			// 相当 于request的setAttribut，在jsp页面中通过itemsList取数据
			modelAndView.addObject("userList", userList);
			modelAndView.setViewName("user/userList");
				return modelAndView;
	 }
	 
	 @RequestMapping("/userbyid")
	 public String userbyid(Model model,Integer id)throws Exception{
		 User user=userService.selectByPrimaryKey(id);
		 model.addAttribute("user", user);
		 return "user/user_change";
	 }
	 
	 @RequestMapping("/userupdate")
	 public ModelAndView userUpdate(User user,Integer id,UserQueryVo userQueryVo)throws Exception{
		 user.setPassword("202cb962ac59075b964b07152d234b70");
		 userService.updateByPrimaryKeySelective(user);
		 List<User> userList=userService.userList(userQueryVo);
			// 返回ModelAndView
			ModelAndView modelAndView = new ModelAndView();
			// 相当 于request的setAttribut，在jsp页面中通过itemsList取数据
			modelAndView.addObject("userList", userList);
			modelAndView.setViewName("user/userList");
				return modelAndView;
		 
	 }
}
