# Snake and Ladder Game

A simple, interactive console-based Snake and Ladder game implemented in Java. This game allows multiple players to compete on a board filled with snakes and ladders. The first player to reach the end of the board wins the game.

---

## Table of Contents
- [Features](#features)
- [Rules](#rules)
- [How It Works](#how-it-works)
- [Setup and Installation](#setup-and-installation)
- [Code Structure](#code-structure)

---

## Features
- **Customizable Board Size**: Define the number of cells on the board.
- **Dynamic Player Count**: Add as many players as desired.
- **Configurable Snakes and Ladders**: Set custom positions for snakes and ladders.
- **Real Dice Simulation**: Rolls a die (single or multiple) to simulate gameplay.
- **Turn-Based Logic**: Players take turns rolling the dice until one reaches the goal.
- **Random Gameplay**: Dice rolls and player movements are random to ensure an unpredictable game flow.

---

## Rules
1. The game is played on a board numbered from `1` to `N` (default is 100).
2. Players start at position `0`.
3. Players roll the dice and move forward by the number rolled.
4. If a player lands at the start of a ladder, they climb to the end of the ladder.
5. If a player lands at the head of a snake, they slide down to the tail of the snake.
6. The first player to reach or exceed the last cell wins.

---

## How It Works
The game operates as follows:
1. Players are added to a queue, which dictates their turn order.
2. Each player rolls a dice during their turn and moves their token forward.
3. The board determines if the new position contains a snake or ladder and updates the player’s position accordingly.
4. The game continues until a player reaches the goal.

---

## Setup and Installation
### Prerequisites
- Java Development Kit (JDK) installed (version 8 or higher).
- A text editor or IDE (e.g., IntelliJ IDEA, Eclipse, or Visual Studio Code).

### Steps to Run
1. Clone or download the repository.
   ```bash
   git clone <repository-url>
   ```
2. Navigate to the project directory.
3. Compile the Java files:
   ```bash
   javac *.java
   ```
4. Run the `Main` class:
   ```bash
   java Main
   ```

---

## Code Structure
- **`Main`**: Entry point of the program.
- **`Game`**: Handles the game logic, including turns, dice rolls, and player management.
- **`Board`**: Represents the game board and manages snakes and ladders.
- **`Player`**: Represents individual players and their positions.
- **`Snake`**: Represents a snake with a start (head) and end (tail).
- **`Ladder`**: Represents a ladder with a start (bottom) and end (top).
- **`Dice`**: Simulates dice rolls.

