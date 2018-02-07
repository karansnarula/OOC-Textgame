package command;

import Game.Hero;
import Game.Items;

public class Drop{
    public static void dropItem(Hero hero, String item){
        hero.removeItem(item);
    }
}