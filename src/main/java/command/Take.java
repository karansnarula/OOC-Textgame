package command;

import Game.*;

public class Take implements Command{
    public static void takeItem(Hero hero, int itemNumber, Items item){
        hero.addItem(itemNumber,item);
    }

    public void execute() {
        if(Game.getMapLevel()[Game.getHero().getRow()][Game.getHero().getColumn()] == 2 && Game.getHero().ListItems.containsKey(2) == false){
            Game.createWeapon(Game.getLevel());
            Take.takeItem(Game.getHero(),2,Game.getWeapon());
            System.out.println("You have now taken the item!");
            Game.getMapLevel()[Game.getHero().getRow()][Game.getHero().getColumn()] = 1;
            Game.getHero().takeUpdate("weapon");
        }
        else if(Game.getMapLevel()[Game.getHero().getRow()][Game.getHero().getColumn()] == 6 && Game.getHero().ListItems.containsKey(6) == false){
            Take.takeItem(Game.getHero(),6,new Shield());
            System.out.println("You have now taken the item!");
            Game.getMapLevel()[Game.getHero().getRow()][Game.getHero().getColumn()] = 1;
            Game.getHero().takeUpdate("shield");
        }
        else if(Game.getMapLevel()[Game.getHero().getRow()][Game.getHero().getColumn()] == 7 && Game.getHero().ListItems.containsKey(7) == false){
            Take.takeItem(Game.getHero(),7,new Armor());
            System.out.println("You have now taken the item!");
            Game.getMapLevel()[Game.getHero().getRow()][Game.getHero().getColumn()] = 1;
            Game.getHero().takeUpdate("armor");
        }else {
            System.out.println("There is nothing to take!");
        }
    }
}
