package com.ashu.PRD;

public class main {
    public static void main(String[] args) {
        Computercase thecase = new Computercase("2022",
                "Lenevo", "220");
        Monitor theMonitor = new Monitor("16.2 Ideapad 320", "Lenovo",
                32, "1080x720");
        Motherboard themotherboard = new Motherboard("AK-234", "Dell"
                , 2, 6, "v5.22");
        PersonalComputer myPC = new PersonalComputer("2022", "lenovo",
                thecase, theMonitor, themotherboard);
    /*myPC.getMonitor().drawPixelAt(10,10,"blue");
    myPC.getMotherboard().loadProgram("Windows 10");
    myPC.getComputercase().pressPowerButton();*/
        myPC.powerUp();
    }
}
