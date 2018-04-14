package me.ilfar;

public class Passenger {
    private String Name; //фамилия пассажира
    private double Fare; //стоимость проезда

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getFare() {
        return Fare;
    }

    public void setFare(double fare) {
        Fare = fare;
    }
}
