package com.ashu.ARRY;

public class BoxUnbox {
    public static void main(String[] args) {
        Integer boxed = Integer.valueOf(10); // Preferred but unnecessary
       // Integer depBoxing= new Integer(10); //depreciated since jdk9
        int unboxint= boxed.intValue();        //Unnecessary

        //AutoUnbox
        Integer autobox= 15;
        int autounboxed = autobox;
        System.out.println(autobox.getClass().getName());
       // System.out.println(autounboxed.getClass.getName);
        double d= getDoubleObject();
        Double d1= getLiteralDoublePrimitive();
        System.out.println(d+" "+d1);
    }
    private static Double getDoubleObject(){
        return Double.valueOf(100.00);
    }
    private static double getLiteralDoublePrimitive(){
        return 100.0;
    }
}
