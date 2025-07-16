public abstract class Character implements Creature {
     private String name;
     private int hp;

    public Character(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public boolean isAlive(int life){
        if(life>0) {
            return true;
        }else{
            return false;
        }
    }

    public void showStatus() {
        System.out.println(this.name+":HP"+this.hp);
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

    public void setHP(int shp){
        this.hp = shp;
    }
}
