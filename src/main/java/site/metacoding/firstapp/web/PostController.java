package site.metacoding.firstapp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PostController {
	
	@GetMapping("/category/listForm")
	public String 목록보기() {
		System.out.println("목록보기2");
		return "category/listForm";
	}

}