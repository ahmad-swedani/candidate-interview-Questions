package Java;

/**
 * Any
 */
public class Solution {

    /**
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("------------- Q1 -------------");
        System.out.println(camelCase("hello, This is ahmad from ASAC"));

        System.out.println("------------- Q2 -------------");
        System.out.println(fizzBuzz(15));
        System.out.println(fizzBuzz(3));
        System.out.println(fizzBuzz(5));
        System.out.println(fizzBuzz(7));
        System.out.println(fizzBuzz(9));
        System.out.println(fizzBuzz(1));
        System.out.println(fizzBuzz(30));

        System.out.println("------------- Q3 -------------");
        System.out.println("madam is palindrome: "+ isPalindrome("madam"));
        System.out.println("aa is palindrome: " + isPalindrome("aa"));
        System.out.println("kkaa is palindrome: " + isPalindrome("kkaa"));
        System.out.println("sus is palindrome: " + isPalindrome("sus"));

        System.out.println("------------- Q4 -------------");
        System.out.println("153 is armstrong number: " + isArmstrongNumber(153));
        System.out.println("18 is armstrong number: " + isArmstrongNumber(18));

        System.out.println("------------- Q5 -------------");
        System.out.println("the remainder of dividing 10 on 5  is:" + remainderFinder(10, 5));
        System.out.println("the remainder of dividing 8 on 6  is:" + remainderFinder(8, 6));
        System.out.println("the remainder of dividing 2 on 4  is:" + remainderFinder(2, 4));

        System.out.println("------------- Q6 -------------");
        System.out.println("the number of digits in the number is: " + numberOfDigits(123456789));
        System.out.println("the number of digits in the number is: " + numberOfDigits(1234567));
        System.out.println("the number of digits in the number is: " + numberOfDigits(12345678901));

        System.out.println("------------- Q7 -------------");
        System.out.println("the reverse of 123456789 is: " + reverseNumber(123456789));
        System.out.println("the reverse of 1234567 is: " + reverseNumber(1234567));

        System.out.println("------------- Q8 -------------");
        System.out.println("the the number of vowels in hello is: " + numberOfVowels("hello"));
        System.out.println("the the number of vowels in world is: " + numberOfVowels("world"));



    }

//     #######################  Q1  ########################
//  Write a function that takes in a sentence and returns the same sentence but with all words camel-cased. Meaning,
//  first letter of each word is capitalized. Note that we only care about the first letter so keep the rest of letter cases as is.

//  Example:
//  Input: hello, This is ahmad from ASAC
//  Output: Hello, This Is Ahmad From ASAC

    public static String camelCase(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word.substring(0, 1).toUpperCase()).append(word.substring(1));
            sb.append(" ");
        }
        return sb.toString();
    }

    // #######################  Q2  ########################
// FizzBuzz

// Write a function called FizzBuzz that takes in an integer and returns Fizz if number is divisible by 3 only, Buzz if number is divisible by 5 only,
// FizzBuzz if number is divisible by both 3 and 5, or the number itself otherwise.

    public static String fizzBuzz(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(number);
        }
    }

// #######################  Q3  ########################
// Palidrome
// Write a function that takes in a string and returns a boolean value indicating whether the passed string is palindrome or not. A palindrome string is a one that is identical to its reversion.

// Examples:
// input: madam       output: true
// input: aa                output: true
// input: kkaa            output: false
// input: sus            output: true

    public static boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString().equals(str);
    }

// #######################  Q4  ########################
// Armstrong number
// Write a function that takes in an integer and returns a Boolean value indicating whether the passed integer is an Armstrong number or not. An Armstrong number is a one that the sum of the cubes of its digits is equal to the number itself.

// Examples:
// Input: 153                Output: true       As 1^3 + 5^3 + 3^3 = 153
// Input: 18                  Output: false       As 1^3 + 8^3 = 513

    public static boolean isArmstrongNumber(int number) {
        int sum = 0;
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit * digit * digit;
            temp /= 10;
        }
        return sum == number;
    }

    // #######################  Q5  ########################
// Remainder finder
// Write a function that takes in two integers, and return the remainder of dividing the first number by the second one without using the % symbol

// Examples:
// Input: 10,5         Output: 0
// Input: 8,6           Output: 2
// Input: 2,4           Output: 2

    public static int remainderFinder(int num1, int num2) {
        return num1 - (num1 / num2) * num2;
    }


}

// #######################  Q6  ########################
// number of digits
// Write a function that takes in a number and returns the number of digits in the number.
// examples:
// input: 123456789    output: 9
// input: 1234567      output: 7
// input: 12345678901  output: 11

public static int numberOfDigits(int number) {
    int count = 0;
    while (number > 0) {
        number /= 10;
        count++;
    }
    return count;
}

// #######################  Q7  ########################
// Reverse a number
// Write a function that takes in a number and returns the reverse of the number.
// examples:
// input: 123456789    output: 987654321
// input: 1234567      output: 7654321

public static int reverseNumber(int number) {
    int reverse = 0;
    while (number > 0) {
        int digit = number % 10;
        reverse = reverse * 10 + digit;
        number /= 10;
    }
    return reverse;
}

// #######################  Q8  ########################
// Write a function that takes in a string and returns the number of vowels in the string.
// examples:
// input: hello        output: 2
// input: world        output: 1
// input: aa           output: 2

public static int numberOfVowels(String str) {
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            count++;
        }
    }
    return count;
}


