public class Goblin extends Monster{
    public Goblin(int hp,char suffix,String name) {
        super(name,hp,suffix);
    }

    public void attack(Creature target) {
        System.out.println(this.getName() +this.getSuffix()+ "はナイフで切りつけた！" + target.getName()+"に８のダメージを与えた！");
        target.setHP(target.getHP()-8);
    }
}
