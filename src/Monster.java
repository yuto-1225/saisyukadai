public abstract class Monster implements Creature{
    private String name;
    private int hp;
    private char suffix;

    public Monster(int hp, char suffix) {
        this.hp = hp;
        this.suffix = suffix;
    }
    public boolean isAlive(int life){
        if(life>0) {
            return true;
        }else{
            return false;
        }
    }
    public void showStats() {}
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
        if(sHP > 0){
            this.hp = sHP;
        }else{
            this.hp = 0;
        }
    }
    public void setSuffix(char sSuffix) {
        this.suffix = sSuffix;
    }

}
