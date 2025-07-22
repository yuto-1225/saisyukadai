package weapon;

public class Wand extends Weapon{
    public Wand() {
        super("魔法の杖",15);
        this.setCost(15);
    }

    @Override
    public void attackMessage(){
        System.out.println("から魔法を放った！");
    }
}
