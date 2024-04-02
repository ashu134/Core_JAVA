package com.ashu.ENCP;

public class Printer {
    private int tonerLevel;
    private int pagePrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
    /*
        if(tonerLevel>100){
            this.tonerLevel=100;
        }else if(tonerLevel<0){
            this.tonerLevel=0;
        }else {
            this.tonerLevel = tonerLevel;
        }
        */
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 0) ? tonerLevel : -1;
        this.pagePrinted = 0;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmout) {
        int tempAmount = tonerAmout + tonerLevel;
        if (tempAmount < 0 || tempAmount > 100) {
            return -1;
        } else {
            this.tonerLevel = tempAmount;
            return tonerLevel;
        }
    }

    public int printPages(int pages) {
        int jobPages = (duplex) ? (pages / 2) + (pages % 2) : pages;
        pagePrinted += jobPages;
        return jobPages;
    }

    public int getPagePrinted() {
        return pagePrinted;
    }
}
