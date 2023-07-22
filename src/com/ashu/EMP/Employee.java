package com.ashu.EMP;

import java.sql.Statement;

public class Employee extends Worker{
    private long employeeId;
    private String hireDate;
    private static int empNo=1000;

    public Employee() {

    }
    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.employeeId = empNo++;
        this.hireDate = hireDate;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
