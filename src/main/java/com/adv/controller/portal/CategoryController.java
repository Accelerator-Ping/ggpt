package com.adv.controller.portal;

import com.adv.common.Const;
import com.adv.common.ResponseCode;
import com.adv.common.ServerResponse;
import com.adv.pojo.User;
import com.adv.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * ${DESCRIPTION}
 *
 * @author 李和平
 * @create 2018-05-08 16:04
 **/
@Controller
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private ICategoryService iCategoryService;


    @ResponseBody
    @RequestMapping("/list")
    //查询所有广告类
    public ServerResponse selectAllAdv(HttpSession session){
//        //验证
//        User user = (User) session.getAttribute(Const.CURRENT_USER);
//        if (user == null){
//            return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(),"用户未登录，请登录管理员");
//
//        }

        return iCategoryService.list();
    }

}
