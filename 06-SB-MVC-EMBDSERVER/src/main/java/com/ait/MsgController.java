package com.ait;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
public class MsgController {
	
    @GetMapping("/")
	public String welcomeMsg(Model model) {
		
		model.addAttribute("msg","Helloooo...!!!!!");
		return "index";
		
	}
    @GetMapping("/hi")
   
    public String sayHi() {
    	String msg = "Hii.......!!!";
		return msg;
    	
    }

}
