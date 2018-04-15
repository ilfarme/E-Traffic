package me.ilfar;

//очередь на основе динамического массива
//он же "автотраспортное предприятие (АТП)".

public class Queue {
    private Item[] ArrayQfItems; //динамический массив элементов очереди
    private int MaxSize; //размерность динамического массива
    private Item FirstItem; //ссылка на первый элемент очереди
    private Item LastItem; //ссылка на последний элемент очереди
    protected class Item { //класс описывающий объект "элемент очереди"
        private Item NextItem; //ссылка на следующий элемент
        private Bus Info; //информационное поле элемента, т.е автобус (с пассажирами)
    }

    //на данном этапе разработки для удобства все методы void
    //данное допущение будет исправлено на следующем этапе разработки

    public void Push() { //метод добавления

    }

    public void Pop() { //метод удаления

    }

    public void Search() { //метод поиска

    }

    //конструктор и методы доступа

    public Queue(int maxSize) {
        MaxSize = maxSize;
        ArrayQfItems = new Item[maxSize];
        FirstItem = null;
        LastItem = null;
    }

    public Item[] getArrayQfItems() {
        return ArrayQfItems;
    }

    public int getMaxSize() {
        return MaxSize;
    }

    public Queue setMaxSize(int maxSize) {
        MaxSize = maxSize;
        return this;
    }

    public Item getFirstItem() {
        return FirstItem;
    }

    public Queue setFirstItem(Item firstItem) {
        FirstItem = firstItem;
        return this;
    }

    public Item getLastItem() {
        return LastItem;
    }

    public Queue setLastItem(Item lastItem) {
        LastItem = lastItem;
        return this;
    }
}
