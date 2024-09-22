import java.util.List;
import java.util.ArrayList;

class AchievementSystem {
    private List<String> achievements;

    public AchievementSystem() {
        this.achievements = new ArrayList<>();
    }

    // Add achievement and trigger event
    public void unlockAchievement(String achievement, DynamicCharacterBuilder builder) {
        if (!achievements.contains(achievement)) {
            achievements.add(achievement);
            EventSystem.triggerAchievement(builder, achievement);
        }
    }
}
