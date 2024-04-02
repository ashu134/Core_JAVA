package com.ashu.KTN;

/*problem Statement-- sMART kITCHEN
1. addWater() - will set the coffee makers
    has water work need to be done
2. pourMilk() - Will set Refrigeratr's water
    hasworkToDo to true
3. loadDishwasher() - Will set the nasWorkToDO
    flag to true, on the appliance


 */

public class main {
    public static void main(String[] args) {
        SmartKitchen ktn = new SmartKitchen();

        /*
        ktn.getDishWasher().setHasWorkToDo(true);
        ktn.getIceBox().setHasWorkToDo(true);
        ktn.getBrewMaster().setHasWorkToDo(true);

        ktn.getDishWasher().doDishes();
        ktn.getIceBox().orderFood();
        ktn.getBrewMaster().brewCoffee();
        */
        ktn.setKitchenState(true, true, true);
        ktn.doKitchenWork();
    }
}
