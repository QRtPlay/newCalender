package com.example.newcalender;

import java.util.Date;

public class Reminder {
    private String title;
    private Date dateTime;
    private boolean repeat;

    public Reminder(String title, Date dateTime, boolean repeat) {
        this.title = title;
        this.dateTime = dateTime;
        this.repeat = repeat;
    }

    // Getters and setters...
}
