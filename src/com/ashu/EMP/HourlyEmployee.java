package com.ashu.EMP;

public class HourlyEmployee extends Employee{
    private double hourlyPayRate;

    public HourlyEmployee(String name, String birthDate, String hireDate, double hourlyPay) {
        super(name, birthDate, hireDate);
        this.hourlyPayRate = hourlyPay;
    }
    @Override
    public double collectPay(){
        return 40*hourlyPayRate;
    }

    public double getDoublePay(){
        return 2*collectPay();
    }

}
