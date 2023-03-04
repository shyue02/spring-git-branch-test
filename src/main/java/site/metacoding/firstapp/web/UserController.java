package site.metacoding.firstapp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/user/joinForm") // 화면 출력되는지 확인 완료
    public String 회원가입페이지() {
    	System.out.println("회원가입페이지 구현");
        return "user/joinForm";
    }
    
    @GetMapping("/user/loginForm")
    public String 로그인페이지() {
    	System.out.println("로그인 페이지 완료");
    	return "user/loginForm";
    }
    
    @GetMapping("/user/leaveCheckForm")
    public String 회원탈퇴페이지() {
    	return "user/leaveCheckForm";
    }
    
    @GetMapping("/user/passwordCheckForm")
    public String 비밀번호체크() {
    	return "user/passwordCheckForm";
    }

}
