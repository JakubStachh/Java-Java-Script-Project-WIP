# 🎮 Tic Tac Toe Game

## 📜 Overview
Tic Tac Toe is a simple two-player game where players take turns marking spaces on a 3x3 grid with either 'X' or 'O'. The game ends when a player has three of their marks in a row, column, or diagonal, or if the grid is filled without a winner, resulting in a draw.

This Java-based program lets two players take turns playing Tic Tac Toe in the console. It checks for valid moves, detects wins, and switches players.

---

## ✨ Features

- **🏁 Start the Game**: The game initializes a 3x3 grid.
- **📝 Player Move**: Players can input their moves (row and column) for placing either 'X' or 'O'.
- **🏆 Winner Check**: After every move, the game checks for a winner.
- **🤝 Player Switching**: After each move, the game switches between player 'X' and player 'O'.
- **🔁 Draw Detection**: If the board is full and no winner is found, the game announces a draw.
- **💻 Console Interface**: The game runs in the console, allowing players to enter their moves directly.

---

## ⚙️ How It Works

The game consists of the following main components:

1. **Game Board**:
   A 3x3 grid represented by a 2D array where each cell can either be empty ('-'), marked with 'X', or marked with 'O'.

2. **Player Move**:
   The game alternates between two players, allowing them to input their move in terms of row and column.

3. **Win Condition**:
   After each move, the game checks if the current player has won by having three of their marks in a row, column, or diagonal.

4. **Draw Detection**:
   If the board is full without a winner, the game announces a draw.

---

## 🛠 Components

### **TicTacToe.java**:
This is the main class that implements the game. It initializes the board, handles player moves, checks for win conditions, and switches players.

```java
import java.util.Scanner;

public class TicTacToe {
    private static char[][] board = new char[3][3];
    private static char currentPlayer = 'X';

    public static void main(String[] args) {
        initializeBoard();
        printBoard();

        while (true) {
            playerMove();
            printBoard();

            if (checkWin()) {
                System.out.println("Player " + currentPlayer + " wins!");
                break;
            }

            if (isBoardFull()) {
                System.out.println("It's a draw!");
                break;
            }

            switchPlayer();
        }
    }

    public static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    public static void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void playerMove() {
        Scanner sc = new Scanner(System.in);
        int row, col;

        while (true) {
            System.out.println("Player " + currentPlayer + ", enter row (0-2) and column (0-2): ");
            row = sc.nextInt();
            col = sc.nextInt();

            if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-') {
                board[row][col] = currentPlayer;
                break;
            } else {
                System.out.println("Invalid move, try again.");
            }
        }
    }

    public static void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    public static boolean checkWin() {
        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) ||
                    (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer)) {
                return true;
            }
        }

        // Check diagonals
        if ((board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) ||
                (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer)) {
            return true;
        }

        return false;
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
}
```

---
## 🏁 Running the Game
### Compile the Java file: 
First, compile the program using the following command:

```bash
javac TicTacToe.java
```
##
### Run the game: 
After compiling, you can run the program with the following command:

```bash
java TicTacToe
```

---
## ✨ Example of Game Play
### Start the Game:
```java
Player X, enter row (0-2) and column (0-2): 
0 0
```
##
### After Player X's move:
```diff
- - - 
- - - 
- - X 
```
##
### Player O's turn:
```java
Player O, enter row (0-2) and column (0-2): 
1 1
```
##
### After Player O's move:
```diff
- - - 
- O - 
- - X 
```
##
### The game will continue until one player wins or the game ends in a draw.

