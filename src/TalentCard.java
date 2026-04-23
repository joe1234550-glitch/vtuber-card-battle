public class TalentCard extends Card {
    private String effectType;
    private int effectValue;

    public TalentCard(String name, int manaCost, String faction, String effectType, int effectValue) {
        super(name, manaCost, faction);
        this.effectType = effectType;
        this.effectValue = effectValue;
    }

    @Override
    public String display() {
        return String.format("[%s] 💰%d 效果:%s 數值:%d", getName(), getManaCost(), effectType, effectValue);
    }
}

