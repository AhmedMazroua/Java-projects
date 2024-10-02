package Generics;

abstract class Vehicle {
    String MAKE = "Ford";
    String model;
    String vin;
    int horsepower;

    public Vehicle(String MAKE, String model, String vin, int horsepower) {
        this.MAKE = MAKE;
        this.model = model;
        this.vin = vin;
        this.horsepower = horsepower;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "MAKE='" + MAKE + '\'' +
                ", model='" + model + '\'' +
                ", vin='" + vin + '\'' +
                ", horsepower=" + horsepower +
                '}';
    }

}
