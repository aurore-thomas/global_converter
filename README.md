# Global Converter


Here is my project of the global_converter. Most of the program works but it is not completly finished.

### SYNTAX
Please, to run the program, use this syntax : 

``` java Main "arg1" arg2 arg3 ```

- arg1 : It is the text or the ASCII code you want to convert
- arg2 : The actual base (text, binary, octal, decimal or hexadecimal)
- arg3 : The future base (the same)

### STRUCTURE
There is four classes in this project. The Main checks if the input is correct or not. Then, we have the Converter class where we find a switch case. It allows the programs to convert in the right base and in both ways. Eventually, there are two other classes, one to convert a text into ASCII code, the other to convert in text. 

### PROBLEMS 
The program runs correctly if you want to convert a text to an ASCII code. In the other way, only the "Decimal to Text" function works.
The other methods should work but I have an error messages about index (Exception in thread "main" java.lang.StringIndexOutOfBoundsException: Index 7 out of bounds for length 3)
 and I coudn't resolve it. It will be fix in few days but I wait the correction to commit later. However, the logic to return into text should work, I verified it manually.
