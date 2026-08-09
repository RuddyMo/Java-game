//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Adventurer adventurer = new Adventurer("Aragorn", 5, 80);
        Quest quest = new Quest("Tuer le dragon", 5, 50);

        adventurer.gainExperience(240);
        adventurer.showInformation();
        quest.showInformation();
        quest.completeQuest(adventurer);
        quest.completeQuest(adventurer);
        quest.showInformation();
        adventurer.showInformation();
    }
}