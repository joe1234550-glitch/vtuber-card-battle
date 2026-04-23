public class VTuberCard extends Card {
    private int attack;
    private int health;

    public VTuberCard(String name, int manaCost, String faction, int attack, int health) {
        super(name, manaCost, faction);
        this.attack = attack;
        this.health = health;
    }

    @Override
    public String display() {
        return String.format("[%s] 💰%d ATK:%d HP:%d", getName(), getManaCost(), attack, health);
    }
}
