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
        if (data.length >= 1) {
            for (int i = 0; i < data.length; i++) {
                if (data[i].length >= 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }

        if (data[row].length == 0) {
            row++;
        }
        if (data[row].length == 1) {
            return data[row++][column];
        }
        if (data[row].length > 1) {
                return data[row][column++];
        }
        return null;
    }
}
