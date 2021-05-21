package ru.job4j.it;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MatrixIt implements Iterator<Integer> {
    private final int[][] data;
    private int row = 0;
    private int column = 0;

    public MatrixIt(int[][] data) {
        this.data = data;
    }

    @Override
    public boolean hasNext() {
        while (data[row].length == 0 && (data.length - row) != 1) {
            row++;
            column = 0;
        }
        if ((data.length - row) == 1 && data[row].length == 1) {
            return true;
        }
        if ((data.length - row) == 1 && data[row].length == 0) {
            return false;
        }
        if (data[row].length != 0 && (data.length - row) != 1) {
            return true;
        }
        return true;
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        } else if ((data.length - row) > 1 && data[row].length == 1) {
            return data[row++][column];
        }
        return data[row][column++];
    }
}
