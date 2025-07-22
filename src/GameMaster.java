import creature.character.Hero;
import creature.character.SuperHero;
import creature.character.Thief;
import creature.character.Wizard;
import creature.Character;
import creature.Monster;
import creature.monster.Goblin;
import creature.monster.Matango;
import creature.monster.Slime;

import java.util.ArrayList;

public class GameMaster {
    public static void main(String[] args) {
        Hero hero=new Hero("勇者","剣",100);
        Wizard wizard=new Wizard("魔法使い",60,50);
        Thief thief=new Thief("盗賊",70);

        Goblin goblin=new Goblin(50,'A',"ゴブリン");
        Matango matango=new Matango(45,'A',"マタンゴ");
        Slime slime=new Slime(40,'A',"スライム");

        ArrayList<creature.Character> party=new ArrayList<>();
        party.add(hero);
        party.add(wizard);
        party.add(thief);

        ArrayList<Monster> monsters=new ArrayList<>();
        monsters.add(goblin);
        monsters.add(matango);
        monsters.add(slime);

        System.out.println("---味方パーティ---");
        for(creature.Character character:party){
           character.showStatus();
        }
        System.out.println("---敵グループ---");
        for(Monster monster:monsters){
            monster.showStatus();
        }

        System.out.println("\n"+"味方の総攻撃！");
        for(creature.Character character:party){
            for(Monster monster:monsters){
                character.attack(monster);
            }
        }

        System.out.println("\n"+"敵の総攻撃！");
        for(Monster monster:monsters){
            for(creature.Character character:party){
                monster.attack(character);
            }
        }

        System.out.println("\n"+"ダメージを受けた勇者が突然光りだした！");
        SuperHero superHero=new SuperHero(hero);
        System.out.println("勇者はスーパーヒーローに進化した！");
        party.set(0,superHero);
        for(Monster monster:monsters){
            party.get(0).attack(monster);
        }

        System.out.println("\n"+"---味方パーティ最終ステータス---");
        for(Character character:party){
            character.showStatus();
            if(character.isAlive()){
                System.out.println("生存状況：生存");
            }else{
                System.out.println("生存状況：死亡");
            }
        }
        System.out.println("\n"+"---敵グループ最終ステータス---");
        for(Monster monster:monsters){
            monster.showStatus();
            if(monster.isAlive()){
                System.out.println("生存状況：生存");
            }else{
                System.out.println("生存状況：討伐済み");
            }
        }
    }
}
