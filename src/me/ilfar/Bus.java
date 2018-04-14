package me.ilfar;

public class Bus {
    private String LicencePlate; //гос.номер автобуса
    private String Driver; //фамилия водителя
    private List Passengers = new List(); //список пассажиров

    public Bus(String licencePlate, String driver, List passengers) { //конструктор автобуса
        LicencePlate = licencePlate;
        Driver = driver;
        Passengers = passengers;
    }

    public String getLicencePlate() {
        return LicencePlate;
    }

    public void setLicencePlate(String licencePlate) {
        LicencePlate = licencePlate;
    }

    public String getDriver() {
        return Driver;
    }

    public void setDriver(String driver) {
        Driver = driver;
    }

    public List getPassengers() {
        return Passengers;
    }

    public void setPassengers(List passengers) {
        this.Passengers = passengers;
    }
}