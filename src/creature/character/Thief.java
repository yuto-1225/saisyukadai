package creature.character;

import creature.Creature;
import creature.Character;

public class Thief extends Character {
    public Thief(String name, int hp) {
        super(name, hp);
    }

    @Override
    public void attack(Creature target) {
        System.out.println(this.getName() + " は素早く攻撃した！ " + target.getName()+"に5のダメージを与えた！");
        target.setHP(target.getHP()-5);
    }
}
