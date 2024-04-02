package com.ashu.INNER;

public class Main {
    private int x = 0;

    class inner {
        private int y = 100;

        public void print() {
            System.out.println("INNER");
            System.out.println(Main.this.x);  //If print() method will be non-static then
            // you cannot call this method by this way-> Main.inner.print();
            System.out.println(this.y);//Local variable
        }
    }

    public static void main(String[] args) {
        System.out.println("outer");
        Main main = new Main();
        Main.inner inn = main.new inner();
        inn.print(); //1st Way to call inner class method
        //Main.inner.print(); //2nd Way to call inner "Outer"class method

    }
}
