package creature.character;

import creature.Creature;
import creature.Character;
import weapon.Weapon;

public class Hero extends Character {

    public Hero(String name, Weapon weapon, int hp) {
        super(name,hp,weapon);
    }

    @Override
    public void attack(Creature target) {
        System.out.println(this.getName() + "は" +this.getWeapon().getName()+this.getWeapon().attackMessage()+target.getName()+"に10のダメージを与えた！");
        target.setHP(target.getHP()-this.getWeapon().getDamage());
    }
}
