package com.javamadman.web.servlet;

import com.javamadman.entitys.Area;
import com.javamadman.entitys.User;
import com.javamadman.service.UserService;
import com.javamadman.service.impl.AreaServiceImpl;
import com.javamadman.service.impl.UserServiceImpl;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by IntelliJ IDEA
 * Date: 2018/4/15
 * Time: 21:19
 * 处理用户相关业务
 * @author zx
 */
@WebServlet("/UserServlet")
public class UserServlet extends BaseServlet {
    /**
     * 测试查询所有
     * @param request
     * @param response
     * @return 跳转路径
     */
    public String test(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        AreaServiceImpl areaService = new AreaServiceImpl();
        List<Area> all = null;
        try {
            all = areaService.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        request.setAttribute("all",all);
        return "/success.jsp";
    }

    /**
     * 用户注册
     * @param request
     * @param response
     * @return 跳转路径
     * @throws ServletException
     * @throws IOException
     */
    public String register(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        try {
            //设置字符编码格式
            request.setCharacterEncoding("utf-8");
            //获取注册相关信息
            String phone =request.getParameter("phone");
            int checkCode = Integer.parseInt(request.getParameter("checkCode"));
            int verifyCode = Integer.parseInt(request.getParameter("verifyCode"));
            String uPassword = request.getParameter("uPassword");
            //封装注册信息到用户实体
            User user = new User();
            BeanUtils.populate(user,request.getParameterMap());
            //调用用户添加方法，实现注册功能
            UserService userService = new UserServiceImpl();
            int row = userService.save(user);
            if(row>0) {
                //注册成功转发到一个信息页面msg.jsp
                request.setAttribute("msg","用户注册成功");
            }

        } catch (Exception e) {
            e.printStackTrace();
            //有异常就转发到一个信息页面msg.jsp
            request.setAttribute("msg",e.getMessage());
            return "/jsp/msg.jsp";
        }
        return "/jsp/msg.jsp";
    }

    /**
     * 用户登录
     * @param request
     * @param response
     * @return 跳转路径
     * @throws ServletException
     * @throws IOException
     */
    public String login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        try {
            //设置字符编码格式
            request.setCharacterEncoding("utf-8");
            //获取用户手机号
            String phone =request.getParameter("phone");
            //调用通过手机号查询方法，实现登录功能
            UserService userService = new UserServiceImpl();
            User userByPhone = userService.findUserByPhone(phone);
            if(userByPhone != null) {
                //登录成功转发到一个信息页面msg.jsp
                request.setAttribute("msg","用户登录成功");
                //登录成功，保存用户登录信息
                request.getSession().setAttribute("userByPhone",userByPhone);
                /*//跳转到首页index.jsp
                response.sendRedirect(request.getContextPath()+"index.jsp");*/
            }


        } catch (Exception e) {
            e.printStackTrace();
            //登录失败转发到一个信息页面msg.jsp
            request.setAttribute("msg",e.getMessage());
            return "/jsp/msg.jsp";
        }
       return "/jsp/msg.jsp";
    }

}
