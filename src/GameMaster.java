import creature.Creature;
import creature.character.Hero;
import creature.character.SuperHero;
import creature.character.Thief;
import creature.character.Wizard;
import creature.Character;
import creature.Monster;
import creature.monster.Goblin;
import creature.monster.Matango;
import creature.monster.Slime;
import weapon.Dagger;
import weapon.Sword;
import weapon.Wand;
import weapon.Weapon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class GameMaster {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int goblincnt=0;
        int matangocnt=0;
        int slimecnt=0;
        Weapon sword=new Sword();
        Weapon wand=new Wand();
        Weapon dagger=new Dagger();
        Hero hero=new Hero("勇者",sword,100);
        Wizard wizard=new Wizard("魔法使い",wand,50,30);
        Thief thief=new Thief("盗賊",dagger,70);
        Random random=new Random();

        Goblin goblin=new Goblin(50,'A',"ゴブリン");
        Matango matango=new Matango(45,'A',"おばけきのこ");
        Slime slime=new Slime(40,'A',"スライム");

        ArrayList<Monster> monsters=new ArrayList<>();
        for(int i=0;i<5;i++){
           int randomNum=random.nextInt(3);
           switch (randomNum){
               case 0:
                   monsters.add(goblin=new Goblin(50,(char)('A'+goblincnt),"ゴブリン"));
                   goblincnt++;
                   break;
               case 1:
                   monsters.add(matango=new Matango(45,(char) ('A'+matangocnt),"おばけきのこ"));
                   matangocnt++;
                   break;
               case 2:
                   monsters.add(slime=new Slime(40,(char)('A'+slimecnt),"スライム"));
                   slimecnt++;
                   break;
           }
        }

        ArrayList<creature.Character> party=new ArrayList<>();
        party.add(hero);
        party.add(wizard);
        party.add(thief);

        Iterator<Monster> iters=monsters.iterator();
        Iterator<Character> itty= party.iterator();

        System.out.println("---味方パーティ---");
        for(creature.Character character:party){
           character.showStatus();
        }
        System.out.println("---敵グループ---");
        for(Monster monster:monsters){
            monster.showStatus();
        }

        System.out.println("\n"+"味方の総攻撃！");
        while(itty.hasNext()){
            for(Character character:party) {
                for (int i = 0; i < monsters.size(); i++) {
                    System.out.println(i + ">" + monsters.get(i).getName() + monsters.get(i).getSuffix());
                }
                int mon=scanner.nextInt();
                int tec=scanner.nextInt();

                switch (tec) {
                    case 1:
                        if (character instanceof Hero) {
                            character.attack(monsters.get(mon));
                            break;
                        } else if (character instanceof Wizard) {
                            character.attack(monsters.get(mon));
                            break;
                        } else if (character instanceof Thief) {
                            character.attack(monsters.get(mon));
                            break;
                        }
                    case 2:
                        if (character instanceof Hero) {
                            System.out.println("\n" + "ダメージを受けた勇者が突然光りだした！");
                            SuperHero superHero = new SuperHero(hero);
                            System.out.println("勇者はスーパーヒーローに進化した！");
                            if (superHero.getHP() == 0) {
                                superHero.die();
                                party.remove(hero);
                                break;
                            } else {
                                party.set(0, superHero);
                                break;
                            }
                        } else if (character instanceof Wizard) {
                            ((Wizard) character).magic(monsters.get(mon));
                            break;
                        } else if (character instanceof Thief) {
                            ((Thief) character).guard();
                            break;
                        }
                }
                if(monsters.get(mon).getHP()==0){
                    monsters.get(mon).die();
                    monsters.remove(mon);
                } else if (monsters.get(mon).getHP()==0) {
                    monsters.get(mon).run();
                    monsters.remove(mon);
                }
            }
        }
//        if (((Monster)iters).getHP()== 0) {
//            ((Monster)iters).die();
//            iters.remove();
//        } else if (((Monster)iters).getHP() <= 5) {
//            ((Monster)iters).run();
//            iters.remove();
//        }

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
