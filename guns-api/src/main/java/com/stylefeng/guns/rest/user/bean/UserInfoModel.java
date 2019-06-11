package com.stylefeng.guns.rest.user.bean;

import java.io.Serializable;

public class UserInfoModel implements Serializable {
    private Integer uuid;
    private String username;
    private String nickname;
    private String email;
    private String phone;
    private int sex;
    private String birthday;
    private String lifeState;
    private String biography;
    private String address;
    private String headAddress;
    private long CreateTime;
    private long updateTime;

    public UserInfoModel() {
    }

   /* public UserInfoModel(MtimeUserT mtimeUserT) {
        uuid = mtimeUserT.getUuid();
        username = mtimeUserT.getUserName();
        nickname = mtimeUserT.getNickName();
        email = mtimeUserT.getEmail();
        phone = mtimeUserT.getUserPhone();
        sex = mtimeUserT.getUserSex();
        birthday = mtimeUserT.getBirthday();
        lifeState = mtimeUserT.getLifeState().toString();
        biography = mtimeUserT.getBiography();
        address = mtimeUserT.getAddress();
        headAddress = mtimeUserT.getHeadUrl();
        beginTime = mtimeUserT.getBeginTime().getTime();
        updateTime = mtimeUserT.getUpdateTime().getTime();
    }*/

    public UserInfoModel(Integer uuid, String username, String nickname, String email, String phone, int sex, String birthday, String lifeState, String biography, String address, String headAddress, long createTime, long updateTime) {
        this.uuid = uuid;
        this.username = username;
        this.nickname = nickname;
        this.email = email;
        this.phone = phone;
        this.sex = sex;
        this.birthday = birthday;
        this.lifeState = lifeState;
        this.biography = biography;
        this.address = address;
        this.headAddress = headAddress;
        this.CreateTime = createTime;
        this.updateTime = updateTime;
    }

    public Integer getUuid() {
        return uuid;
    }

    public void setUuid(Integer uuid) {
        this.uuid = uuid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getLifeState() {
        return lifeState;
    }

    public void setLifeState(String lifeState) {
        this.lifeState = lifeState;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHeadAddress() {
        return headAddress;
    }

    public void setHeadAddress(String headAddress) {
        this.headAddress = headAddress;
    }

    public long getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(long createTime) {
        CreateTime = createTime;
    }

    public long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(long updateTime) {
        this.updateTime = updateTime;
    }


    @Override
    public String toString() {
        return "UserInfoModel{" +
                "uuid=" + uuid +
                ", username='" + username + '\'' +
                ", nickname='" + nickname + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", sex=" + sex +
                ", birthday='" + birthday + '\'' +
                ", lifeState='" + lifeState + '\'' +
                ", biography='" + biography + '\'' +
                ", address='" + address + '\'' +
                ", headAddress='" + headAddress + '\'' +
                ", CreateTime=" + CreateTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
