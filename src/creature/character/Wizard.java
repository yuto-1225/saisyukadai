package creature.character;

import creature.Creature;
import creature.Character;
import weapon.Weapon;

public class Wizard extends Character {
    private int mp;

    public Wizard(String name, Weapon weapon, int hp, int mp) {
        super(name,hp,weapon);
        this.mp=mp;
    }

    public void magic(Creature target){
        if(this.getMp()!=0) {
            this.setMp(this.getMp() - this.getWeapon().getCost());
            System.out.println(this.getName() +"は"+this.getWeapon().getName()+this.getWeapon().attackMessage()+ target.getName()+"に3のダメージを与えた！");
            target.setHP(this.getWeapon().getDamage());
        }else{
            System.out.println("MPが足りない！");
        }
    }
    @Override
    public void attack(Creature target) {
        System.out.println(this.getName() + "は石を投げた！" + target.getName()+"に3のダメージを与えた！");
        target.setHP(target.getHP()-3);
    }
    @Override
    public void showStatus() {
        System.out.println(this.getName()+":HP "+this.getHP()+" MP: "+this.getMp());
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }
}
