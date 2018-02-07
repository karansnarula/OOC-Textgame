package command;

import Game.Game;
import Game.Hero;

public class South implements Command {
    public static void goSouth(Hero hero){
        hero.setRow(hero.getRow() + 1);
    }

    public void execute() {
        if(Game.getHero().getRow() < Game.getMapLevel().length && Game.getMapLevel()[Game.getHero().getRow() + 1][Game.getHero().getColumn()] != 0){
            goSouth(Game.getHero());
            RoomDescriptor.showRoomDescriptor(Game.getMapLevel()[Game.getHero().getRow()][Game.getHero().getColumn()]);
            if(Game.getMapLevel()[Game.getHero().getRow()][Game.getHero().getColumn()] == 4 && Game.getMap().getNumberOfMonsters(Game.getLevel()) <= 0){ // Entering new level
                System.out.println("You are in a new level now!");
                Game.setLevel(Game.getLevel() + 1);
                Game.setMapLevel();
                Game.getHero().setColumn(0);
                Game.getHero().setRow(0);
            }else{
                if(Game.getMapLevel()[Game.getHero().getRow()][Game.getHero().getColumn()] == 4){
                    System.out.println("You must kill all the monsters first!");
                }
            }
        }else{
            System.out.println("You can't go south!");
        }
    }
}
