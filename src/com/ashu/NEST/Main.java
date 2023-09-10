package com.ashu.NEST;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<employees> employees =new ArrayList<>(List.of(
                new employees(1001,"Aashutosh",2021),
                new employees(1002,"Pawan",2021),
                new employees(1003,"Amar",2022),
                new employees(1004,"Dinesh",2023)));

//        var comparator = new EmployeeComparator<>();
//        employees.sort(comparator);
        employees.sort(new employees.EmployeeComparator<>("yearstarted"));
        for (var x: employees){
            System.out.println(x);
        }
    }
}
