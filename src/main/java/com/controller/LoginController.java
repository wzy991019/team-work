package com.controller;

import com.model.User;
import com.model.UserStatus;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 用户操作
 */
@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping("/toLogin")
    public String toLogin(){
        return "redirect:/login.jsp";
    }
    //用户登录校验
    @RequestMapping("/login")
    public String login(String uname, String upwd, HttpSession session) {
        User user = userService.login(uname, upwd);
        session.setAttribute("user", user);
        if (user != null) {
            return "index";
        }
        return "404";
    }

    //匹配用户名
//    @RequestMapping("/isUsername")
//    public void isUsername(String username, HttpServletResponse response) {
//        System.out.println(username);
//        Integer integer = userService.isUsername(username);
//        try {
//            if (integer > 0) {
//
//                response.getWriter().print("true");
//            } else {
//                response.getWriter().print("false");
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    //匹配密码
    @RequestMapping("/isPassword")
    public void isPassword(String username, String password, HttpServletResponse response) {
        User user = userService.isPassword(username);
        try {
            if (!user.getUpwd().equals(password)) {
                response.getWriter().print("false");
            } else {
                response.getWriter().print("true");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("/toRegister")
    public String toRegister(){
        return "register";
    }
    //注册功能
    @RequestMapping("/Register")
    public ModelAndView register(String uname, String upwd, String udate, String wid, String prid) throws ParseException {
        Date dateTime = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = sdf.format(dateTime);
        User user = new User(null, uname, upwd, time, wid,prid);
        Integer integer = userService.Register(user);
        ModelAndView mv = new ModelAndView();
        if (integer > 0) {
            mv.setViewName("toLogin");
        } else {
            mv.setViewName("register");
        }

        return mv;
    }

    //判断人员账号的启用、禁用
    @RequestMapping("/checkUserStatus")
    public void checkUserStatus(String uname, HttpServletResponse response){
        UserStatus userStatus = userService.checkUserStatus(uname);
        PrintWriter pw = null;
        try {
            pw = response.getWriter();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Integer status = userStatus.getUserStatus();

        if (status==1){
            pw.write("false");
        }else {
            pw.write("true");
        }

    }
}