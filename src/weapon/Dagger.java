package weapon;

public class Dagger extends Weapon{
    public Dagger() {
        super("短剣",6);
    }

    @Override
    public void attackMessage() {
        System.out.println("で素早く切りつけた！");
    }
}
