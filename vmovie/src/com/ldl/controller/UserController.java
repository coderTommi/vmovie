package com.ldl.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ldl.ibatis.dbcp.pojo.User;

@Controller
public class UserController {/*
	
	@Resource
	private OrderService orderService;
	

	@RequestMapping(value="/buy")
	public ModelAndView toBuy() throws Exception{
		return new ModelAndView("buy");
	}
	
	@RequestMapping(value="/buySuccess")
	public ModelAndView toBuySuccess() throws Exception{
		return new ModelAndView("buySuccess");
	}
	

	@RequestMapping(value="/doIt" ,method=RequestMethod.POST)
	public String toSubmit(@ModelAttribute(value="com.ldl.ibatis.dbcp.pojo.Order")Order order,
			HttpServletResponse resp) throws Exception{
		orderService.addOrder(order);
		return "redirect:buySuccess";
	}
	
	@RequestMapping(value="/toLogin")
	public ModelAndView toLogin() throws Exception{
		return new ModelAndView("login");
	}
	
	@RequestMapping(value="/main")
	public ModelAndView toMain() throws Exception{
		return new ModelAndView("main");
	}
	
	
	@RequestMapping(value="/login")
	@ResponseBody
	public Map login(@ModelAttribute(value="com.ldl.ibatis.dbcp.pojo.User")User user,
			HttpServletRequest req,HttpServletResponse resp) throws Exception{
		Map<String,Object> map = new HashMap<String, Object>();
		User newUser = orderService.login(user);
		if(newUser == null){
			map.put("ErrorMsg", "ErrorMsg");
//			JSONObject.toJSON(m);
		}else{
			HttpSession s = req.getSession();
			s.setAttribute("User", newUser);
		}
		return map;
	}
	
	@RequestMapping(value="/orderList")
	@ResponseBody
	public Map qryOrderList(HttpServletRequest req,HttpServletResponse resp) throws Exception{
		Map<String,Object> map = new HashMap<String, Object>();
		
		List<Order> list = orderService.qryOrderList();
		map.put("OrderList", list);
		
		return map;
	}
	
	
	@RequestMapping(value="/updateOrder")
	@ResponseBody
	public Map updateOrder(@RequestParam(value="orderId",required=true)String orderId) throws Exception{
		Map<String,Object> map = new HashMap<String, Object>();
		
		try{
			orderService.updateOrder(orderId);
		}catch(Exception e){
			e.printStackTrace();
			map.put("ErrorMsg", "update order Error");
		}
		return map;
	}
	
	@RequestMapping(value="/delOrder")
	@ResponseBody
	public Map udelOrder(@RequestParam(value="orderId",required=true)String orderId) throws Exception{
		Map<String,Object> map = new HashMap<String, Object>();
		
		try{
			orderService.delOrder(orderId);
		}catch(Exception e){
			e.printStackTrace();
			map.put("ErrorMsg", "update order Error");
		}
		return map;
	}
	
	
*/}
