public class SuperHero extends Hero {
    public SuperHero(Hero hero) {
        super(hero.getName(),hero.getWeapon(),hero.getHP());

    }

    public void attack(Creature target){
        System.out.println(this.getName()+"は"+this.getWeapon()+"で攻撃！"+this.getHP()+target.getName()+target.getName()+"に25のダメージを与えた！");
        target.setHP(target.getHP()-25);
    }
}
