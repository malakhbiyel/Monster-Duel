# 🎮 Monster Duel - Java Console Game

Welcome to **Monster Duel**, a Java-based console game designed as a turn-based battle between two players, each commanding a powerful monster. Only one player can emerge victorious—will it be you?

---

## 🌟 Project Overview

**Monster Duel** is a Java console application where two players face off to be the first to eliminate the opponent's monster. Each turn, players decide to attack or view game stats, leading to a dynamic and strategic showdown. This game is built as an educational project to reinforce basic Java concepts and to explore new programming techniques.

---

## 🕹️ Features

- **Turn-Based Gameplay**: Players take turns attacking each other's monster.
- **Unique Monsters**: Each monster has distinct stats—HP, attack power, and defense.
- **Victory Conditions**: The first player to bring their opponent's monster to zero HP wins!
- **User Input Options**: Players can choose to attack, view stats, or quit at any turn.

---

## 📖 Getting Started

### Prerequisites

- Java Development Kit (JDK) 17+
- An IDE, such as IntelliJ IDEA, is recommended but optional

### Installation

1. **Clone this repository**:
   ```bash
   git clone https://github.com/yourusername/monster-duel.git
   ```
2. **Navigate to the project directory**:
   ```bash
   cd monster-duel
   ```
3. **Compile the game**:
   ```bash
   javac src/MonsterDuel.java
   ```
4. **Run the game**:
   ```bash
   java src.MonsterDuel
   ```

---

## 🎲 Game Mechanics

1. **Model Creation**: Each player selects a monster, with attributes for HP, attack, and defense.
2. **Turn System**: Players alternate turns, choosing to either attack the opponent's monster or view stats.
3. **Win Condition**: The game ends when one player's monster’s HP reaches zero, declaring the other player as the victor.

---

## 🛠️ Project Structure

- **Model Classes**: Define the game’s data, such as `Joueur` (Player) and `Monstre` (Monster).
- **Game Controller**: Manages gameplay logic and turn progression.
- **View Class**: Handles user interface in the console for smooth game interaction.

---

## 🚀 Future Enhancements

- **Monster Variety**: Add new monsters with unique abilities.
- **Special Attacks**: Introduce a variety of attacks for more dynamic battles.
- **Graphical Interface**: Upgrade from console-based interaction to a GUI with Java Swing.

---

## 🤝 Contributions

Contributions are welcome! Feel free to submit issues, feature requests, or pull requests to help improve the game.

---

Enjoy the battle, and may your monster reign supreme! 🐲
