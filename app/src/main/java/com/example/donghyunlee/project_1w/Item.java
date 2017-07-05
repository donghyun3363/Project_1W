package com.example.donghyunlee.project_1w;

/**
 * Created by DONGHYUNLEE on 2017-07-04.
 */

public class Item {
    public int image;
    public String title;
    public String content;

    public Item(int image, String title, String content){
        this.image = image;
        this.title = title;
        this.content = content;
    }
    int getImage(){
        return this.image;
    }
    String getTitle(){
        return this.title;
    }
    String getContent(){
        return this.content;
    }
}
