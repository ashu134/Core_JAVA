package com.ashu.NEST;

import java.util.Comparator;

public class EmployeeComparator <T extends employees> implements Comparator<employees> {
    @Override
    public int compare(employees o1, employees o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
