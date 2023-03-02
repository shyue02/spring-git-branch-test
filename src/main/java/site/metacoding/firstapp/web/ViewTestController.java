package site.metacoding.firstapp.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ViewTestController {

    @GetMapping("/user/loginForm") // 화면 출력되는지 확인 완료
    public String 로그인페이지() {
        return "user/loginForm";
    }

    @GetMapping("/user/joinForm") // 화면 출력되는지 확인 완료
    public String 회원가입페이지() {
        return "user/joinForm";
    }

    @GetMapping({ "/mainForm", "/" }) // 화면 출력되는지 확인 완료
    public String 메인페이지() {
        return "mainForm";
    }

    @GetMapping("/category/listForm") // 화면 출력되는지 확인 완료
    public String 카테고리리스트() {
        return "category/listForm";
    }

    @GetMapping("/category/updateForm") // 화면 출력되는지 확인 완료
    public String 카테고리수정() {
        return "category/updateForm";
    }

    @GetMapping("/category/writeForm") // 화면 출력되는지 확인 완료
    public String 카테고리등록() {
        return "category/writeForm";
    }

    @GetMapping("/subscribe/listForm")
    public String 구독목록() {
        return "category/listForm";
    }

    @GetMapping("/post/{id}")
    public String 게시글상세보기(@PathVariable Integer id, Model model) {
        return "/post/detailForm";
    }
}
