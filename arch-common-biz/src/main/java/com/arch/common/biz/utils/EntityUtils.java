package com.arch.common.biz.utils;

import com.arch.common.biz.dao.BasicDao;
import com.arch.common.biz.entity.BasicEntity;
import com.arch.common.biz.framework.Beans;
import org.apache.commons.collections.CollectionUtils;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public abstract class EntityUtils {

    public static <T extends BasicEntity> T init(T t) {
        Date date = new Date();
        t.setCreateTime(date);
        t.setUpdateTime(date);
        return t;
    }

    public static <T extends BasicEntity> T update(T t) {
        Date date = new Date();
        t.setUpdateTime(date);
        return t;
    }


    /**
     * |集合更新//
     *
     * @param oriList
     * @param curList
     * @param dao
     * @param <T>
     */
    public static <T extends BasicDao, F extends BasicEntity> void updateList(List<F> oriList, List<F> curList, Class<T> dao) {

        if (CollectionUtils.isEmpty(oriList) && CollectionUtils.isEmpty(curList)) return;
        T t = Beans.getBean(dao);
        if (CollectionUtils.isEmpty(oriList) && !CollectionUtils.isEmpty(curList)) {
            curList.stream().forEach(cur -> EntityUtils.init(cur));
            t.batchCreate(curList);return;
        }
        if (CollectionUtils.isEmpty(curList) && !CollectionUtils.isEmpty(oriList)) {
            t.batchDelete(oriList);return;
        }
        List<Integer> oriIds = oriList.stream().map(BasicEntity::getId).collect(Collectors.toList());
        List<Integer> curIds = curList.stream().filter(o->o.getId()!=0).map(BasicEntity::getId).collect(Collectors.toList());
        curList.forEach(o->{
            if(o.getId()==0){
                EntityUtils.init(o);
                t.create(o);
            }else if(oriIds.contains(o.getId())){
                EntityUtils.update(o);
                t.update(o);
            }
        });
        oriList.forEach(o->{
            if(!curIds.contains(o.getId())){
                t.delete(o);
            }
        });
    }
}
