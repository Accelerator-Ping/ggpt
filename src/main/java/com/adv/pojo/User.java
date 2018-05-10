package com.adv.pojo;

public class User {
    private Integer userId;

    private String userName;

    private String userPasswd;

    public User(Integer userId, String userName, String userPasswd) {
        this.userId = userId;
        this.userName = userName;
        this.userPasswd = userPasswd;
    }

    public User() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPasswd() {
        return userPasswd;
    }

    public void setUserPasswd(String userPasswd) {
        this.userPasswd = userPasswd == null ? null : userPasswd.trim();
    }
}