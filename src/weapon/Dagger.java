package weapon;

public class Dagger extends Weapon{
    public Dagger() {
        super("短剣",6);
    }

    @Override
    public String attackMessage() {
        return ("で素早く切りつけた！");
    }
}
