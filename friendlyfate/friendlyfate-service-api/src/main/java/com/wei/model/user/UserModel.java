package com.wei.model.user;

import com.wei.model.base.BaseModel;

/**
 * @author wei.peng
 * @descripe SpringBootProject
 * @Date 2019/7/2 0002.
 */
public class UserModel extends BaseModel{

    private String userName;

    private String loginName;

    private String password;

    private String sex;

    private String address;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format("{ id = %s,userName=%s,loginName=%s,address=%s,sex=%s,password=%s,createTime=%s}",
                                getId(),getUserName(),getLoginName(),getAddress(),getSex(),getPassword()
        ,getCreateTime());
    }

}
