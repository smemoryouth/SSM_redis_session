package com.tulun.web.controller;

import com.tulun.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * 描述:
 *
 * @Author shilei
 * @Date 2019/2/17
 */
@Controller
public class UserController {
    private Map<String, User> userMap = new HashMap<>();

    public UserController(){
        userMap.put("zhang san", new User("zhang san", "111", 20, "男"));
        userMap.put("gao yang", new User("gaoyang", "222",22, "女"));
        userMap.put("zhang tuo", new User("zhang tuo", "333",21, "男"));
    }

    @RequestMapping(value = "/")
    public String index(){
        return "login";
    }

    @RequestMapping(value = "/login", method=RequestMethod.POST)
    public String login(String name, String pwd, HttpSession session){
        User user = userMap.get(name);
        if(user != null){
            if(user.getPwd().equals(pwd)){
                session.setAttribute("user", user);
                return "redirect:/main";
            }
        }
        return "redirect:/";
    }

    @RequestMapping(value = "/main")
    public String main(Model model){
        model.addAttribute("users", userMap);
        return "main";
    }

    @RequestMapping(value = "/loginout")
    public String loginout(HttpSession session){
        session.invalidate();
        return "redirect:/";
    }
}