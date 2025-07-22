package creature.character;

import creature.Creature;

public class SuperHero extends Hero {
    public SuperHero(Hero hero) {
        super(hero.getName(),hero.getWeapon(),hero.getHP());
        this.setHP(this.getHP()-30);

    }

    @Override
    public void attack(Creature target){
        System.out.println(this.getName()+"は"+this.getWeapon().getName()+this.getWeapon().attackMessage()+target.getName()+"に"+this.getWeapon().getDamage()*2.5+"のダメージを与えた！");
        target.setHP((int) (target.getHP()-this.getWeapon().getDamage()*2.5));
    }
}
