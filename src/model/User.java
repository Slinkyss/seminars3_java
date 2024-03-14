package model;

import service.IPostService;

public abstract class User extends GuestUser implements IPostService {
    private String username;

    protected String nameAndSurnameOrTitle;


    private String password;


    public String getUsername(){
        return username;
    }

    public void setUsername(){
        this.username = nameAndSurnameOrTitle + "_" + getGeneratedID();
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        if(password != null && password.length() > 5)
            this.password = password;
        else
            this.password = "_____";
    }

    public String getNameAndSurnameOrTitle() {
        return nameAndSurnameOrTitle;
    }

    public abstract void setNameAndSurnameOrTitle(String nameAndSurnameOrTitle);


    public User(){
        super();
        setPassword("test12345");
    }

    public User(String password){
        super();

        setPassword(password);


    }

    public String toString(){
        return super.toString() + ":";
    }
}
