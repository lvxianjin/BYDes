package com.qdlg.controller;

import com.qdlg.mybatis.IUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {
    @Autowired
    private IUser iUser = null;
    @RequestMapping("index.html")
    public String getUser(HttpServletRequest request){
        System.out.print("123");
        String name = iUser.getNameById();
        System.out.print(name);
        request.setAttribute("name",name);
        return "index";
    }
}
