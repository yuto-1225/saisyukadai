package creature;

import weapon.Weapon;

public abstract class Character implements Creature {
    private String name;
    private int hp;
    private Weapon weapon;

    public Character(String name, int hp,Weapon weapon) {
        this.setName(name);
        this.setHP(hp);
        this.setWeapon(weapon);
    }
    public void die(){
        System.out.println(this.getName()+"は死んでしまった！");
    }
    @Override
    public boolean isAlive(){
        return this.getHP() > 0;
    }
    @Override
    public void showStatus() {
        System.out.println(this.getName()+":HP"+this.getHP());
    }

    @Override
    public String getName(){
        return this.name;
    }
    @Override
    public int getHP() {
        return this.hp;
    }
    public Weapon getWeapon(){return this.weapon;}


    public void setName(String sName){
        this.name = sName;
    }
    @Override
    public void setHP(int sHP){
        this.hp = Math.max(sHP, 0);
    }
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
