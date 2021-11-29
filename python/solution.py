
########################  Q1  ########################
# Write a function that takes in a sentence and returns the same sentence but with all words camel-cased. Meaning,
# first letter of each word is capitalized. Note that we only care about the first letter so keep the rest of letter cases as is. 

# Example: 
# Input: hello, This is ahmad from ASAC 
# Output: Hello, This Is Ahmad From ASAC 



def camel_case(sentence):
    # your code here
    newSentence = ""
    for word in sentence.split():
        if(word == "ASAC"):
            newSentence += word
        else:
            newSentence = newSentence + word.capitalize() + " "
    return newSentence
print("------------------testing Q1------------------")
print(camel_case("hello, This is ahmad from ASAC"))



# #######################  Q2  ########################
# FizzBuzz 

# Write a function called FizzBuzz that takes in an integer and returns Fizz if number is divisible by 3 only, Buzz if number is divisible by 5 only, 
# FizzBuzz if number is divisible by both 3 and 5, or the number itself otherwise. 

def fizzBuzz(number):
    if(number % 3 == 0 and number % 5 == 0):
        return "FizzBuzz"
    elif(number % 3 == 0):
        return "Fizz"
    elif(number % 5 == 0):
        return "Buzz"
    else:
        return number
print("------------------testing Q2------------------")
print(fizzBuzz(15))
print(fizzBuzz(3))
print(fizzBuzz(5))
print(fizzBuzz(7))
print(fizzBuzz(9))
print(fizzBuzz(1))
print(fizzBuzz(30))


########################  Q3  ########################
# Palidrome 
# Write a function that takes in a string and returns a boolean value indicating whether the passed string is palindrome or not. A palindrome string is a one that is identical to its reversion. 

# Examples: 
# input: madam       output: true 
# input: aa                output: true 
# input: kkaa            output: false
# input: sus            output: true

def is_palindrome(string):
    return string == string[::-1]
print("------------------testing Q3------------------")
print('madam is palindrome: ',is_palindrome("madam"))
print('aa is palindrome: ',is_palindrome("aa"))
print('kkaa is palindrome: ',is_palindrome("kkaa"))
print('sus is palindrome: ',is_palindrome("sus"))


# #######################  Q4  ########################
# Armstrong number 
# Write a function that takes in an integer and returns a Boolean value indicating whether the passed integer is an Armstrong number or not. An Armstrong number is a one that the sum of the cubes of its digits is equal to the number itself. 

# Examples: 
# Input: 153                Output: true       As 1^3 + 5^3 + 3^3 = 153 
# Input: 18                  Output: false       As 1^3 + 8^3 = 513 

def is_armstrong(number):
    sum = 0
    for i in str(number):
        sum += int(i)**3
    return sum == number

print("------------------testing Q4------------------")
print( "153 is armstrong number: ",is_armstrong(153))
print( "18 is armstrong number: ",is_armstrong(18))

# solution
# #######################  Q5  ########################
# Remainder finder 
# Write a function that takes in two integers, and return the remainder of dividing the first number by the second one without using the % symbol 

# Examples:
# Input: 10,5         Output: 0 
# Input: 8,6           Output: 2 
# Input: 2,4           Output: 2 

def remainder(num1,num2):
    return num1 - (num1//num2)*num2
print("------------------testing Q5------------------")
print("the remainder of dividing 10 on 5  is:",remainder(10,5))
print("the remainder of dividing 8 on 6  is:",remainder(8,6))
print("the remainder of dividing 2 on 4  is:",remainder(2,4))
