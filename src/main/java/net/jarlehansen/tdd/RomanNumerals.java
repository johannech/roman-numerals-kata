package net.jarlehansen.tdd;

import com.google.common.collect.Lists;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.stream.Collectors;

public class RomanNumerals {
    private final List<String> ones = Lists.newArrayList("", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX");
    private final List<String> tens = Lists.newArrayList("", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC");
    private final List<String> hundreds = Lists.newArrayList("", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM");
    private final List<String> thousands = Lists.newArrayList("", "M", "MM", "MMM");

    public String convert(int number) {
        return "";
    }

    private List<Integer> toIntegerList(int number) {
        String numberString = StringUtils.leftPad(String.valueOf(number), 4, '0');
        return numberString.chars().map(Character::getNumericValue).boxed().collect(Collectors.toList());
    }
}
