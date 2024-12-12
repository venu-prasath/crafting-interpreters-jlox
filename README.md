# Crafting Interpreters - Tree-Walk Interpreter

This repository contains the implementation of the Tree-Walk Interpreter, as described in Part II of *Crafting Interpreters* by Robert Nystrom. The book provides a comprehensive guide to designing and implementing interpreters for programming languages, starting from basic principles and gradually advancing to more sophisticated techniques.

## About the Book

*Crafting Interpreters* is a two-part journey into the world of language design and implementation:

1. **Part I** focuses on building a simple interpreter in Java, providing readers with a foundational understanding of parsing, syntax trees, and evaluation.
2. **Part II** (covered in this repository) dives deeper into creating a fully-featured Tree-Walk Interpreter using a hand-crafted lexer and parser, culminating in an implementation of a dynamically-typed programming language, Lox.

This repository is dedicated to the Tree-Walk Interpreter, showcasing the implementation of Lox in Java.

## Features of the Tree-Walk Interpreter

- **Handwritten Lexer and Parser**: Implements a recursive descent parser for generating the abstract syntax tree (AST).
- **Dynamic Typing**: Supports various data types, including strings, numbers, booleans, and `nil`.
- **Control Flow**: Includes conditionals (`if`), loops (`while`, `for`), and block scoping.
- **Functions and Closures**: Implements first-class functions and lexical scoping.
- **Error Handling**: Provides detailed error messages for runtime and syntax errors.

## Directory Structure

- `src`: Contains the implementation of the Tree-Walk Interpreter.
    - `scanner` Code for tokenizing the input source code.
    - `parser`: Code for generating the AST.
    - `interpreter`: Code for evaluating the AST.
    - `ast`: Definitions of AST nodes.
    - `main`: Entry point of the interpreter.

## How to Run

1. Clone this repository:

   ```bash
   git clone https://github.com/venu-prasath/crafting-interpreters-jlox
   cd crafting-interpreters-jlox
   ```

2. Compile the Java code:

   ```bash
   ./gradlew clean build jar 
   ```

3. Run the interpreter:

   ```bash
   java -jar build/libs/jlox-1.0-SNAPSHOT.jar
   ```

4. Input your Lox program to execute it.

## Example Lox Program

```lox
fun greet(name) {
  print "Hello, " + name + "!";
}

greet("World");
```

## Contributions

This implementation closely follows the structure and approach described in the book. Contributions are welcome for enhancements, bug fixes, or new features while staying true to the principles outlined in *Crafting Interpreters*.

## Resources

- Official website for *Crafting Interpreters*: [craftinginterpreters.com](https://craftinginterpreters.com/)
- Author: Robert Nystrom

## License

This project is open-sourced under the MIT License. See the `LICENSE` file for details.


