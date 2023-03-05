package site.metacoding.firstapp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PostController {
	
	@GetMapping("/post/detailForm")
	public String 상세보기() {
		System.out.println("post detail");
		return "post/detailForm";
	}

}