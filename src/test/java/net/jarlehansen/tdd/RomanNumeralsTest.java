package net.jarlehansen.tdd;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class RomanNumeralsTest {
    private RomanNumerals romanNumerals;

    @Parameterized.Parameter
    public int number;

    @Parameterized.Parameter(1)
    public String expected;

    @Parameterized.Parameters(name = "{0} = {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, "I"}, {2, "II"}, {3, "III"}, {4, "IV"}, {5, "V"}, {6, "VI"}, {7, "VII"}, {8, "VIII"}, {9, "IX"},
                {10, "X"}, {22, "XXII"}, {35, "XXXV"}, {40, "XL"}, {53, "LIII"}, {62, "LXII"}, {79, "LXXIX"}, {80, "LXXX"}, {90, "XC"},
                {101, "CI"}, {220, "CCXX"}, {350, "CCCL"}, {400, "CD"}, {530, "DXXX"}, {620, "DCXX"}, {790, "DCCXC"}, {800, "DCCC"}, {900, "CM"},
                {1010, "MX"}, {2200, "MMCC"}, {3000, "MMM"}
        });
    }

    @Before
    public void setUp() {
        romanNumerals = new RomanNumerals();
    }

    @Test
    public void convert_int_toRomanNumeral() {
        String result = romanNumerals.convert(number);
        assertEquals(expected, result);
    }
}