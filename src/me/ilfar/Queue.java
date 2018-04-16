package me.ilfar;

//очередь на основе динамического массива
//он же "автотраспортное предприятие (АТП)".

public class Queue {
    private Bus[] ArrayQfItems; //динамический массив ссылок на автобусы (элементов очереди)
    private int MaxSize; //размерность динамического массива
    private int CurrentState; //текущее количество элементов массива (очереди)
    private Bus NextBus; //ссылка на следующий элемент списка

    public boolean Push(Bus pushBus) {
        boolean isSuccess = false;
        /*************
        * метод добавления принимает в качестве входного параметра ссылку на объект класса автобус
        * а возвращает логическое значение, добавление успешно или нет
        **************/
        return isSuccess;
    }

    public boolean Pop() {
        boolean isSuccess = false;
        /*************
         * метод удаления НЕ принимает входные параметры,
         * поскольку сначала нужно найти удаляемый элемент.
         * поэтому в реализации, внутри этого метода будет вызов метода поиска
         * по положительному результату поиска автобус будет удалён
         * в противном случае ситуация будет обработана как особая (элемент не найден)
         * в качестве возвращаемого параметра - логическое значение, удаление успешно или нет
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

    public int getCurrentState() {
        return CurrentState;
    }

    public Queue setCurrentState(int currentState) {
        CurrentState = currentState;
        return this;
    }

    public Bus getNextBus() {
        return NextBus;
    }

    public Queue setNextBus(Bus nextBus) {
        NextBus = nextBus;
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
