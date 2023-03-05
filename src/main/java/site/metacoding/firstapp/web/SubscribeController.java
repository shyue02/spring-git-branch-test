package site.metacoding.firstapp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SubscribeController {
	
	@GetMapping("/post/listForm")
	public String 구독목록보기() {
		return "post/detailForm";
	}
}