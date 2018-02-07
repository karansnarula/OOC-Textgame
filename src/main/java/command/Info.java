
package command;


import Game.*;

public class Info implements Command {
    public void printInfo(int level ,Map map ,Hero hero){
        System.out.println("Current Level: " + level);
        System.out.println("Hero Statistics -----> Current Life: "+hero.getCurrentLife()+" Strength: "+hero.getStrength() + " Number of items equipped: "+hero.ListItems.size());
        if(hero.ListItems.size() > 0){
            System.out.println("List of items equipped: ");
            if(hero.ListItems.containsKey(2)){
                System.out.print("      Weapon Hitpoints: " + hero.ListItems.get(2).getHitPoints());
            }
            if(hero.ListItems.containsKey(6)){
                System.out.print("      Shield Hitpoints: " + hero.ListItems.get(6).getHitPoints());
            }
            if(hero.ListItems.containsKey(7)){
                System.out.print("      Armor Hitpoints: " + hero.ListItems.get(7).getHitPoints());
            }
            System.out.println();
        }
        System.out.println("Item Statistics -----> Number of items in this level: "+map.getGetNumberOfItems(level));
        System.out.println("Monster Statistics -----> Number of Monsters in this level: "+map.getNumberOfMonsters(level)+" Life: "+map.getMonsterLife()+" Attack Power: "+map.getMonsterAttack());
        if(level == 3){
            System.out.println("BE CAREFUL! There is a suicide monster and the BOSS in this final level!");
        }
    }

    public void execute() {
        printInfo(Game.getLevel(),Game.getMap(),Game.getHero());
    }
}
