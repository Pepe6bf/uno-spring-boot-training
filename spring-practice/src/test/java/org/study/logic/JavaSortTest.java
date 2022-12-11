package org.study.logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

class JavaSortTest {

    @Test
    @DisplayName("자바 정렬 성공 테스트")
    void java_sort_success_test() throws Exception {
        // Given
        JavaSort<Integer> javaSort = new JavaSort<>();

        // When
        List<Integer> actual = javaSort.sort(List.of(3, 2, 4, 5, 1));

        // Then
        assertThat(actual).isEqualTo(List.of(1, 2, 3, 4, 5));
    }

}