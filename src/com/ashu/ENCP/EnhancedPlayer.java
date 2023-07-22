package com.ashu.ENCP;

public class EnhancedPlayer {
    private String name;
    private int healthPrecentage;
    private String weapon;
    public EnhancedPlayer(String name){
        this(name,100,"Gun");
    }

    public EnhancedPlayer(String name, int healthPrecentage, String weapon) {
        this.name = name;
        if(healthPrecentage <=0){
        this.healthPrecentage = 1;
        }else if (healthPrecentage >=100){
            this.healthPrecentage =100;
        }else {
            this.healthPrecentage = healthPrecentage;
        }
        this.weapon = weapon;
    }
    public  void loseHealth(int damage){
        healthPrecentage = healthPrecentage -damage;
        if(healthPrecentage <=0){
            System.out.println("Player knocked out of Game");
        }
    }
    public int healthRemaining(){
        return healthPrecentage;
    }
    public void restoreHealth(int extraHealth){
        healthPrecentage = healthPrecentage +extraHealth;
        if(healthPrecentage >100){
            System.out.println("player Restore to 100% ");
            healthPrecentage =100;
        }

    }
}
