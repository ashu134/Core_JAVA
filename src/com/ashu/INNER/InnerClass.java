package com.ashu.INNER;

public class InnerClass {
    private static final int ax=100; //inner class instance
    public static void inner2(){
        final int[] z = {10};  //inner2 class instance
        class add{
            public void addition(int a,int b){
                z[0] =100; //we can access z only if it is declared as final
                System.out.printf("Sum = %2d %3s%n",(a+b)," ok");
                System.out.printf("%8d%n", z[0]); //we can access instances of innerclass2
                System.out.printf("%8d%n",com.ashu.INNER.InnerClass.ax); //we can access only STATIC instances of innerclass2
            }
        }
        add a=new add();
        a.addition(1,2);
        a.addition(2,3);
        a.addition(2,9);

    }

    public static void main(String[] args) {
        InnerClass i=new InnerClass();
        i.inner2();

    }
}
