public interface Creature {
    public boolean isAlive(int life);
    public void showStatus();
    public void attack(Creature target);
    public String getName();
    public int getHP();
    public void setHP(int hp);

}
