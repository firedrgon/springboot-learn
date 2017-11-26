package com.ypvoid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Yuanping on 2017/11/26.
 * thymeleaf controller
 */
@Controller
@RequestMapping("/templates")
public class TemplatesController {
    @RequestMapping("/hello")
    public String hello(Model model) {
//        ModelAndView mv = new ModelAndView("hello");
//        mv.addObject("name", "ypvoid");

        model.addAttribute("name", "ypvoid");

        return "hello";
    }

    @RequestMapping("/helloFtl")
    public String helloFtl(Model model) {
        model.addAttribute("name", "ypvoid");
        return "helloFtl";
    }
}
