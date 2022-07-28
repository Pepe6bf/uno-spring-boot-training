package com.fc.fcjavaoop.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JavaSort<T extends Comparable<T>> implements Sort<T> {

    @Override
    public List<T> sort(List<T> list) {
        ArrayList<T> output = new ArrayList<>(list);
        Collections.sort(output);

        return output;
    }
}
