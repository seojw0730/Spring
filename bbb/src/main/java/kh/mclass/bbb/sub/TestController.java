package kh.mclass.bbb.sub;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
//	private TestService ts = new TestService();
	@Autowired
	private TestService ts;
	
	//get post 막 쓰고 싶을 때 -> RequestMapping
//	@RequestMapping(method = RequestMethod.GET, path = "/test")
	//귀찮아서 나온거
	@GetMapping("/test")
	public String method1(String a, 
			HttpServletRequest request, 
			HttpSession ss, 
			HttpServletResponse response
			) {
		ss.setAttribute("c", "세션");
		request.setAttribute("serverTime", ts.method1());
//		try {
//			response.sendRedirect("test");
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		return "home";
	}
}
