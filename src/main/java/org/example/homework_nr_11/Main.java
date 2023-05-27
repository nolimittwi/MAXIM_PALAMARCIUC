package org.example.homework_nr_11;

import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        String input = "Hello Max123";
        Function<String, Integer> countConstants = (String string) -> {
            int count = 0;
            string = string.toLowerCase();
            for (int i = 0; i < string.length(); i++) {
                char c = string.charAt(i);
                if (c >= 'b' && c <= 'z' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                    count++;
                }
            }
            return count;
        };
        int quantityConsonant = countConstants.apply(input);
        System.out.println("Quantity of Consonant = " + quantityConsonant);

        System.out.println("----------------------------");

        Function<String, Integer> getvowelLetters = input1 -> {
            int count = 0;
            input1 = input1.toLowerCase();
            for (int i = 0; i < input1.length(); i++) {
                char c = input1.charAt(i);
                if (isVowel(c)) {
                    count++;
                }
            }
            return count;
        };
        String newString2 = "New string";
        int quantityVowels = getvowelLetters.apply(newString2);
        System.out.println("Quantity of Vowels Count = " + quantityVowels);

        System.out.println("----------------------------");

        Function<String, Integer> getNumberCount = input3 -> {
            int count = 0;
            boolean isDigit = false;
            for (int i = 0; i < input3.length(); i++){
                char c = input3.charAt(i);
                if (Character.isDigit(c)){
                    if (!isDigit){
                        count++;
                        isDigit = true;
                    }
                } else {
                    isDigit = false;
                }
            }
            return count;
        };
        String input3 = "GeraGei 1 2 3";
        int countNumbers = getNumberCount.apply(input3);
        System.out.println("Number Count = " + countNumbers);

        System.out.println("----------------------------");

        Function<String, Character> EvenOrOdd = input4 -> {
                if (input4.length() % 2 == 0){
                    return null;
                } else {
                    return input4.charAt(0);
                }
        };
        String input4 = "Hello Max 123s";
        Character result = EvenOrOdd.apply(input4);
        System.out.println("NotNull " + result);

        System.out.println("----------------------------");

        Predicate<String> isPalindrome = (String string) -> {
            String processedString = string.replaceAll("","").toLowerCase();
            int length = processedString.length();
            for (int i = 0; i < length / 2; i++){
            if (processedString.charAt(i) != processedString.charAt(length - i - 1)){
                return false;
            }
            }
            return true;
        };
        boolean isPalindromeRes = isPalindrome.test(input);
        System.out.println("Строка = " + input + " is Palindrome " + isPalindromeRes);

        System.out.println("----------------------------");

        Integer number = 13;
        Predicate<Integer> isPrime = (Integer n) -> {
            if (n < 2){
                return false;
            }
            for (int i = 2; i <= Math.sqrt(n); i++){
                if (n % i == 0){
                    return false;
                }
            }
            return false;
        };
        boolean isPrimeResult = isPrime.test(number);
        System.out.println("Число " + number + " является простым: " + isPrimeResult);
    }
    public static boolean isVowel(char c) {
        return "aeiouAEIOU".contains(String.valueOf(c));
    }
}