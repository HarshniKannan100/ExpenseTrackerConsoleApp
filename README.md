# 💸 Expense Tracker Console Application (Java)

A simple Java console-based application to track your expenses. It allows users to add, view, delete expenses, and calculate total spending — all through a clean terminal interface with colorful output.

## 🚀 Features

- Add new expenses with amount, category, date, and description
- View all recorded expenses in a table format
- Delete a specific expense by index
- Calculate and display total spending
- Colored console output for better readability

## 🛠 Technologies Used

- Java (Standard Edition)
- VS Code (Visual Studio Code)
- ANSI escape codes for color formatting in terminal

## 📁 Folder Structure

ExpenseTrackerApp/
├── Expense.java # Expense model class
├── ExpenseTracker.java # Main logic and user interface
└── README.md # This file


> This is a standalone Java console application — no external libraries or frameworks required.

## 🧪 How to Run

### ✅ Prerequisites
- Java JDK installed ([Download here](https://www.oracle.com/java/technologies/javase-downloads.html))
- Git (optional, for cloning)

### 💻 Steps
1. Clone the repo or download the files
2. Open the folder in **VS Code**
3. Open terminal and run:
   ```bash
   javac Expense.java ExpenseTracker.java
   java ExpenseTracker

=============================
    EXPENSE TRACKER MENU
=============================
1. Add Expense
2. View Expenses
3. Delete Expense
4. Total Spending
5. Exit
=============================
Enter your choice:

