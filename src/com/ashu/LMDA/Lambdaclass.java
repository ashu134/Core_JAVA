package com.ashu.LMDA;

@FunctionalInterface
interface funcInterface {
    void myclass(int a);
}

interface newInterface {
    void math();

    void science();
}

//traditional way of calling method starts here
class newClass implements newInterface {
    @Override
    public void math() {
        System.out.println("This is math from " + getClass().getSimpleName());
    }

    @Override
    public void science() {

    }
}

class anonyDemo implements newInterface {
    public void Display() {
        System.out.println("Display");
    }

    @Override
    public void math() {
        System.out.println("This is math");

    }

    @Override
    public void science() {
        System.out.println("This is Science");

    }
}

//traditional way of calling method Ends here
public class Lambdaclass {

    public static void main(String[] args) {
        //Calling Method by normal method-> class.method_name(();
        anonyDemo anonyDemo = new anonyDemo();
        newClass newClass = new newClass();
        newClass.math();
        anonyDemo.math();

        //Calling method by anonymous class no need to  create explicit class
        newInterface newInterface = new newInterface() {
            @Override
            public void math() {
                System.out.println("Math");
            }

            @Override
            public void science() {
                System.out.println("Science");
            }
        };
        newInterface.science();


        //Lambda Expressions with interface ->> funcInterface
        //Used to implements Functional interface-> only one method in the Interface
        funcInterface obj = (a) -> System.out.println("method myClass " + a);
        obj.myclass(9);
    }
}
