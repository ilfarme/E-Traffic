package com.etraffic.model;

//адресный разомкнутый упорядоченный однонаправленный список без заголовка
public class Bus {
    private String LicencePlate; //гос.номер автобуса
    private String Driver; //фамилия водителя

    protected class Item { //класс описываюший объект "элемент списка", тот самый класс-посредник для объекта класса пассажир
        private Item NextItem; //ссылка на следующий элемент списка
        private Passenger Info; //информационное поле элемента списка, т.е пассажир
    }

    private Item FirstItem; //ссылка на первый элемент списка

    public boolean Push(Item pushItem) {
        boolean isSuccess = false;
        /*************
         * метод добавления принимает в качестве входного параметра ссылку на объект класса элемент списка(пассажир)
         * а возвращает логическое значение, добавление успешно или нет
         **************/
        return isSuccess;
    }

    public boolean Pop(Item popItem) {
        boolean isSuccess = false;
        /*************
         * метод удаления принимает в качестве входного параметра ссылку на объект класса элемент списка (пассажир)
         * а возвращает логическое значение, добавление успешно или нет
         **************/
        return isSuccess;
    }

    public Item Search(String passengerName) { //метод поиска
        Item foundedPassenger = null;
        /*************
         * метод поиска принимает в качестве входного параметра строку c фамилией пассажира
         * а возвращает элемент списка (где хранится информация о пассажире)
         ***************/
        return foundedPassenger;
    }

    //конструктор с параметрами и методы доступа к свойствам класса

    public Bus(String licencePlate, String driver) { //конструктор автобуса
        LicencePlate = licencePlate;
        Driver = driver;
        FirstItem = null;
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