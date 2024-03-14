package model;

import java.util.ArrayList;

public class Page {

    private String title;

    private String description;

    private ArrayList<User> followers = new ArrayList<>();

    private ArrayList<Post>  postsInPage = new ArrayList<>();

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        if(title != null) this.title = title;

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if(description != null) {
            this.description = description;
        }
        else{
            this.description = "______";
        }
    }

    public ArrayList<User> getFollowers() {
        return followers;
    }


    public ArrayList<Post> getPostsInPage() {
        return postsInPage;
    }


    public Page(){
        setDescription("Autoserviss ventspili");
        setDescription("Autoserviss");
    }

    public String toString(){
        return title + "(" + description + ") " + followers.size() + "sekotaji";

    }
}
