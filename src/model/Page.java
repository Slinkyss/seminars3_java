package model;

import java.util.ArrayList;

public class Page {

    private String title;

    private String description;

    private ArrayList<User> followers;

    private ArrayList<Post> postsInPage;

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){

    }
}
