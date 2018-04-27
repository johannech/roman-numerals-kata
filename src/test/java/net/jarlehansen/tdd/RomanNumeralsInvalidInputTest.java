package net.jarlehansen.tdd;

import org.junit.Before;
import org.junit.Test;

public class RomanNumeralsInvalidInputTest {
    private RomanNumerals romanNumerals;

    @Before
    public void setUp() {
        romanNumerals = new RomanNumerals();
    }

    @Test (expected = IllegalArgumentException.class)
    public void convert_receivesNegativeNumber_shouldThrowIllegalArgumentExceptionWithDetailedErrorMsg() {
        romanNumerals.convert(-1);
    }

    @Test (expected = IllegalArgumentException.class)
    public void convert_receivesNumberOver3000_shouldThrowIllegalArgumentExceptionWithDetailedErrorMsg() {
        romanNumerals.convert(3001);
    }
}
