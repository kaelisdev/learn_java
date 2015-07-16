package com.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by ion on 7/16/15.
 */
public class formatDataForDisplay {
    public static void main(String[] args) {
        formatData();
    }

    public static void formatData(){
        Calendar cal = Calendar.getInstance();

        SimpleDateFormat dateFormatter1 = new SimpleDateFormat("MMMMM/dd/yyyy");
        System.out.println(dateFormatter1.format(cal.getTime()));
        dateFormatter1.applyPattern("hh:mm:ss MM-dd-YY");
        System.out.println(dateFormatter1.format(cal.getTime()));

    }
}
