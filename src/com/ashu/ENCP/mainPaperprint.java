package com.ashu.ENCP;

public class mainPaperprint {
    public static void main(String[] args) {
        Printer printer = new Printer(50, true);
        System.out.println("initial Page Count: " + printer.getPagePrinted());

        int pagesprinted = printer.printPages(13);
        System.out.printf("Current Job Pages: %d , printer total : %d %n",
                pagesprinted, printer.getPagePrinted());
        System.out.printf("Current Job Pages: %d , printer total : %d %n",
                pagesprinted, printer.getPagePrinted());
    }
}
