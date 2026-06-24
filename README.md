# SC_SD_1# 🧩 Sudoku Solver Pro

## Overview

Sudoku Solver Pro is a Java Swing-based desktop application that automatically solves Sudoku puzzles using the Backtracking Algorithm.

The application provides an interactive graphical user interface where users can enter Sudoku puzzles manually or load predefined difficulty levels. The program efficiently finds a valid solution and displays the completed puzzle instantly.

This project demonstrates problem-solving skills, recursive algorithms, object-oriented programming concepts, and GUI development using Java Swing.

---

## Features

-  Modern Navy Blue User Interface
-  Interactive 9×9 Sudoku Grid
-  Automatic Sudoku Solving
-  Score Tracking
-  Easy, Medium, and Hard Difficulty Levels
-  Clear Board Functionality
-  User-Friendly Design
-  Fast Backtracking Algorithm
-  Suitable for Academic and Internship Projects

---

##  Technologies Used

- Java
- Java Swing
- Object-Oriented Programming (OOP)
- Backtracking Algorithm

---

## Algorithm Used

The application uses the **Backtracking Algorithm** to solve Sudoku puzzles.

### Steps

1. Find an empty cell.
2. Try numbers from 1 to 9.
3. Check whether the number is valid:
   - Row validation
   - Column validation
   - 3×3 sub-grid validation
4. If valid, place the number.
5. Recursively solve the remaining cells.
6. If no solution exists, backtrack and try another number.

This approach guarantees a valid solution whenever one exists.

---

## 📂 Project Structure

```
SudokuSolverGUI.java
README.md
```

---

## How to Run

### Compile

```bash
javac SudokuSolverGUI.java
```

### Execute

```bash
java SudokuSolverGUI
```

---

##  How to Use

1. Launch the application.
2. Select Easy, Medium, or Hard puzzle.
3. Enter values manually if desired.
4. Click the **Solve** button.
5. The application automatically solves the puzzle.
6. Use the **Clear** button to reset the board.

---

## 📸 Screenshots

Add screenshots here after running the application.

Example:

- Main Interface
- Solved Sudoku Puzzle
- Difficulty Selection

---

##  Learning Outcomes

This project helped in understanding:

- Recursive Programming
- Backtracking Techniques
- Java Swing GUI Development
- Event Handling
- Data Validation
- Problem Solving Skills

---

## 🔮 Future Enhancements

- Timer System
- Hint Generation
- Dark/Light Themes
- Save and Load Puzzle Feature
- Leaderboard System
- Sound Effects
- Puzzle Generator

---

## 👩‍💻 Author

Mounika Pulaparthi

B.Tech Computer Science Engineering Student

Passionate about Java Development, Data Structures & Algorithms, Problem Solving, and Software Engineering.

---

## ⭐ Acknowledgements

This project was developed as part of software development practice and internship project work to strengthen Java programming and algorithmic problem-solving skills.
A Java Swing GUI application that converts temperatures between Celsius, Fahrenheit and Kelvin scales.
