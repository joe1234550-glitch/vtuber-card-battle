public abstract class Card {
    private String name;
    private int manaCost;
    private String faction;

    public Card(String name, int manaCost, String faction) {
        this.name = name;
        this.manaCost = manaCost;
        this.faction = faction;
    }

    public abstract String display();

    // Getters
    public String getName() { return name; }
    public int getManaCost() { return manaCost; }
    public String getFaction() { return faction; }
}