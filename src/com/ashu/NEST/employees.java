package com.ashu.NEST;

import java.util.Comparator;

public class employees {
    public static class EmployeeComparator <T extends employees>
            implements Comparator<employees> {

        private String sortType;

        public EmployeeComparator() {
            this("name");
        }

        public EmployeeComparator(String sortType) {
            this.sortType = sortType;
        }

        @Override
        public int compare(employees o1, employees o2) {
            if(sortType.equalsIgnoreCase("yearStarted")){
                return o1.yearStarted-o2.yearStarted;
            }
            return o1.name.compareTo(o2.name);
        }
    }
   private int EmployeeId;
   private String name;
   private int yearStarted;

    public employees(int employeeId, String name, int yearStarted) {
        EmployeeId = employeeId;
        this.name = name;
        this.yearStarted = yearStarted;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "%d %-8s %d".formatted(EmployeeId,name,yearStarted);
    }
}
