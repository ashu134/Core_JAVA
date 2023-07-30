package com.ashu.STR;

public class StringFunc {
    public static void main(String[] args) {
        String name= "Aashutosh";
        System.out.println(concatStr(name, "Kumar"));
        //check if Any Word present in the String
        String s= "A";
        if("Aashutosh".contains("A")){
            System.out.println("Yes A is present");
        }
    }
    public static String concatStr(String str1,String str2){
        String str= str1.concat(" ");
        str= str.concat(str2);
        return str;
    }
}
