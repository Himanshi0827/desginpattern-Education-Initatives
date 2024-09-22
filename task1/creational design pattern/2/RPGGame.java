public class RPGGame {
    public static void main(String[] args) {
        // Create a DynamicCharacterBuilder for a new player
        DynamicCharacterBuilder builder = new DynamicCharacterBuilder("Archer");

        // Achievement system
        AchievementSystem achievementSystem = new AchievementSystem();

        // Simulate player achievements
        achievementSystem.unlockAchievement("FirstBlood", builder);
        achievementSystem.unlockAchievement("MonsterHunter", builder);
        achievementSystem.unlockAchievement("LevelUp", builder);

        // Retrieve and display character status
        Character character = builder.getCharacter();
        System.out.println(character.getStatus());
    }
}
