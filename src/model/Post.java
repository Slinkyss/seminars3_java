package model;
import java.time.LocalTime;

import java.util.Date;
import java.util.Locale;

public class Post {

    private String msg;

    private int countOfLikes = 0;

    private LocalTime date;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        if(msg != null && msg.length() > 5 && msg.length() < 300)
            this.msg = msg;
        else
            this.msg = "-------";
    }

    public int getCountOfLikes() {
        return countOfLikes;
    }

    public void incrementCountOfLikes() {
        this.countOfLikes++ ;
    }

    public LocalTime getDate() {
        return date;
    }

    public void setDate() {
        this.date = LocalTime.now();
    }

    public Post(){
       setDate();
       setMsg("______");
    }

    public Post(String msg){

        setMsg(msg);
        setDate();
        incrementCountOfLikes();

    }




}