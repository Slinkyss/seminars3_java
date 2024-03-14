package model;

public class User {
    private String username;

    private String nameAndSurname;

    private String password;


    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        if(username != null && username.length() > 3 && username.length() < 14)
            this.username = username;

    }
}
