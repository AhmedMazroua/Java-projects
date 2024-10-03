package Generics;

import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        Car queenVic = new Car("testing","queen victoria", "12345678",500 );

        Inventory<Vehicle> arr = new Inventory<>();

        arr.addToInventory(queenVic);

        System.out.println( arr.toString());
    }


}
