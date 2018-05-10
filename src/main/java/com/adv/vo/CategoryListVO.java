package com.adv.vo;

import com.adv.pojo.Category;
import lombok.Data;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author 李和平
 * @create 2018-05-08 16:25
 **/
@Data
public class CategoryListVO {

    List<Category> categoryList;

    int list;
}
