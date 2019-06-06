package com.stylefeng.guns.rest.common.persistence.model;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author cskaoyan
 * @since 2019-06-05
 */
@TableName("user_token")
public class UserToken extends Model<UserToken> {

    private static final long serialVersionUID = 1L;

    @TableField("UUID")
    private Integer uuid;
    private String token;
    private Integer flag;
    private Integer id;


    public Integer getUuid() {
        return uuid;
    }

    public void setUuid(Integer uuid) {
        this.uuid = uuid;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "UserToken{" +
        "uuid=" + uuid +
        ", token=" + token +
        ", flag=" + flag +
        ", id=" + id +
        "}";
    }
}
