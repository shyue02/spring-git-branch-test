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

	@GetMapping("/post/listForm")
	public String 목록보기() {
		System.out.println("listForm1");
		return "post/listForm";
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