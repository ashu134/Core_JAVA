package com.ashu.Aatest;

import java.security.PublicKey;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFunction {
    public boolean Datecompare(String d1, String d2) throws ParseException {
        Date inputD1= new SimpleDateFormat("dd/MM/yyyy").parse(d1);
        Date inputD2= new SimpleDateFormat("dd/MM/yyyy").parse(d2);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        simpleDateFormat.format(inputD1);
        simpleDateFormat.format(inputD2);
        System.out.println(inputD1+" "+inputD2);
//        Date date1 = simpleDateFormat.format(d1);
//        Date date2 = simpleDateFormat.format("2022-12-06");
//        System.out.println(date2.compareTo(date1));
        //String date1=d1.toString();
        if (d1.toString().compareTo(d2.toString())==0){
            System.out.println(true);
            return true;

            }else {
            System.out.println(false);
            return false;
        }
    }
    public void addMonthInDate(Date d,int Months){
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal.add(Calendar.MONTH,Months);
        System.out.println(cal.getTime());
        //return cal.getTime();
    }
    public void dateFormatter(String dateInput){
        //Step1 take user input as String format trim it first
        dateInput.trim();
        //Step2 - now remove special character from date
        String di1=dateInput.replace("/","");
        String di2=di1.replace(".","");
        String date=di2.replace("-","");
        System.out.println(date);

        //int Month=date.concat(2,3);

    }
}

