package com.mc.mvc.index.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


// @Controller
// 1. 해당 클래스의 인스턴스를 ApplicationContext에 빈으로 등록
// 2. Controller 역활을 수행하기 위한 Annotation을 사용할 수 있게 해준다.
//		@RequstMapping : 컨트롤러의 메서드와 매핑시킬 요청 url을 지정, 원하는 http method를 지정할 수 있다.
//		@GetMapping	   : 컨트롤러의 메서드와 매핑시킬 GET 방식의 요청 url을 지정
//		@PostMapping   : 컨트롤러의 메서드와 매핑시킬 POST 방식의 요청 url을 지정

@Controller
public class IndexController {
	
	
	// /[contextPath]/index
	// 일반적인 Spring의 Controller는 String의 viewName 또는 ModelAndView 객체에 viewName을 담아서 반환
	// 만약 return이 없을 경우 getMapping에 있는 주소와 동일한 이름의 viewName을 반환한 것으로 간주
	// return "index"가 생략된 것과 같다.
	// ViewResolver에 의해 /WEB-INF/views/index.jsp로 forward가 된다.
	
	@GetMapping("/index")
	public String index() {return"/index";}
	
	
	
	
}
