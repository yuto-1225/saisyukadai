public class Matango extends Monster{
    public Matango(int hp,char suffix,String name){
        super(name,hp,suffix);
    }

    public void attack(Creature target){
        System.out.println(this.getName()+this.getSuffix()+ "は体当たり攻撃！" + target.getName()+"に6のダメージを与えた！");
        target.setHP(target.getHP()-6);
    }

}
