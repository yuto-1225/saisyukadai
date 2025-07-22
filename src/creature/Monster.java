package creature;

public abstract class Monster implements Creature {
    private String name;
    private int hp;
    private char suffix;

    public Monster(String name, int hp, char suffix) {
        this.setHP(hp);
        this.setSuffix(suffix);
        this.setName(name);
    }
    public void run(){
        System.out.println(this.getName()+this.getSuffix()+"は逃げ出した！");
    }
    public void die(){
        System.out.println(this.getName()+this.getSuffix()+"を倒した！");
    }
    public final boolean isAlive(){
        return this.getHP() > 0;
    }
    @Override
    public void showStatus() {
        System.out.println(this.getName()+this.getSuffix()+":HP "+this.getHP());
    }

    @Override
    public String getName(){
        return this.name;
    }
    @Override
    public int getHP() {
        return this.hp;
    }
    public char getSuffix(){
        return this.suffix;
    }

    public void setName(String sName){
        this.name = sName;
    }
    public void setHP(int sHP) {
        this.hp = Math.max(sHP, 0);
    }
    public void setSuffix(char sSuffix) {
        this.suffix = sSuffix;
    }

}
