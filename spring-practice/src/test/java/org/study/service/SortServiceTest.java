package org.study.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.study.logic.BubbleSort;
import org.study.logic.JavaSort;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

class SortServiceTest {

    private SortService sortService = new SortService(new JavaSort<>());
//    private SortService sortService = new SortService(new BubbleSort<>());

    @Test
    @DisplayName("SortService 테스트")
    void sortservice_test() throws Exception {
        // Given
        
        // When
        List<String> actual = sortService.doSort(List.of("3", "1", "2"));

        // Then
        assertThat(actual).isEqualTo(List.of("1", "2", "3"));
    }

}