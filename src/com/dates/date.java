package com.dates;

import java.util.Date;

/**
 * Created by ion on 7/16/15.
 */
public class date {
    public static void main(String[] args) {
        newDate();
    }
    public static void newDate(){
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());
    }
}
