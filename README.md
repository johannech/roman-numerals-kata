# Roman Numerals kata

Based on the [Roman Numerals kata](http://codingdojo.org/kata/RomanNumerals/).  
For more information on [Roman Numerals](http://www.novaroma.org/via_romana/numbers.html).

The overall goal is to convert a normal number to a Roman Numeral.
For example:
```
1 -> I
5 -> V
7 -> VII
10 -> X
```

## 1. Read and understand the code
In the `RomanNumerals` class look into the lists (`ones`, `tens`, `hundreds` and `thousands`) and the `toDigits()` method .  
Also look closer at the `RomanNumeralsTest`, this uses [parameterized tests](https://github.com/junit-team/junit4/wiki/parameterized-tests).  
Before moving on the the next task, understand how the existing code works.

## 2. Convert from int to roman numeral
Finish the `RomanNumerals.convert()` method to take a normal number as input and convert it to Roman Numerals.  
This task is completed when all the tests in `RomanNumeralsTest` passes.  

- Only handle numbers up to 3000
- Do not consider negative numbers at this point


## 3. Handle invalid numbers
Expand the `convert()` method to handle invalid numbers.  
Invalid numbers in this setting is a negative number or a number larger than 3000.  
When an invalid numbers is received throw an `IllegalArgumentException` with an detailed error message.  
Remember to write new test cases in the class `RomanNumeralsInvalidInputTest`.
