public class SupportCard extends Card {
    private int attackBonus;
    private int healthBonus;

    public SupportCard(String name, int manaCost, String faction, int attackBonus, int healthBonus) {
        super(name, manaCost, faction);
        this.attackBonus = attackBonus;
        this.healthBonus = healthBonus;
    }

    @Override
    public String display() {
        return String.format("[%s] 💰%d +%d ATK / +%d HP", getName(), getManaCost(), attackBonus, healthBonus);
    }
}

