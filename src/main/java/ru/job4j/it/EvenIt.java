package ru.job4j.it;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class EvenIt implements Iterator<Integer> {

    private final int[] numbers;
    private int point = 0;

    public EvenIt(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public boolean hasNext() {
        int check = 0;
        for (int i = point; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                check = 1;
                point = i;
                break;
            }
        }
        return check == 1;
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return numbers[point++];
    }
}
