package com.ashu.Aatest;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
//        Date newdate= new Date();
//        String date1= newdate.toString();
//        DateFunction dateFunction = new DateFunction();
//        dateFunction.addMonthInDate(newdate,1);
//        System.out.println(date1);
//
//        Locale locale = new Locale("in","IN");
//        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
//        String date = dateFormat.format(new Date());
//        System.out.println(date);
//
////        Scanner sc =new Scanner(System.in);
////        System.out.println("Input date");
////        String inpdate=sc.nextLine();
//        String pattern = "MM-dd-yyyy";
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
//        String date2=simpleDateFormat.format(new Date("11/01/2020"));
//        //date2.concat("");
//        System.out.println("Date2: "+date2);
//
//        dateFunction.dateFormatter("11/04/2011");
//

//        Calendar cal = Calendar.getInstance();
//        cal.add(Calendar.MONTH,1);
//        System.out.println(cal.getTime());

//        Date date = new Date();
//        SimpleDateFormat getYear = new SimpleDateFormat("DD");
//        SimpleDateFormat getMonth = new SimpleDateFormat("MM");
//        SimpleDateFormat getDay = new SimpleDateFormat("DD");
//        String year = getYear.format(date);
//        String month = getMonth.format(date);
//        String day = getDay.format(date);
//        int yearInt = Integer.parseInt(year);
//        int monthint = Integer.parseInt(month);
//        int dayint = Integer.parseInt(day);
//        System.out.println(yearInt + " + "+monthint+" + "+dayint);
        DateFunction datec =new DateFunction();
        if (datec.Datecompare("10/10/2020","11/10/2020")==true){
            System.out.println("Given Dates are same");
        }
        String  inputDate ="20220101";
        DateFormat df = new SimpleDateFormat("yyyyMMdd");
        Date date = df.parse(inputDate);
        System.out.println("Java Date = " + date.toString());
        System.out.println("Java Date as a 'long' value = " + date.getTime());

    }
}
