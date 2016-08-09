package com.arch.common.biz.dao;


import com.arch.common.biz.entity.BasicEntity;

public interface BasicDao<T extends BasicEntity> {
    T findById(Integer id);

    int create(T entity);

    void update(T entity);

    void delete(T entity);
}