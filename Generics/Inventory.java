package Generics;

import java.util.ArrayList;
import java.util.Iterator;

public class Inventory<T extends Vehicle> {
    ArrayList<T> inventory;


    public Inventory() {
        this.inventory = inventory;
    }

    public ArrayList<T> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<T> inventory) {
        this.inventory = inventory;
    }

    public void addToInventory(T vehicle) {
        inventory.add(vehicle);
        System.out.println("Added " + vehicle + " to Inventory");

    }

    public void removeFromInventory(String vin){
        Iterator<T> iterator = inventory.iterator();
        while (iterator.hasNext()) {
            T vehicle = iterator.next();
            if (vehicle.getVin().equals(vin)) {
                iterator.remove();
                System.out.println("Removed: " + vehicle + " " + "from inventory");
            }
        }

    }


}
