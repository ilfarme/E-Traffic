package me.ilfar;

//очередь на основе динамического массива
public class Queue {
    private Item[] ArrayQfItems; //динамический массив элементов очереди
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
}