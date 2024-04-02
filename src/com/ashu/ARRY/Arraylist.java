package com.ashu.ARRY;

import java.util.Arrays;
import java.util.ArrayList;

record myarr(String name, int Age, String State) {
    public myarr(String name) {
        this(name, 25, "Bihar");
    }

    @Override
    public String toString() {
        return String.format("%s is from %s of age %d", name.toUpperCase(), State, Age);
    }
}

public class Arraylist {
    public static void main(String[] args) {
        Object[] arr = new Object[5];

        arr[0] = new myarr("Ashutodh");
        arr[1] = new myarr("Amar");
        arr[2] = new myarr("Briz");
        System.out.println(Arrays.toString(arr));
        ArrayList newArr = new ArrayList();
        newArr.add(new myarr("Aashutosh"));
        newArr.add(new myarr("Amar"));
        System.out.println(newArr);
        ArrayList<myarr> UserDetails = new ArrayList<>();
        UserDetails.add(new myarr("Aashu", 22, "Karnataka"));
        System.out.println(UserDetails);
    }

}
