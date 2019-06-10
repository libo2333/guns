package com.stylefeng.guns.rest.cinema.bean;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 * <p>
 * 地域信息表
 * </p>
 *
 * @author stylefeng
 * @since 2019-06-04
 */
@TableName("mtime_hall_dict_t")
public class MtimeHallDictT extends Model<MtimeHallDictT> {

    private static final long serialVersionUID = 1L;

    private Boolean isActive=false;

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    /**
     * 主键编号
     */
    @TableId(value = "UUID", type = IdType.AUTO)
    private Integer halltypeId;

    private String seatFile;

    private String hallName;

    private Integer price;

    private String soldSeats;

    private Integer hallFieldId;
    /**
     * 显示名称
     */
    @TableField("show_name")
    private String halltypeName;

    /**
     * 座位文件存放地址
     */
    @TableField("seat_address")
    private String seatAddress;

    public MtimeHallDictT() {
    }

    @Override
    protected Serializable pkVal() {
        return this.hallFieldId;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getSeatFile() {
        return seatFile;
    }

    public void setSeatFile(String seatFile) {
        this.seatFile = seatFile;
    }

    public String getHallName() {
        return hallName;
    }

    public void setHallName(String hallName) {
        this.hallName = hallName;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getSoldSeats() {
        return soldSeats;
    }

    public void setSoldSeats(String soldSeats) {
        this.soldSeats = soldSeats;
    }

    public Integer getHallFieldId() {
        return hallFieldId;
    }

    public void setHallFieldId(Integer hallFieldId) {
        this.hallFieldId = hallFieldId;
    }

    public Integer getHalltypeId() {
        return halltypeId;
    }

    public void setHalltypeId(Integer halltypeId) {
        this.halltypeId = halltypeId;
    }

    public String getHalltypeName() {
        return halltypeName;
    }

    public void setHalltypeName(String halltypeName) {
        this.halltypeName = halltypeName;
    }

    public String getSeatAddress() {
        return seatAddress;
    }

    public void setSeatAddress(String seatAddress) {
        this.seatAddress = seatAddress;
    }
}
