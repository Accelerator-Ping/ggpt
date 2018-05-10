package com.adv.controller.backend;

import com.adv.common.Const;
import com.adv.common.ResponseCode;
import com.adv.common.ServerResponse;
import com.adv.pojo.Category;
import com.adv.pojo.User;
import com.adv.service.ICategoryService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * ${DESCRIPTION}
 *
 * @author 李和平
 * @create 2018-05-08 18:04
 **/
@Controller
@RequestMapping("/ht/category")
public class CategoryManageController {

    @Autowired
    private ICategoryService iCategoryService;


    @ResponseBody
    @RequestMapping("/add_category")
    public ServerResponse addCategory(HttpSession session,String categoryName){

//        //验证
//        User user = (User) session.getAttribute(Const.CURRENT_USER);
//        if (user == null){
//            return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(),"用户未登录，请登录管理员");
//
//        }
        if (StringUtils.isBlank(categoryName)){
            return ServerResponse.createByErrorMessage("类名不能为空");
        }

        return iCategoryService.addCategory(categoryName);
    }

    @ResponseBody
    @RequestMapping("/del_category")
    public ServerResponse delCategory(HttpSession session,Integer categoryId){
        //        //验证
//        User user = (User) session.getAttribute(Const.CURRENT_USER);
//        if (user == null){
//            return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(),"用户未登录，请登录管理员");
//
//        }

        return iCategoryService.delCategory(categoryId);
    }
}
