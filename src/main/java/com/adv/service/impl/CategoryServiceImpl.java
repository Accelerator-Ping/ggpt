package com.adv.service.impl;

import com.adv.common.ServerResponse;
import com.adv.dao.CategoryMapper;
import com.adv.pojo.Category;
import com.adv.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author 李和平
 * @create 2018-05-08 16:30
 **/
@Service("iCategoryService")
public class CategoryServiceImpl  implements ICategoryService{

    public static final int CATEGORYMAX = 7;

    @Autowired
    private CategoryMapper categoryMapper;



    @Override
    public ServerResponse list() {
        List<Category> categoryList = categoryMapper.list();

        //排序
        Collections.sort(categoryList, new Comparator<Category>() {
            @Override
            public int compare(Category o1, Category o2) {
                return o1.getCategoryId()-o2.getCategoryId();
            }
        });

        return ServerResponse.createBySuccess(categoryList);
    }

    @Override
    public ServerResponse addCategory(String categoryName) {
        Category category = new Category();
        category.setCategoryName(categoryName);

        List<Category> categoryList = categoryMapper.list();
        if(categoryList.size()>=CATEGORYMAX){
            return ServerResponse.createByErrorMessage("广告类的数量超出限制！");

        }
        for (Category c:categoryList) {
            if (c.getCategoryName().equals(categoryName)){
                return ServerResponse.createByErrorMessage("类名不可重复");
            }
        }

        if (categoryMapper.insertSelective(category) == 0){
            return ServerResponse.createByErrorMessage("插入失败");
        }

        return ServerResponse.createBySuccessMessage("插入成功");
    }

    @Override
    public ServerResponse delCategory(Integer categoryId) {
        List<Category> categoryList = categoryMapper.list();

        //检查id是否存在
        boolean haveId = false;
        for (Category c:categoryList) {
            if (c.getCategoryId()==categoryId){
                haveId = true;
            }
        }
        if (haveId == false){
            return ServerResponse.createByErrorMessage("删除失败，未找到该数据");
        }


        if (categoryMapper.deleteByPrimaryKey(categoryId) == 0){
            return ServerResponse.createByErrorMessage("删除失败");
        }

        return ServerResponse.createBySuccessMessage("删除成功");
    }
}
