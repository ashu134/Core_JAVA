package com.ashu.KTN;

public class SmartKitchen {

    private coffeeMaker brewMaster;
    private Refrigerator iceBox;
    private Dishwasher dishWasher;

    public SmartKitchen() {
        brewMaster = new coffeeMaker();
        iceBox = new Refrigerator();
        dishWasher = new Dishwasher();
    }

    public coffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public Dishwasher getDishWasher() {
        return dishWasher;
    }
    public void setKitchenState(boolean coffeeFlg,boolean fridgeflg,
                                boolean dishwasherFlg){
        brewMaster.setHasWorkToDo(coffeeFlg);
        iceBox.setHasWorkToDo(fridgeflg);
        dishWasher.setHasWorkToDo(dishwasherFlg);
    }
    public void doKitchenWork(){
        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishWasher.doDishes();
    }
}
    class coffeeMaker{
        private  boolean hasWorkToDo;

        public void setHasWorkToDo(boolean hasWorkToDo) {
            this.hasWorkToDo = hasWorkToDo;
        }
        public void brewCoffee(){
            if(hasWorkToDo){
                System.out.println("brewing Coffee");
                hasWorkToDo=false;
            }
        }
    }

    class Refrigerator{
        private  boolean hasWorkToDo;

        public void setHasWorkToDo(boolean hasWorkToDo) {
            this.hasWorkToDo = hasWorkToDo;
        }
        public void orderFood(){
            if(hasWorkToDo){
                System.out.println("Ordering Food");
                hasWorkToDo=false;
            }
        }
    }
    class Dishwasher{
        private  boolean hasWorkToDo;

        public void setHasWorkToDo(boolean hasWorkToDo) {
            this.hasWorkToDo = hasWorkToDo;
        }
        public void doDishes(){
            if(hasWorkToDo){
                System.out.println("Washing Dishes");
                hasWorkToDo=false;
            }
        }
    }
