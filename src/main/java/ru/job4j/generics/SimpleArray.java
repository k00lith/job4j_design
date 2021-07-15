package ru.job4j.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class SimpleArray<T> implements Iterable<T> {

    private Object[] array = new Object[10];
    private int size = 0;

    //добавляет указанный элемент (model) в первую свободную ячейку
    public void add(T model) {
        array[size++] = model;
    }

    //заменяет указанным элементом (model) элемент, находящийся по индексу index
    public void set(int index, T model) {
        Objects.checkIndex(index, size);
        array[index] = model;
    }
    //удаляет элемент по указанному индексу, все находящиеся справа элементы
    //при этом необходимо сдвинуть на единицу влево (в середине массива не должно быть пустых ячеек);
    public void remove(int index) {
        Objects.checkIndex(index, size);
        System.arraycopy(array, index + 1, array, index, size - 1 - index);
        size--;
    }
    //возвращает элемент, расположенный по указанному индексу;
    public T get(int index) {
        Objects.checkIndex(index, size);
        return (T) array[index];
    }

    public int size() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {

        return new Iterator<T>() {

            int index = 0;

            @Override
            public boolean hasNext() {
                return index < size;
            }

            @Override
            public T next() {
                return (T) array[index++];
            }
        };
    }
}
