package com.spmall.user.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spmall.common.model.User;
import com.spmall.user.service.UserService;

@Controller
public class UserController {

	@Resource UserService userService;
	@RequestMapping("/test")
	public ModelAndView test() throws Exception{
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("test");
		List<User> list=userService.findUserList();
		modelAndView.addObject("itemsList", list);
		return modelAndView;
	}
}
