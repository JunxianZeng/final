package com.gcssloop.diycode.database;

import java.util.Date;

public class Actions {
    public String title;
    public String content;
    public String location;
    public String time;
    public int num;

    public Actions(){

    }

    public Actions(String title, String content, String location, String time, int num) {
        this.title = title;
        this.content = content;
        this.location = location;
        this.time = time;
        this.num = num;
    }
}
