package org.phoenix.openid.openidwebapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/secure/home.do")
    public ModelAndView displayHome()    {
    return new ModelAndView("home");
}
}
