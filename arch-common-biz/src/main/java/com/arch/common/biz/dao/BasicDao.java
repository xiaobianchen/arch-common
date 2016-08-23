package com.arch.common.biz.dao;


import com.arch.common.biz.entity.BasicEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BasicDao<T extends BasicEntity> {
    T findById(Integer id);

    int create(T entity);

    void update(T entity);

    void delete(T entity);

    void batchCreate(@Param("list") List<T> list);

    void batchDelete(@Param("list") List<T> list);
}