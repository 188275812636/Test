package user;

import java.util.Date;

public class User {

    private int id;
    private String username;
    private int age;
    private Date ctm;

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }

    public Date getCtm() {
        return ctm;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCtm(Date ctm) {
        this.ctm = ctm;
    }
}