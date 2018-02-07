package command;

import Game.Game;
import Game.Hero;

public class East implements Command {
    public static void goEast(Hero hero){
        hero.setColumn(hero.getColumn() + 1);
    }

    public void execute() {
        if(Game.getHero().getColumn() < Game.getMapLevel()[0].length && Game.getMapLevel()[Game.getHero().getRow()][Game.getHero().getColumn() + 1] != 0){
            East.goEast(Game.getHero());
            RoomDescriptor.showRoomDescriptor(Game.getMapLevel()[Game.getHero().getRow()][Game.getHero().getColumn()]);
        }else{
            System.out.println("You can't go east!");
        }
    }
}
