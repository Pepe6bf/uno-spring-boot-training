package com.fc.fcjavaoop.service;

import com.fc.fcjavaoop.logic.BubbleSort;
import com.fc.fcjavaoop.logic.JavaSort;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortServiceTest {

    private SortService sort = new SortService(new JavaSort<>());

    @Test
    void test() throws Exception {
        // Given

        // When
        List<String> actual = sort.doSort(List.of("3", "2", "1", "4"));

        // Then
        assertEquals(List.of("1", "2", "3", "4"), actual);
    }

}