package com.example.donghyunlee.project_1w;

/**
 * Created by DONGHYUNLEE on 2017-07-04.
 */

public class Item {
    public int image;
    public int title_image;
    public String title;
    public String content;
    public String time;
    public String like;
    public String commend;
    public String share;

    public Item(int title_image, int image, String time, String like, String commend, String share, String title, String content){
        this.image = image;
        this.title_image = title_image;
        this.title = title;
        this.content = content;
        this.time = time;
        this.like = like;
        this.commend = commend;
        this.share = share;
    }
    int getImage(){
        return this.image;
    }
    int getTitle_Image(){
        return this.title_image;
    }
    String getTitle(){
        return this.title;
    }
    String getContent(){
        return this.content;
    }
    String getTime(){return this.time;}
    String getLike(){return this.like;}
    String getCommend(){return this.commend;}
    String getShare(){return this.share;}
}
