package weapon;

public class Sword extends Weapon{
    public Sword() {
        super("剣",10);
    }

    @Override
    public void attackMessage(){
        System.out.println("で切りつけた！");
    }
}