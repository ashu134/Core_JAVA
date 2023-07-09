package com.ashu.EMP;

public class Worker {
    private String name;
    private String birthDate;
    protected  String endDate;

    public String getName() {
        return name;
    }
    public Worker(){

    }

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getAge(){
        int currentYear=2023;
        //SubString function will give yyyy from DD/MM/YYYY after index 6
        int birthYear= Integer.parseInt(birthDate.substring(6));
        return currentYear-birthYear;
    }
    public double collectPay(){
        return 0.0;
    }

    public void terminate(String endDate){
        this.endDate=endDate;
    }

    public String toString(){
        return "worker{"+
                "name='"+ name+ '\''+
                ", birthDate= "+ birthDate+'\''
                + ",endDate='"+endDate+'\''+
                '}';
    }
}
