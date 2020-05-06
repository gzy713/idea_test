package com.company;

import java.sql.SQLOutput;

public class Main {

//public final class Integer extends Number implements Comparable<Integer> {
    //public final class String
//    implements java.io.Serializable, Comparable<String>, CharSequence {
    public static void main(String[] args) {
        StringBuffer  str=new StringBuffer();
        str.append("hello");
        str.delete(0,2);
        System.out.println(str);
        System.out.println(Integer.MIN_VALUE);
    }

}
