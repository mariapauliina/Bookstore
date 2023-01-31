package com.example.bookstore.web;
import org.springframework.stereotype.Controller;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;
@Controller
public class BookstoreController {
	

	@GetMapping("/index")
	public String showBooks(@RequestParam(name="title", required=false) String title,Model model)
	
	{
		model.addAttribute("title",title);
		return "title";

}
}





