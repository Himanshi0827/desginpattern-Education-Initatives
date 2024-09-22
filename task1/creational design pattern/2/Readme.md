# RPGGame

## Project Overview
The **RPGGame** project simulates an RPG character creation system, where characters evolve dynamically based on the player’s in-game achievements. The system uses the Builder Pattern to allow modular character creation, and the characters' attributes can change based on game progress.

## Features
- **Dynamic Character Creation:** Build customizable RPG characters with attributes such as skills, weapons, and abilities.
- **Achievement-Based Evolution:** Characters evolve dynamically when the player achieves certain in-game milestones.
- **Modular Attribute Management:** Add or modify character attributes based on game progress.

## Design Patterns
- **Builder Pattern:** Used to create customizable characters with different attributes.
- **Observer Pattern:** Updates character attributes dynamically based on achievements.
- **Singleton Pattern (Optional):** Could be used for managing the game state or achievements globally.

## How to Run
1. Compile the Java code:
    ```bash
    javac RPGGame.java
    ```
2. Run the application:
    ```bash
    java RPGGame
    ```

## Key Components
- **Character:** Represents an RPG character with customizable attributes (skills, weapons, health).
- **DynamicCharacterBuilder:** Builds and updates character attributes based on achievements.
- **AchievementSystem:** Tracks achievements and triggers character updates.
- **GameManager (Optional):** Manages the overall game state and progression.
