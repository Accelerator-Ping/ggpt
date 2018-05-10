package com.adv.dao;

import com.adv.pojo.Advert;

public interface AdvertMapper {
    int deleteByPrimaryKey(Integer advId);

    int insert(Advert record);

    int insertSelective(Advert record);

    Advert selectByPrimaryKey(Integer advId);

    int updateByPrimaryKeySelective(Advert record);

    int updateByPrimaryKey(Advert record);
}