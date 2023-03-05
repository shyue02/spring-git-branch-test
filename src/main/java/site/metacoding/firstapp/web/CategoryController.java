package site.metacoding.firstapp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CategoryController {
	
	@GetMapping("/post/detailForm")
	public String 상세보기() {
		System.out.println("post detail");
		return "post/detailForm";
	}

	@GetMapping("/post/listForm")
	public String 목록보기() {
		System.out.println("listForm1");
		return "post/listForm";
	}

	@GetMapping("/post/writeForm")
	public String 카테고리추가() {
		System.out.println("카테고리추가2");
		return "post/writeForm";
	}
}