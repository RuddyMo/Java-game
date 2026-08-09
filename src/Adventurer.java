public class Adventurer {
    private final String name;
    private int level;
    private int experience;

    public Adventurer(String name, int level, int experience) {
        this.name = name;
        this.level = level;
        this.experience = experience;
    }

    public int getLevel() {
        return this.level;
    }

    void showInformation() {
        System.out.println(this.name + " est niveau " + this.level + " avec " + this.experience + " points d'expérience. ");
    }

    void gainExperience(int amount) {
        this.experience += amount;

        while (this.experience >= 100) {
            this.level++;
            System.out.println(this.name + " passe au niveau " + this.level);
            this.experience -= 100;
        }
    }
}
