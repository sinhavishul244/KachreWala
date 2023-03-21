package springmvc.controller;

import java.net.http.HttpRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import springmvc.dao.UserDao;
import springmvc.entities.User;
import springmvc.model.UserModel;

@Controller
public class ContactController {
	
	@RequestMapping("/signup")
	public String signup() {
		System.out.println("This is home url");
		return "register";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/home")
	public String home() {
		return "home";
	}
	
	
	@RequestMapping(path="/Register",method = RequestMethod.POST)
	public String register(@ModelAttribute("userModel") UserModel userModel,Model model ) 
	{
		
		
		System.out.println(userModel);
		
		User user=new User();
		
		user.setName(userModel.getUserName());
		user.setAddress(userModel.getUserAddress());
		user.setEmail(userModel.getUserEmail());
		user.setPassword(userModel.getUserPassword());
		user.setPhone(userModel.getUserPhone());
		user.setMoneyEarned(0);
		user.setPointsEarned(0);
		user.setCurrentCollection(0);
		user.setUserId(userModel.getUserId());
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		UserDao impl1 = context.getBean("impl1", UserDao.class);
		
		impl1.insert(user);
		
		return "success";
	}
	
	@RequestMapping(path="/Login",method=RequestMethod.POST)
	public ModelAndView login(@RequestParam("userId") String userId , @RequestParam("userPassword") String userPassword,HttpServletRequest req,HttpServletResponse res) 
	{
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			
		}
		ModelAndView modelAndView=new ModelAndView();
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		UserDao impl1 = context.getBean("impl1", UserDao.class);
		
		User user=new User();
		
		user=impl1.verifyUser(userId, userPassword);
		
		if(user==null) {
			modelAndView.setViewName("error");
		}
		else {
			HttpSession session =req.getSession();
			session.setAttribute("currentUser", user);
			try {
				res.sendRedirect("/WEB-INF/pages/dashboard/home.jsp");
			} catch (Exception e) {
				// TODO: handle exception
			}
			modelAndView.setViewName("home");
		}
		
		
		
		
		return modelAndView;
	}

}
