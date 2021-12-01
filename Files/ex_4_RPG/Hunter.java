package Files.ex_4_RPG;

public class Hunter extends Player {

    public Hunter() {
        super();
    }

    public Hunter(String name) {
        super(name);
    }

    @Override
    public int physicalProtection() {
        return super.physicalProtection();
    }

    @Override
    public int magicProtection() {
        return super.magicProtection();
    }

    public Hunter(String name, int level) {
        super(name, level);
    }

    public Hunter(String name, int level, int health, int damage, double physicalProtection, double magicProtection) {
        super(name, level, health, damage, physicalProtection, magicProtection);
    }

    @Override
    public int getDamage() {
        return super.getDamage();
    }

    @Override
    public int getLevel() {
        return super.getLevel();
    }

    @Override
    public double getMagicProtection() {
        return super.getMagicProtection();
    }

    @Override
    public int getHealth() {
        return super.getHealth();
    }

    @Override
    public void updateLevel() {
        super.updateLevel();
    }

    @Override
    public double getPhysicalProtection() {
        return super.getPhysicalProtection();
    }

    @Override
    public void basicAttack(Player player) {
        super.basicAttack(player);
    }

        @Override
    public void specialAttack(Player player) {
        System.out.println(player.getHealth() - (super.getDamage() + 20));
    }
}
