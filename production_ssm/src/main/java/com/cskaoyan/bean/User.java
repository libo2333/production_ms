package com.cskaoyan.bean;

public class User {
    /*客户管理信息*/
    private int id;
    private String useranme;
    private String fullname;
    private String address;
    private int chuanzhen;
    private String email;
    private String managername;
    private int telephone;
    private String status;
    private String text;

    public User() {
    }

    public User(int id, String useranme, String fullname, String address, int chuanzhen, String email, String managername, int telephone, String status, String text) {
        this.id = id;
        this.useranme = useranme;
        this.fullname = fullname;
        this.address = address;
        this.chuanzhen = chuanzhen;
        this.email = email;
        this.managername = managername;
        this.telephone = telephone;
        this.status = status;
        this.text = text;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", useranme='" + useranme + '\'' +
                ", fullname='" + fullname + '\'' +
                ", address='" + address + '\'' +
                ", chuanzhen=" + chuanzhen +
                ", email='" + email + '\'' +
                ", managername='" + managername + '\'' +
                ", telephone=" + telephone +
                ", status='" + status + '\'' +
                ", text='" + text + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUseranme() {
        return useranme;
    }

    public void setUseranme(String useranme) {
        this.useranme = useranme;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getChuanzhen() {
        return chuanzhen;
    }

    public void setChuanzhen(int chuanzhen) {
        this.chuanzhen = chuanzhen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getManagername() {
        return managername;
    }

    public void setManagername(String managername) {
        this.managername = managername;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
