// #######################  Q1  ########################
//  Write a function that takes in a sentence and returns the same sentence but with all words camel-cased. Meaning,
//  first letter of each word is capitalized. Note that we only care about the first letter so keep the rest of letter cases as is.

//  Example:
//  Input: hello, This is ahmad from ASAC
//  Output: Hello, This Is Ahmad From ASAC

function camelCase(str) {
  let arr = str.split(" ");
  let newArr = [];
  for (let i = 0; i < arr.length; i++) {
    newArr.push(arr[i].charAt(0).toUpperCase() + arr[i].slice(1));
  }
  return newArr.join(" ");
}

console.log("------------------testing Q1------------------");
console.log(camelCase("hello, This is ahmad from ASAC"));

// #######################  Q2  ########################
// FizzBuzz

// Write a function called FizzBuzz that takes in an integer and returns Fizz if number is divisible by 3 only, Buzz if number is divisible by 5 only,
// FizzBuzz if number is divisible by both 3 and 5, or the number itself otherwise.

function fizzBuzz(num) {
  if (num % 3 === 0 && num % 5 === 0) {
    return "FizzBuzz";
  } else if (num % 3 === 0) {
    return "Fizz";
  } else if (num % 5 === 0) {
    return "Buzz";
  } else {
    return num;
  }
}

console.log("------------------testing Q2------------------");
console.log(fizzBuzz(15));
console.log(fizzBuzz(3));
console.log(fizzBuzz(5));
console.log(fizzBuzz(7));
console.log(fizzBuzz(9));
console.log(fizzBuzz(1));
console.log(fizzBuzz(30));

// #######################  Q3  ########################
// Palidrome
// Write a function that takes in a string and returns a boolean value indicating whether the passed string is palindrome or not. A palindrome string is a one that is identical to its reversion.

// Examples:
// input: madam       output: true
// input: aa                output: true
// input: kkaa            output: false
// input: sus            output: true

function isPalindrome(str) {
  let arr = str.split("");
  let newArr = [];
  for (let i = arr.length - 1; i >= 0; i--) {
    newArr.push(arr[i]);
  }
  return newArr.join("") === str;
}

console.log("------------------testing Q3------------------");
console.log("madam is palindrome: ", isPalindrome("madam"));
console.log("aa is palindrome: ", isPalindrome("aa"));
console.log("kkaa is palindrome: ", isPalindrome("kkaa"));
console.log("sus is palindrome: ", isPalindrome("sus"));

// #######################  Q4  ########################
// Armstrong number
// Write a function that takes in an integer and returns a Boolean value indicating whether the passed integer is an Armstrong number or not. An Armstrong number is a one that the sum of the cubes of its digits is equal to the number itself.

// Examples:
// Input: 153                Output: true       As 1^3 + 5^3 + 3^3 = 153
// Input: 18                  Output: false       As 1^3 + 8^3 = 513

function isArmstrongNumber(num) {
  let arr = num.toString().split("");
  let sum = 0;
  for (let i = 0; i < arr.length; i++) {
    sum += Math.pow(arr[i], 3);
  }
  return sum === num;
}

console.log("------------------testing Q4------------------");
console.log("153 is armstrong number: ", isArmstrongNumber(153));
console.log("18 is armstrong number: ", isArmstrongNumber(18));

// #######################  Q5  ########################
// Remainder finder
// Write a function that takes in two integers, and return the remainder of dividing the first number by the second one without using the % symbol

// Examples:
// Input: 10,5         Output: 0
// Input: 8,6           Output: 2
// Input: 2,4           Output: 2

function remainderFinder(num1, num2) {
  return num1 - num2 * Math.floor(num1 / num2);
}

console.log("------------------testing Q5------------------");
console.log("the remainder of dividing 10 on 5  is:", remainderFinder(10, 5));
console.log("the remainder of dividing 8 on 6  is:", remainderFinder(8, 6));
console.log("the remainder of dividing 2 on 4  is:", remainderFinder(2, 4));

// #######################  Q6  ########################
// number of digits
// Write a function that takes in a number and returns the number of digits in the number.
// examples:
// input: 123456789    output: 9
// input: 1234567      output: 7
// input: 12345678901  output: 11

function numberOfDigits(num) {
  let arr = num.toString().split("");
  return arr.length;
}

console.log("------------------testing Q6------------------");
console.log("the number of digits for 123456789: ", numberOfDigits(123456789));
console.log("the number of digits for 1234567: ", numberOfDigits(1234567));

// #######################  Q7  ########################
// Reverse a number
// Write a function that takes in a number and returns the reverse of the number.
// examples:
// input: 123456789    output: 987654321
// input: 1234567      output: 7654321
function reverseNumber(num) {
  let arr = num.toString().split("");
  let newArr = [];
  for (let i = arr.length - 1; i >= 0; i--) {
    newArr.push(arr[i]);
  }
  return newArr.join("");
}

console.log("------------------testing Q7------------------");
console.log("the reverse of 123456789 is: ", reverseNumber(123456789));
console.log("the reverse of 1234567 is: ", reverseNumber(1234567));

// #######################  Q8  ########################
// Write a function that takes in a string and returns the number of vowels in the string.
// examples:
// input: hello        output: 2
// input: world        output: 1
// input: aa           output: 2

// Way 1:
function numberOfVowels(str) {
  let vowels = ["a", "e", "i", "o", "u"];
  let arr = str.split("");
  let count = 0;
  for (let i = 0; i < arr.length; i++) {
    if (vowels.includes(arr[i].toLowerCase())) {
      count++;
    }
  }
  return count;
}
// Way 2:
function numberOfVowels(str) {
  let arr = str.split("");
  let count = 0;
  for (let i = 0; i < arr.length; i++) {
    if (
      arr[i] === "a" ||
      arr[i] === "e" ||
      arr[i] === "i" ||
      arr[i] === "o" ||
      arr[i] === "u"
    ) {
      count++;
    }
  }
  return count;
}

console.log("------------------testing Q8------------------");
console.log("the number of vowels in hello is: ", numberOfVowels("hello"));
console.log("the number of vowels in world is: ", numberOfVowels("world"));
console.log("the number of vowels in aa is: ", numberOfVowels("aa"));
