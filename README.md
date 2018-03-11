# Roman Numerals

Based on the [Roman Numerals kata](http://codingdojo.org/kata/RomanNumerals/).

## 1. Convert from int to roman numeral
Finish the method `RomanNumerals.convert` to take a normal number as input and convert it to Roman Numerals.  
This task is completed when all the tests (`RomanNumeralsTest`) passes.  

- Only handle numbers up to 3000
- Do not consider negative numbers at this point


## 2. Handle invalid numbers
Expand the `convert` function to handle invalid numbers.  
For example if the user sends in a negative number or a number larger than 3000.  
In the case there is a invalid number input throw an `IllegalArgumentException` with an detailed error message.  
Remember to write new test cases in the class `RomanNumeralsInvalidInputTest` that tests the proper handling of invalid numbers.

## 3. Build the project with maven
The project containsthe maven wrapper, use it to build the project.
