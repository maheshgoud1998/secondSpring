package com.success;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class addController {
	@RequestMapping("add")
	public ModelAndView add(@RequestParam("t1")int i,@RequestParam("t2")int j) {
		
		
		ModelAndView mv=new ModelAndView();
		
		int k=i+j;
		mv.addObject("result",k);
		mv.setViewName("display.jsp");
		
		
		return mv;
		
	}

}
