package com.example.newcalender;

import java.util.Date;

public class Task {
    private String title;
    private Date startTime;
    private Date endTime;
    private boolean repeat;

    public Task(String title, Date startTime, Date endTime, boolean repeat) {
        this.title = title;
        this.startTime = startTime;
        this.endTime = endTime;
        this.repeat = repeat;
    }

    // Getters and setters...
}
