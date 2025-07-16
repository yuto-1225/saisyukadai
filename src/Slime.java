public  final class Slime extends Monster {
    public Slime(int hp,char suffix,String name){
        super(hp,suffix);
        setName(name);
    }

    @Override
    public void showStatus() {
        System.out.println(this.getName()+this.getSuffix()+":HP"+this.getHP());
    }

    public void attack(Creature target){
        System.out.println(this.getName()+this.getSuffix() + "は体当たり攻撃！" + target.getName()+"に5のダメージを与えた！");
        target.setHP(target.getHP()-5);
    }
}
