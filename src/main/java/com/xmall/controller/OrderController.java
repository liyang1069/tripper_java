package com.xmall.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xmall.model.Order;

@RequestMapping(value = "/orders")
public class OrderController extends ApplicationController {
	
	@ResponseBody
	@RequestMapping(value = "/index/{user_id}", method = RequestMethod.GET)
	public String index(@PathVariable("user_id") int user_id){
		//List<Commodity> list = null;//new ArrayList<Commodity>();
		return "";
	}
	
	@ResponseBody
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public String edit(@PathVariable("id") int id){
		return "";
	}
	
	@ResponseBody
	@RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
	public String update(@PathVariable("id") int id,Order commodity){
		return "";
	}
	
	@ResponseBody
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String crate(Order commodity){
		return "";
	}
}
