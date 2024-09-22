import java.util.List;
import java.util.ArrayList;

class Character {
    private String name;
    private int level;
    private List<String> skills;
    private List<String> gear;
    private List<String> specialAbilities;

    public Character(String name) {
        this.name = name;
        this.level = 1;
        this.skills = new ArrayList<>();
        this.gear = new ArrayList<>();
        this.specialAbilities = new ArrayList<>();
    }

    public void addSkill(String skill) {
        skills.add(skill);
    }

    public void addGear(String newGear) {
        gear.add(newGear);
    }

    public void addSpecialAbility(String ability) {
        specialAbilities.add(ability);
    }

    public void levelUp() {
        this.level++;
    }

    // Getters for status
    public String getStatus() {
        return "Character: " + name + "\nLevel: " + level + "\nSkills: " + skills + "\nGear: " + gear
                + "\nSpecial Abilities: " + specialAbilities;
    }
}
