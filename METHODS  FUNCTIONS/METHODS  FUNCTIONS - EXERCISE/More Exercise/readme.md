# 1.More Exercises: Methods

Problems for exercises and homework for the [&quot;Technology Fundamentals&quot; course @ SoftUni](https://softuni.bg/modules/57/tech-module-4-0/).

You can check your solutions in [Judge.](https://judge.softuni.bg/Contests/1294)

1. 1.Data Types

Write a program that, depending on the first line of the input, reads an **int** , **double** or **string**.

- If the data type is **int** , multiply the number by 2.
- If the data type is **real** , multiply the number by 1.5 and format it to the second decimal point.
- If the data type is **string** , surround the input with &quot;$&quot;.

Print the result on the console.

### Examples

| **Input** | **Output** |
| --- | --- |
| int5 | 10 |
| real2 | 3.00 |
| stringhello | $hello$ |

### Hint

Try to solve the problem using only one method with different overloads.

1. 2.Center Point

You are given the coordinates of two points on a [Cartesian coordinate system](https://en.wikipedia.org/wiki/Cartesian_coordinate_system) - X1, Y1, X2 and Y2. **Create a method** that prints the point that is closest to the center of the coordinate system (0, 0) in the format (X, Y). If the points are on a same distance from the center, print only the first one.

### Examples

| **Input** | **Output** |
| --- | --- |
| 24-12 | (-1, 2) |

1. 3.Longer Line

You are given the coordinates of four points in the 2D plane. The first and the second pair of points form two different lines. Print the longer line in format &quot;(X1, Y1)(X2, Y2)&quot; starting with the point that is closer to the center of the coordinate system (0, 0) (You can reuse the method that you wrote for the previous problem). If the lines are of equal length, print only the first one.

### Examples

| **Input** | **Output** |
| --- | --- |
| 24-12-5-54-3 | (4, -3)(-5, -5) |

1. 4.Tribonacci Sequence

In the **&quot;Tribonacci&quot; sequence** , every number is formed by the **sum of the previous 3**.

You are given a number **num**. Write a program that prints **num** numbers from the Tribonacci sequence, each on a new line, starting from 1. The input comes as a parameter named **num**. The value **num** will always be positive integer.

### Examples

| **Input** | **Output** |   | **Input** | **Output** |
| --- | --- | --- | --- | --- |
| 4 | 1 1 2 4  |   | 8 | 1 1 2 4 7 13 24 44 |

1. 5.Multiplication Sign

You are given a number **num1** , **num2** and **num3**. Write a program that finds if **num1 \* num2 \* num3** (the product) is **negative** , **positive or zero**. Try to do this **WITHOUT** multiplying the 3 numbers.

### Examples

| **Input** | **Output** |   | **Input** | **Output** |
| --- | --- | --- | --- | --- |
| 23-1 | negative  |   | 231 | positive |