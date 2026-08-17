public class Quest {
    private final String title;
    private final int requiredLevel;
    private final int rewardExperience;
    private boolean completed;
    private Adventurer assignedAdventurer;

    public Quest (String title, int requiredLevel, int rewardExperience) {
        this.title = title;
        this.requiredLevel = requiredLevel;
        this.rewardExperience = rewardExperience;
    }

    void showInformation() {
        System.out.println("Mission : " + this.title);
        System.out.println("Niveau requis : " + this.requiredLevel);
        System.out.println("Récompense : " + this.rewardExperience + "XP");
        System.out.println("Terminée : " + this.completed);
    }

    void assignQuest(Adventurer adventurer) {
        if (this.assignedAdventurer != null) {
            System.out.println("Quête déjà assigné");
        }
        this.assignedAdventurer = adventurer;
    }

    void completeQuest(Adventurer adventurer) {
        if (adventurer.getLevel() < this.requiredLevel) {
            System.out.println("Niveau trop faible");
            return;
        }
        if (this.completed) {
            System.out.println("Quête déjà réussie");
            return;
        }
        this.completed = true;
        adventurer.gainExperience(this.rewardExperience);
    }
}
