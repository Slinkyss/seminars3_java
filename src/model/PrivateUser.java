package model;

import java.util.ArrayList;

public class PrivateUser extends User{

    private ArrayList<User> followers = new ArrayList<>();

    private ArrayList<Post> publicPosts = new ArrayList<>();
    private ArrayList<Post> privatePosts = new ArrayList<>();


    @Override
    public void setNameAndSurnameOrTitle(String nameAndSurnameOrTitle) {
        if(nameAndSurnameOrTitle != null && nameAndSurnameOrTitle.matches("/^[a-z ,.'-]+$/i")) {
            super.nameAndSurnameOrTitle = nameAndSurnameOrTitle;
        }else{
            super.nameAndSurnameOrTitle = "sssssssss";

        }

    }

    @Override
    public void publishPost(PostType type, String msg) throws Exception {

        if(type == null || msg == null) throw new Exception("nav pareizi");

        Post newPost = new Post(msg);

        if(type.equals(PostType.privatePost)) privatePosts.add(newPost);

        else if(type.equals(PostType.publicPost)) publicPosts.add(newPost);
    }


    public ArrayList<User> getFollowers() {
        return followers;
    }


    public ArrayList<Post> getPublicPosts() {
        return publicPosts;
    }



    public ArrayList<Post> getPrivatePosts() {
        return privatePosts;
    }


    public PrivateUser(){
        super();
        setNameAndSurnameOrTitle("Janis berzins");
        setUsername();
    }

    public PrivateUser(String name, String surname, String password){

        super(password);
        setNameAndSurnameOrTitle(name + " " + surname);
        setUsername();
    }

    public String toString(){
        return super.toString() + super.nameAndSurnameOrTitle + "(" + super.getUsername() + ")";

    }

    public void followPrivateUser(User user) throws Exception{
        if(user == null) throw new Exception("User is empty");

//        if(followers.contains(user)){
//            followers.add(user);
//        } else {
//            throw new Exception("This user is already a follower");
//        }
        
    }



}
