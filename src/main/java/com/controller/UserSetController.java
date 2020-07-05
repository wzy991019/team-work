package com.controller;

import com.model.User;
import com.service.UserSetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

//人员设置
@Controller
public class UserSetController {

    @Autowired
    private  UserSetService userSetService;

    //将查询到的用户信息显示到页面上
    @RequestMapping("/showUserInfo")
    public ModelAndView showUserInfo(String username, HttpSession session) {
        System.out.println(username+"hhhhhhhhhh");
        List<User> list = userSetService.showUserInfo(username);
        for (User user:list) {
            System.out.println(user);
        }
        session.setAttribute("list",list);

        ModelAndView mv = new ModelAndView();

       // mv.addObject("nn", "okhaha");
        mv.setViewName("redirect:/admin-list.jsp");
        return mv;
    }
}
