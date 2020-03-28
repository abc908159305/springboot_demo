package com.springboot.springboot_demo.web;

import com.springboot.springboot_demo.pojo.User;
import com.springboot.springboot_demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@RestController
public class LoginController {
    @Autowired
    UserService userService;
    @PostMapping(value = "/logins")
    public String login(@RequestBody User user,HttpSession session) throws IOException {
//        User u = userService.get(user.getId());
//        if (null == u){
//            userService.add(user);
//        }
        User u = (User) session.getAttribute("user");
        if(null == u){
            session.setAttribute("user",user);
            User u2 = (User) session.getAttribute("user");
            System.out.println(u2.getName());
        }
        return "success";
    }
}
