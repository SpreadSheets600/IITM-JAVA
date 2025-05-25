class Vehicle {
    private String model;
    private int year;

    public Vehicle(String m, int y) {
        model = m;
        year = y;
    }

    public String toString() {
        return "model = " + model + ", year = " + year;
    }
}

class ElectricVehicle extends Vehicle {
    private int batteryCapacity;

    public ElectricVehicle(String m, int y, int capacity) {
        super(m, y); // Calls The Parent Class Constructor To Initialize The 'model' And 'year'
        batteryCapacity = capacity; // Initializes The 'batteryCapacity' Field
    }

    public String toString() {
        return super.toString() + ", batteryCapacity = " + batteryCapacity + " kWh";
    }
}
