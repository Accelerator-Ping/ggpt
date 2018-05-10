package com.adv.service;

import com.adv.common.ServerResponse;
import com.adv.pojo.Category;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author 李和平
 * @create 2018-05-08 16:21
 **/
public interface ICategoryService {

    ServerResponse<List<Category>> list();

    ServerResponse addCategory(String categoryName);

    ServerResponse delCategory(Integer categoryId);

}
