package com.ashu.ENCP;

public class main {
    public static void main(String[] args) {
        Player player= new Player();
        /*
        player.name="Aashutosh";
        player.health=20;
        player.weapon="GUN";

        int damage=10;
        player.loseHealth(damage);
        System.out.println("Remaining health = "+player.healthRemaining());
        player.loseHealth(20);
        System.out.println("Remaining health = "+player.healthRemaining());
        */
        EnhancedPlayer newplayer= new EnhancedPlayer("Aashutoosh",444,"Sword");
        System.out.println("Intial health = "+newplayer.healthRemaining());
    }
}
