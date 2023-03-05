package site.metacoding.firstapp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PostController {
	@GetMapping("/post/listForm")
	public String 목록보기() {
		System.out.println("목록보기2");
		return "category/listForm";
	}
	
	@GetMapping("/post/writeForm")
	public String 게시글쓰기() {
		System.out.println("writeForm");
		return "post/writeForm";
	}
	
	@GetMapping("/post/updateForm")
	public String 게시글수정() {
		System.out.println("게시글수정!");
		return "post/updateForm";
	}

}