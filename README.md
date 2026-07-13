# ☕ Java Console: Employee Commission Tracker

A terminal-based Java program built to track employee details and their respective commissions. This individual project was created for the "Fundamentals of Programming (CIS1403)" module to showcase a strong understanding of basic programming logic and data management.

## 🌟 Key Functionalities

The application runs directly in the command line and offers the following tools:

*   **Record Insertion:** Users can register new employees (up to 2 records) by inputting their unique ID, full name, and commission value.
*   **Data Retrieval:** Includes a search tool that scans the system using the employee's ID and outputs their stored information.
*   **Continuous Navigation:** Features an interactive, loop-driven menu that stays active until the user explicitly decides to quit.
*   **Validation & Alerts:** Notifies the user immediately if a searched ID does not exist in the database.

## 🧠 Technical Skills Demonstrated

This project highlights the practical application of several core Java concepts:

*   **Parallel Arrays:** Utilized `String` and `Double` arrays to link and store corresponding employee attributes in memory.
*   **Iteration & Branching:** Applied `do-while` loops for the main program lifecycle and `switch-case` statements for menu selection.
*   **Console I/O:** Leveraged the `Scanner` utility to read, parse, and handle keyboard inputs dynamically.
*   **Linear Searching:** Designed a `for` loop mechanism to iterate through arrays and locate specific records efficiently.

## 💻  Demonstration

Below is an example of the program's interface in action:

Choose an option:
1. Add new employee
2. Search for employee
3. Exit
Enter your choice: 1
Enter employee ID: E101
Enter employee name: Ahmed Ali
Enter employee commission: 5000.0
Employee details added successfully! 

Choose an option:
1. Add new employee
2. Search for employee
3. Exit
Enter your choice: 2
Enter employee ID to search: E101
Employee found:
Name: Ahmed Ali
Commission: AED 5000.0

Choose an option:
1. Add new employee
2. Search for employee
3. Exit
Enter your choice: 3
Exiting program... 

📁 Project Files
  Main.java: The core logic and executable code.
  README.md: Project documentation and overview.
