package com.ashu;

public class StringFunc {
    public static void main(String[] args) {
        String name= "Aashutosh";
        System.out.println(concatStr(name, "Kumar"));
    }
    public static String concatStr(String str1,String str2){
        String str= str1.concat(" ");
        str= str.concat(str2);
        return str;
    }
}
