package org.study.logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

class BubbleSortTest {

    @Test
    @DisplayName("버블 정렬 성공 테스트")
    void bubble_sort_success_test() throws Exception {
        // Given
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();

        // When
        List<Integer> actual = bubbleSort.sort(List.of(3, 2, 4, 5, 1));

        // Then
        assertThat(actual).isEqualTo(List.of(1, 2, 3, 4, 5));
    }
}