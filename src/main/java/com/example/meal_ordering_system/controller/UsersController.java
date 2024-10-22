package com.example.meal_ordering_system.controller;

import com.example.meal_ordering_system.entity.Users;
import com.example.meal_ordering_system.service.UsersService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * (Users)表控制层
 *
 * @author makejava
 * @since 2021-02-04 12:51:21
 */
@Controller("usersController")
@RequestMapping("users")
@Scope("prototype")
public class UsersController {
    /**
     * 服务对象
     */
    @Autowired
    @Qualifier("usersService")
    private UsersService usersService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @RequestMapping ("queryById")
    public Users queryById(Integer id) {
        return this.usersService.queryById(id);
    }


    /**
     * 登录方法
     * @param user
     * @param request
     * @return
     */
    @RequestMapping("login")
    public String login(Users user, HttpServletRequest request){
        boolean loginType=usersService.login(user.getName(), user.getPwd());
        HttpSession session=request.getSession();
        if(loginType){
            session.setAttribute("user_session",usersService.queryById(usersService.queryByname(user.getName())));
            return "redirect:/menus/qiantai/allMenus";
        }else{
            session.setAttribute("message","用户名密码错误");
            return "qiantai/userLoginFail";
        }
    }
    //登出,地址/users/logout
    @RequestMapping("logout")
    public String logout(HttpSession session){
        //清除session
        session.removeAttribute("user_session");
        //重定向到登录页面的跳转方法
        return "redirect:/menus/qiantai/allMenus";
    }

    @RequestMapping("insert")
    public String insert(@Param("name") String name,@Param("pwd") String pwd,@Param("realname") String realname,@Param("sex") String sex,@Param("age") Integer age,@Param("card") String card,@Param("address") String address,@Param("Phone") String phone,@Param("email")String email,@Param("code")String code,@Param("type")Integer type){
        Users user=new Users(name,pwd,realname,sex,age,card,address,phone,email,code,type);
        usersService.insert(user);
        return "redirect:../public/qiantai/login.jsp";
    }


    @RequestMapping("update")
    public String update(HttpSession session,@Param("id")Integer id,@Param("name") String name,@Param("pwd") String pwd,@Param("realname") String realname,@Param("sex") String sex,@Param("age") Integer age,@Param("card") String card,@Param("address") String address,@Param("Phone") String phone,@Param("email")String email,@Param("code")String code,@Param("type")Integer type){
        Users user=new Users(id,name,pwd,realname,sex,age,card,address,phone,email,code,type);
        usersService.update(user);
        session.removeAttribute("user_session");
        return "redirect:/users/login";
    }
}
