package org.study.service;

import org.study.logic.JavaSort;
import org.study.logic.Sort;

import java.util.List;

public class SortService {

    private final Sort<String> sort;

    /**
     * 생성자 DI
     */
    public SortService(Sort<String> sort) {
        this.sort = sort;
        System.out.println("구현체 : " + sort.getClass().getName());
    }

    public List<String> doSort(List<String> list) {
        return sort.sort(list);
    }
}
