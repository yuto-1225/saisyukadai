public abstract class Character implements Creature {
     private String name;
     private int hp;

    public Character(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public boolean isAlive(){
        return this.getHP() > 0;
    }

    public void showStatus() {
        System.out.println(this.getName()+":HP"+this.getHP());
    }

    public String getName(){
        return this.name;
    }
    @Override
    public int getHP() {
        return this.hp;
    }

    public void setName(String sName){
        this.name = sName;
    }

    public void setHP(int sHP){
        this.hp = Math.max(sHP, 0);
    }
}
