package creature.character;

import creature.Creature;

public class SuperHero extends Hero {
    public SuperHero(Hero hero) {
        super(hero.getName(),hero.getWeapon(),hero.getHP());

    }

    @Override
    public void attack(Creature target){
        System.out.println(this.getName()+"は"+this.getWeapon()+"で攻撃！"+target.getName()+"に25のダメージを与えた！");
        target.setHP(target.getHP()-25);
    }
}
