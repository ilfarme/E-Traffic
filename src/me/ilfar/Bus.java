package me.ilfar;

//адресный разомкнутый упорядоченный однонаправленный список без заголовка
public class Bus {
    private String LicencePlate; //гос.номер автобуса
    private String Driver; //фамилия водителя

    protected class Item { //класс описываюший объект "элемент списка", тот самый класс-посредник для объекта класса пассажир
        private Item NextItem; //ссылка на следующий элемент списка
        private Passenger Info; //информационное поле элемента списка, т.е пассажир
    }

    //на данном этапе разработки все методы управления списком типа void
    //это сделлано для удобства
    // данное допущение будет исправлено на следующем этапе разработки

    public void Push() { //метод добавления элемента в список

    }

    public void Pop() { //метод удаления элемента из списка

    }

    public void Search() { //метод поиска элемента списка

    }

    //конструктор с параметрами и методы доступа к свойствам класса

    public Bus(String licencePlate, String driver) { //конструктор автобуса
        LicencePlate = licencePlate;
        Driver = driver;
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
}