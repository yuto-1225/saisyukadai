package creature.character;

import creature.Creature;
import creature.Character;
import weapon.Weapon;

public class Thief extends Character {
    private boolean guard;
    public Thief(String name, Weapon weapon,int hp) {
        super(name, hp,weapon);
    }

    @Override
    public void attack(Creature target) {
        System.out.println(this.getName() +this.getWeapon().attackMessage()+ target.getName()+"に"+this.getWeapon().getDamage()*2+"のダメージを与えた！");
        target.setHP(target.getHP()-this.getWeapon().getDamage()*2);
    }
    public void guard(){
        this.setGuard(true);
    }


    public boolean getGuard(){
        return this.guard;
    }

    public void setGuard(boolean guard){
        this.guard=guard;
    }
    public void setHP(){
        if(this.getGuard()) {
            this.setGuard(false);
            System.out.println("しかし"+this.getName()+"は攻撃を回避し、ダメージが入らなかった！");
        }else {
            this.setHP(this.getHP());
        }
    }
}
