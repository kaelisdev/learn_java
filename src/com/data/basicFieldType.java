package com.data;

/**
 * Created by ion on 7/16/15.
 */
public class basicFieldType {

    public  enum FieldType {
        PASSWORD, EMAIL_ADDRES, PHONE_NUMBER, SOCIAL_SECURITY_NUMBER
    }

    public static void main(String[] args) {
        FieldType field = FieldType.EMAIL_ADDRES;
        System.out.println("field.name(): " + field.name());
        System.out.println("test row");
        System.out.println("test row");
        System.out.println("test row");
        System.out.println("test row");
        System.out.println("test row");
        System.out.println("test row");
    }
}
