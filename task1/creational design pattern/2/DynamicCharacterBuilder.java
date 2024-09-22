class DynamicCharacterBuilder {
    private Character character;

    public DynamicCharacterBuilder(String characterName) {
        this.character = new Character(characterName);
    }

    // Method to handle achievement unlocking
    public void unlockAchievement(String achievement) {
        switch (achievement) {
            case "FirstBlood":
                character.addSkill("Basic Swordsmanship");
                character.addGear("Iron Sword");
                break;
            case "MonsterHunter":
                character.addSpecialAbility("Stealth Kill");
                break;
            case "TreasureHunter":
                character.addGear("Golden Armor");
                break;
            case "LevelUp":
                character.levelUp();
                break;
            // Add more achievements and their effects
        }
    }

    // Retrieve the character being built
    public Character getCharacter() {
        return character;
    }
}
