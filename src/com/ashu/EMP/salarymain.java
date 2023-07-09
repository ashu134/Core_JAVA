package com.ashu.EMP;

import java.sql.SQLOutput;

public class salarymain {
    public static void main(String[] args) {

        Employee john = new Employee("John", "11/07/1998","23/10/2020");
        System.out.println(john);
        System.out.println(john.getEmployeeId());
        System.out.println(john.getAge());
        System.out.println(john.collectPay());
        Employee Joe= new Employee("Joe","23/12/1997",
                "12/2/2019");
        System.out.println(Joe);
        System.out.println(Joe.getEmployeeId());
        System.out.println(Joe.getName());

        SlariedEmployee marry= new SlariedEmployee("Merry",
                "11/09/1997","12/3/2018",12000);
        System.out.println(marry);
        System.out.println("payment=$" + marry.collectPay());
        System.out.println(marry.getName());


        marry.retire();
        System.out.println("Revised payment is $"+marry.collectPay());

        HourlyEmployee peter= new HourlyEmployee("Peter","02/02/1979","09/09/2010",16);
        System.out.println(peter);
        System.out.println(peter.getAge());
    }
}
