package site.metacoding.firstapp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PostController {
	
	@GetMapping("/category/listForm")
	public String 목록보기() {
		return "category/listForm";
	}

}