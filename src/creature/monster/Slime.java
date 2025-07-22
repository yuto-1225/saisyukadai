package creature.monster;

import creature.Creature;
import creature.Monster;

public  final class Slime extends Monster {
    public Slime(int hp,char suffix,String name){
        super(name,hp,suffix);
    }

    @Override
    public void attack(Creature target){
        System.out.println(this.getName()+this.getSuffix() + "は体当たり攻撃！" + target.getName()+"に5のダメージを与えた！");
        target.setHP(target.getHP()-5);
    }
}
