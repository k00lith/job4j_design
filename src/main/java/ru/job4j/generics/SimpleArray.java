package ru.job4j.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SimpleArray<T> implements Iterable<T> {

    private int size;

    public SimpleArray(int cells) {
        this.size = cells;

    }
    //добавляет указанный элемент (model) в первую свободную ячейку
    public void add(T model) {

    }
    //заменяет указанным элементом (model) элемент, находящийся по индексу index
    public void set(int index, T model) {

    }
    //удаляет элемент по указанному индексу, все находящиеся справа элементы
    //при этом необходимо сдвинуть на единицу влево (в середине массива не должно быть пустых ячеек);
    public void remove(int index) {

    }
    //возвращает элемент, расположенный по указанному индексу;
    public void get(int index) {

    }

    @Override
    public Iterator<T> iterator() {

        return null;
    }



}
