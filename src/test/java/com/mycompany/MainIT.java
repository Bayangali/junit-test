package com.mycompany;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainIT {
    private Main cut;

    @BeforeEach
    void setUp() {
        this.cut = new Main();
    }

    @Test
    void shouldReturnFormattedUppercase() {
        String input = "duke";
        String result = cut.format(input);
        assertEquals("DUKE", result);
    }
}
