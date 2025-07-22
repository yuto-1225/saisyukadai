package weapon;

public abstract class Weapon {
    private String name;
    private int damage;
    private int cost=0;

    public Weapon(String name, int damage) {
        this.setName(name);
        this.setDamage(damage);
    }

    public abstract void attackMessage();

    public String getName() {
        return this.name;
    }
    public int  getDamage() {
        return this.damage;
    }
    public int getCost() {
        return this.cost;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
}
