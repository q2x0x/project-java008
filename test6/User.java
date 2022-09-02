package com.itheima.test6;

public class User {
    //属性
    private String username;
    private String passname;
    private String email;
    private String gender;
    private int ago;


    //快捷键
    //Alt + Ins(键盘)
    //Alt + Fn + Insert(笔记本键盘)

    //插件PTG  1秒生成标准JavaBean


    public User() {
    }

    public User(String username, String passname, String email, String gender, int ago) {
        this.username = username;
        this.passname = passname;
        this.email = email;
        this.gender = gender;
        this.ago = ago;
    }

    /**
     * 获取
     *
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置
     *
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取
     *
     * @return passname
     */
    public String getPassname() {
        return passname;
    }

    /**
     * 设置
     *
     * @param passname
     */
    public void setPassname(String passname) {
        this.passname = passname;
    }

    /**
     * 获取
     *
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取
     *
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置
     *
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 获取
     *
     * @return ago
     */
    public int getAgo() {
        return ago;
    }

    /**
     * 设置
     *
     * @param ago
     */
    public void setAgo(int ago) {
        this.ago = ago;
    }

}
