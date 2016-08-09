package com.arch.common.api.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by chenxiaobian on 16/7/7.
 */

public abstract class AbstractDto implements Serializable {
    private int id;
    private Date createTime;
    private Date updateTime;
    private boolean isDeleted;

    public boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
