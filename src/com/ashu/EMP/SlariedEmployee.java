package com.ashu.EMP;

public class SlariedEmployee extends Employee {
    double annualSalary;
    boolean isRetired;

    public SlariedEmployee(String name, String birthDate, String hireDate,
                           double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;

    }

    public double collectPay() {
        double paycheck = annualSalary / 26;
        double adjustedPay = (isRetired) ? 0.9 * paycheck : paycheck;
        return (int) adjustedPay;
    }

    public void retire() {
        terminate("12/12/2023");
        isRetired = true;
    }
}
