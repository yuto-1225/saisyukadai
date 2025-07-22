package creature.character;

import creature.Creature;
import creature.Character;

public class Wizard extends Character {
    private int mp;

    public Wizard(String name,int hp,int mp) {
        super(name,hp);
        this.mp=mp;
    }


    @Override
    public void attack(Creature target) {
        System.out.println(this.getName() + " は火の玉をとなえた！ " + target.getName()+"に3のダメージを与えた！");
        target.setHP(target.getHP()-3);
    }
}
