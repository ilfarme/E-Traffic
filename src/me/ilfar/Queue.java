package me.ilfar;

//очередь на основе динамического массива
//он же "автотраспортное предприятие (АТП)".

public class Queue {
    private Bus[] ArrayQfItems; //динамический массив ссылок на автобусы (элементов очереди)
    private int MaxSize; //размерность динамического массива
    private Bus FirstItem; //ссылка на первый элемент очереди
    private Bus LastItem; //ссылка на последний элемент очереди

    public boolean Push(Bus pushBus) {
        boolean isSuccess = false;
        /*************
        * метод добавления принимает в качестве входного параметра ссылку на объект класса автобус
        * а возвращает логическое значение, добавление успешно или нет
        **************/
        return isSuccess;
    }

    public boolean Pop(Bus popBus) {
        boolean isSuccess = false;
        /*************
         * метод удаления принимает в качестве входного параметра ссылку на объект класса автобус
         * а возвращает логическое значение, добавление успешно или нет
         **************/
        return isSuccess;
    }

    public Bus Search(String Driver) { //метод поиска
        Bus foundedBus = null;
        /*************
         * метод поиска принимает в качестве входного параметра строку c фамилией водителя
         * а возвращает автобус, на котором он поедет в рейс
         **************/
        return foundedBus;
    }

    //конструктор и методы доступа

    public Queue(int maxSize) {
        MaxSize = maxSize;
        ArrayQfItems = new Bus[maxSize];
        FirstItem = null;
        LastItem = null;
    }

    public Bus[] getArrayQfItems() {
        return ArrayQfItems;
    }

    public int getMaxSize() {
        return MaxSize;
    }

    public Queue setMaxSize(int maxSize) {
        MaxSize = maxSize;
        return this;
    }

    public Bus getFirstItem() {
        return FirstItem;
    }

    public Queue setFirstItem(Bus firstItem) {
        FirstItem = firstItem;
        return this;
    }

    public Bus getLastItem() {
        return LastItem;
    }

    public Queue setLastItem(Bus lastItem) {
        LastItem = lastItem;
        return this;
    }

    //методы управления состоянием программы (сохранение/загрузка из файла)

    public void SaveAll() {
        //метод сохранения состояния программы на внешнем файле
    }
    public void OpenSaved() {
        //метод открытия сохранённого состояния программы из внешнего файла
    }
}
