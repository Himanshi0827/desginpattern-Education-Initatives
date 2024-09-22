class EventSystem {
    // Handles event and updates the builder
    public static void triggerAchievement(DynamicCharacterBuilder builder, String achievement) {
        builder.unlockAchievement(achievement);
    }
}
