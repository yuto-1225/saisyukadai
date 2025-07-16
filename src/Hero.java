public class Hero extends Character {
    private String weapon;

    public Hero(String name,String weapon,int hp) {
        super(name,hp);
        this.weapon=weapon;
    }

    public void attack(Creature target) {
        System.out.println(this.getName() + " は " +getWeapon()+"で、攻撃！"+target.getName()+"に10のダメージを与えた！");
        target.setHP(target.getHP()-10);
    }

    public String getWeapon(){
        return this.weapon;
    }
    public void setWeapon(String sweapon){
        this.weapon=sweapon;
    }
}
