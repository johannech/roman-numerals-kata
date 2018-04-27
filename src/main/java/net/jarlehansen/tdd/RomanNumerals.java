package net.jarlehansen.tdd;

import com.google.common.collect.Lists;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RomanNumerals {
    private final List<String> ones = Lists.newArrayList("", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX");
    private final List<String> tens = Lists.newArrayList("", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC");
    private final List<String> hundreds = Lists.newArrayList("", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM");
    private final List<String> thousands = Lists.newArrayList("", "M", "MM", "MMM");

    public String convert(int number) {
        if(number < 0 || number > 3000) {
            throw new IllegalArgumentException("Invalid value! Value must be between 0-3000. Your value: " + number);
        }

        List<Integer> numberList = toDigits(number);
        String result = thousands.get(numberList.get(0)) + hundreds.get(numberList.get(1)) + tens.get(numberList.get(2)) + ones.get(numberList.get(3));
        return result;
    }

    private List<Integer> toDigits(int number) {
        String numberString = StringUtils.leftPad(String.valueOf(number), 4, '0');
        return numberString.chars().map(Character::getNumericValue).boxed().collect(Collectors.toList());
    }
}
