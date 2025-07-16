import java.util.ArrayList;

public class GameMaster {
    public static void main(String[] args) {
        Hero hero=new Hero("勇者","剣",100);
        Wizard wizard=new Wizard("魔法使い",60,50);
        Thief thief=new Thief("盗賊",70);

        Goblin goblin=new Goblin(50,'A',"ゴブリン");
        Matango matango=new Matango(45,'A',"マタンゴ");
        Slime slime=new Slime(40,'A',"スライム");

        ArrayList<Character> party=new ArrayList<>();
        party.add(hero);
        party.add(1,wizard);
        party.add(2,thief);

        ArrayList<Monster> monsters=new ArrayList<>();
        monsters.add(goblin);
        monsters.add(1,matango);
        monsters.add(2,slime);

        System.out.println("---味方パーティ---");
        for(Character character:party){
           character.showStatus();
        }
        System.out.println("---敵グループ---");
        for(Monster monster:monsters){
            monster.showStatus();
        }

        System.out.println("\n"+"味方の総攻撃！");
        for(int i=0;i<party.size();i++){
            for(int j=0;j<monsters.size();j++){
                party.get(i).attack(monsters.get(j));
            }
        }

        System.out.println("\n"+"敵の総攻撃！");
        for(int i=0;i<monsters.size();i++){
            for(int j=0;j<party.size();j++){
                monsters.get(i).attack(party.get(j));
            }
        }

        System.out.println("\n"+"ダメージを受けた勇者が突然光りだした！");
        SuperHero superHero=new SuperHero(hero);
        System.out.println("勇者はスーパーヒーローに進化した！");
        party.set(0,superHero);
        for(int i=0;i<monsters.size();i++){
            party.get(0).attack(monsters.get(i));
        }

        System.out.println("\n"+"---味方パーティ最終ステータス---");
        for(Character character:party){
            character.showStatus();
            if(character.isAlive(character.getHP())){
                System.out.println("生存状況：生存");
            }else{
                System.out.println("生存状況：死亡");
            }
        }
        System.out.println("\n"+"---敵グループ最終ステータス---");
        for(Monster monster:monsters){
            monster.showStatus();
            if(monster.isAlive(monster.getHP())){
                System.out.println("生存状況：生存");
            }else{
                System.out.println("生存状況：討伐済み");
            }
        }
    }
}
