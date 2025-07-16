public class Thief extends Character {
    public Thief(String name, int hp) {
        super(name, hp);
    }

    public void attack(Creature target) {
        System.out.println(this.getName() + " は素早く攻撃した！ " + target.getName()+"に5のダメージを与えた！");
        target.setHP(target.getHP()-5);
    }
}
