package Files.ex_4_RPG;

public class Player implements Skills{
    private String name;
    private int level;
    private int health;
    private int damage;
    private double physicalProtection;
    private double magicProtection;

    public Player() {
    }

    public Player(String name) {
        this.name = name;
    }

    public Player(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public Player(String name, int level, int health, int damage, double physicalProtection, double magicProtection) {
        this(name, level);
        this.health = health;
        this.damage = damage;
        this.physicalProtection = physicalProtection;
        this.magicProtection = magicProtection;
    }

    public int physicalProtection() {
        return (int) (damage - (damage * physicalProtection / 100));
    }

    public int magicProtection() {
        return (int) (damage - (damage * magicProtection / 100));
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getHealth() {
        return (int) (50*level*1.5);
    }

    public int getDamage() {
        return (int) (10*level*1.2);
    }

    public double getPhysicalProtection() {
        return physicalProtection;
    }

    public double getMagicProtection() {
        return magicProtection;
    }

    @Override
    public void basicAttack(Player player) {
        System.out.println(player.health - this.getDamage());
    }

    @Override
    public void specialAttack(Player player) {
    }

    @Override
    public void updateLevel() {
        System.out.println("Congratulation your level up");
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", health=" + health +
                ", damage=" + damage +
                ", physicalProtection=" + physicalProtection +
                ", magicProtection=" + magicProtection +
                '}';
    }


}
