package com.etraffic.model;

//очередь на основе динамического массива
//он же "автотраспортное предприятие (АТП)".

public class Queue {
    private Bus[] ArrayOfItems; //динамический массив ссылок на автобусы (элементов очереди)
    private int MaxSize; //размерность динамического массива
    private int CurrentState; //текущее количество элементов массива (очереди)
    private int firstItem;
    private int lastItem;

    /*************
     * метод добавления принимает в качестве входного параметра ссылку на объект класса автобус
     * а возвращает логическое значение, добавление успешно или нет
     **************/
    public boolean Push(Bus pushBus) {
        boolean isSuccess = false;

        if (lastItem != ArrayOfItems.length-1) { //проверка заполненности массива
            ArrayOfItems[lastItem] = pushBus; //добавляем элемент в конец очереди
            lastItem++;
            isSuccess=true;
        }

        return isSuccess;
    }

    public boolean Pop() {
        boolean isSuccess = false;

        if (firstItem != lastItem) { //проверка на пустоту
            ArrayOfItems[firstItem] = null; //удаляем элемент из начала очереди
            firstItem++;
        }

        return isSuccess;
    }


    //кажется, этот метод не понадобится
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
        ArrayOfItems = new Bus[maxSize];
        firstItem = 0;
        lastItem = 0;
    }

    public Bus[] getArrayQfItems() {
        return ArrayOfItems;
    }

    public int getMaxSize() {
        return MaxSize;
    }

    public Queue setMaxSize(int maxSize) {
        MaxSize = maxSize;
        return this;
    }

    public int getCurrentState() {
        return CurrentState;
    }

    public Queue setCurrentState(int currentState) {
        CurrentState = currentState;
        return this;
    }


    //методы управления состоянием программы (сохранение/загрузка из файла)

    public void SaveAll(String FileName) {
        /**
         * метод сохранения состояния программы на внешнем файле
         * в качестве формального параметра принимает строковое значение
         * то есть название файла
         **/

    }
    public void OpenSaved(String FileName) {
        /**
         * метод открытия сохранённого состояния программы из внешнего файла
         * в качестве формального параметра принимает строковое значение
         * то есть название файла
         **/
    }
}
