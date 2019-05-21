## 1.Exercises: Methods

Problems for exercises and homework for the [&quot;Technology Fundamentals&quot; course @ SoftUni](https://softuni.bg/modules/57/tech-module-4-0/).

You can check your solutions in [Judge.](https://judge.softuni.bg/Contests/1286)

1. 1.Smallest of Three Numbers

Write a method to print the smallest of three integer numbers. Use appropriate name for the method.

### Examples

| **Input** | **Output** |
| --- | --- |
| 253 | 2 |
| 600342123 | 123 |
| 25-214 | -21 |

1. 2.Vowels Count

Write a method that receives a single string and prints the count of the vowels. Use appropriate name for the method.

### Examples

| **Input** | **Output** |
| --- | --- |
| SoftUni | 3 |
| Cats | 1 |
| JS | 0 |

1. 3.Characters in Range

Write a method that receives two characters and prints on a single line all the characters in between them according to ASCII.

### Examples

| **Input** | **Output** |
| --- | --- |
| ad | b c |
| #: | $ % &amp; &#39; ( ) \* + , - . / 0 1 2 3 4 5 6 7 8 9 |
| C# | $ % &amp; &#39; ( ) \* + , - . / 0 1 2 3 4 5 6 7 8 9 : ; \&lt; = \&gt; ? @ A B |

1. 4.Password Validator

Write a program that checks if a given password is valid. Password rules are:

- **6 – 10 characters (inclusive)**
- **Consists only of letters and digits**
- **Have at least 2 digits**

If a password is valid print &quot;Password is valid&quot;. If it is not valid, for every unfulfilled rule print a message:

- **&quot;Password must be between 6 and 10 characters&quot;**
- **&quot;Password must consist only of letters and digits&quot;**
- **&quot;Password must have at least 2 digits&quot;**

### Examples

| **Input** | **Output** |
| --- | --- |
| logIn | Password must be between 6 and 10 charactersPassword must have at least 2 digits |
| MyPass123 | Password is valid |
| Pa$s$s | Password must consist only of letters and digitsPassword must have at least 2 digits |

### Hints

Write a method for each rule.

1. 5.Add and Subtract

You will receive 3 **integers.** Write a method **sum** to get the sum of the first two integers and **subtract** method that subtracts the third integer from the result from the Sum method.

### Examples

| **Input** | **Output** |
| --- | --- |
| 23610 | 19 |
| 11730 | -12 |
| 4258100 | 0 |

1. 6.Middle Characters

You will receive a single string. Write a method that prints the middle character. If the length of the string is even there are two middle characters.

### Examples

| **Input** | **Output** |
| --- | --- |
| aString | r |
| someText | eT |
| 3245 | 24 |

1. 7.NxN Matrix

Write a method that receives a single integer **n** and prints **nxn** matrix with that number.

### Examples

| **Input** | **Output** |
| --- | --- |
| 3 | 3 3 33 3 33 3 3 |
| 7 | 7 7 7 7 7 7 7        7 7 7 7 7 7 77 7 7 7 7 7 77 7 7 7 7 7 77 7 7 7 7 7 77 7 7 7 7 7 77 7 7 7 7 7 7 |
| 2 | 2 22 2 |

1. 8.Factorial Division

Read two integer numbers. Calculate [factorial](https://en.wikipedia.org/wiki/Factorial) of each number. Divide the first result by the second and print the division formatted to the second decimal point.

### Examples

| **Input** | **Output** |   | **Input** | **Output** |
| --- | --- | --- | --- | --- |
| 52  | 60.00 |   | 62 | 360.00 |

1. 9.Palindrome Integers

A palindrome is a number which reads the same backward as forward, such as 323 or 1001. Write a program which reads a positive integer numbers until you receive &quot; **End**&quot;, for each number print whether the number is palindrome or not.

### Examples

| **Input** | **Output** |   | **Input** | **Output** |
| --- | --- | --- | --- | --- |
| 123323421121END | falsetruefalsetrue |   | 3222321010END | falsetruetruefalse |

1. 10.Top Number

A top number is an integer that holds the following properties:

- Its **sum of digits is divisible by 8** , e.g. 8, 16, 88.
- Holds at least **one odd digit** , e.g. 232, 707, 87578.

Write a program to print all master numbers in the range [1…n].

### Examples

| **Input** | **Output** |   | **Input** | **Output** |
| --- | --- | --- | --- | --- |
| 50 | 1735 |   | 100 | 173553717997 |

1. 11.\*Array Manipulator

Trifon has finally become a junior developer and has received his first task. It&#39;s about manipulating an array of integers. He is not quite happy about it, since he hates manipulating arrays. They are going to pay him a lot of money, though, and he is willing to give somebody half of it if to help him do his job. You, on the other hand, love arrays (and money) so you decide to try your luck.

The array may be manipulated by one of the following commands

- **exchange {index}** – splits the array **after** the given index, and exchanges the places of the two resulting sub-arrays. E.g. [1, 2, 3, 4, 5] -\&gt; exchange 2 -\&gt; result: [4, 5, 1, 2, 3]
  - If the index is outside the boundaries of the array, print &quot; **Invalid index**&quot;
- **max**** even/odd **– returns the** INDEX**of the max even/odd element -\&gt; [1, 4, 8, 2, 3] -\&gt;**max odd **-\&gt; print** 4**
- **min**** even/odd **– returns the** INDEX**of the min even/odd element -\&gt; [1, 4, 8, 2, 3] -\&gt;**min even **\&gt; print** 3**
  - If there are two or more equal **min/max** elements, return the index of the **rightmost** one
  - If a **min/max even/odd** element **cannot** be found, print **&quot;No matches&quot;**
- **first {count}**** even/odd**– returns the first {count} elements -\&gt; [1, 8, 2, 3] -\&gt;**first 2 even**-\&gt; print [**8, 2]**
- **last {count}**** even/odd**– returns the last {count} elements -\&gt; [1, 8, 2, 3] -\&gt;**last 2 odd**-\&gt; print [**1, 3]**
  - If the count is greater than the array length, print &quot; **Invalid count**&quot;
  - If there are **not**** enough **elements to satisfy the count, print as many as you can. If there are** zero ****even/odd** elements, print an empty array &quot;[]&quot;
- **end** – stop taking input and print the final state of the array

### Input

- The input data should be read from the console.
- On the first line, the initial array is received as a line of integers, separated by a single space
- On the next lines, until the command &quot; **end**&quot; is received, you will receive the array manipulation commands
- The input data will always be valid and in the format described. There is no need to check it explicitly.

### Output

- The output should be printed on the console.
- On a separate line, print the output of the corresponding command
- On the last line, print the final array in **square brackets** with its elements separated by a comma and a space
- See the examples below to get a better understanding of your task

### Constraints

- The **number of input lines** will be in the range [2 … 50].
- The **array elements** will be integers in the range [0 … 1000].
- The **number of elements** will be in the range [1 .. 50]
- The **split index** will be an integer in the range [-2
# 31
… 2
# 31
 – 1]
- **first/last count** will be an integer in the range [1
#
… 2
# 31
 – 1]
- There will **not** be redundant whitespace anywhere in the input
- Allowed working time for your program: 0.1 seconds. Allowed memory: 16 MB.

### Examples

| **Input** | **Output** |
| --- | --- |
| 1 3 5 7 9exchange 1max oddmin evenfirst 2 oddlast 2 evenexchange 3end | 2No matches[5, 7][][3, 5, 7, 9, 1] |
| 1 10 100 1000max evenfirst 5 evenexchange 10min oddexchange 0max evenmin evenend | 3Invalid countInvalid index020[10, 100, 1000, 1] |
| 1 10 100 1000exchange 3first 2 oddlast 4 oddend | [1][1][1, 10, 100, 1000] |