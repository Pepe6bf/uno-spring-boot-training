package org.study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MainTest {
    
    @Test
    @DisplayName("Main 성공 테스트")
    void main_success_test() throws Exception {
        // Given
        String[] args = {"3", "1", "2"};

        // When & Then
        Main.main(args);
    }

}