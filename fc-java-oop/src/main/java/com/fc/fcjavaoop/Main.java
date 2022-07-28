package com.fc.fcjavaoop;

import com.fc.fcjavaoop.logic.BubbleSort;
import com.fc.fcjavaoop.logic.Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sort<String> sort = new BubbleSort<>();

        System.out.println("(result) : " + sort.sort(Arrays.asList(args)));
    }
}
