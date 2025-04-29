
# Java Sudoku Solver (CLI Version)

This is a simple **command-line Sudoku solver** written in Java.

The solver uses an **iterative backtracking algorithm**, managing moves explicitly through a custom `Stack` rather than recursion.  
It was built with an emphasis on clarity, modularity, and understanding the backtracking process step-by-step.

---

## Project Structure
- `SodokuDriver.java` — Program entry point
- `SodokuGame.java` — Handles user input and game initialization
- `SodokuBoard.java` — Manages board state and solving logic
- `SodokuSquare.java` — Represents a single cell on the board

---

## How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/YOUR_USERNAME/sudoku-solver-java.git
Navigate into the src/ directory.

Compile all .java files:

bash
Copy
Edit
javac *.java
Run the program:

bash
Copy
Edit
java SodokuDriver
Follow the CLI prompts to enter your Sudoku puzzle, or press 99 to solve with the current board.

Reflections and Future Improvements
If I were to rebuild this project today, I would:

Replace magic numbers (like 10 for empty squares) with named constants for better readability.

Use Java Generics (e.g., Stack<SodokuMove>) to enforce type safety and avoid typecasting.

Align array indices to standard Java 0–8 instead of 1–9, for conventional indexing and cleaner logic.

Enhance the user experience by creating a simple Angular frontend rather than a command-line interface (CLI), making the solver more accessible and visually appealing.

Possibly optimize solving time by applying constraint propagation strategies (like tracking possible values per square more actively).

Why This Project
This project was an opportunity for me to:

Practice building a complete backtracking algorithm from scratch.

Gain hands-on experience managing state transitions manually with a stack rather than relying on recursive call stacks.

Reinforce object-oriented design principles through modular code organization.

Challenge myself to complete a functioning solver first, before worrying about interface design or advanced optimizations.

Although it’s a relatively simple project, it reflects my approach to software development: build working solutions first, keep code modular and understandable, and stay open to future refinements.

Thank you for checking out the project!

