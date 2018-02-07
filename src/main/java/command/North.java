package command;

import Game.Game;
import Game.Hero;

public class North implements Command {

    public static void goNorth(Hero hero){
        hero.setRow(hero.getRow() - 1);
    }

    public void execute() {
        if(Game.getHero().getRow() > 0 && Game.getMapLevel()[Game.getHero().getRow() - 1][Game.getHero().getColumn()] != 0){
            goNorth(Game.getHero());
            RoomDescriptor.showRoomDescriptor(Game.getMapLevel()[Game.getHero().getRow()][Game.getHero().getColumn()]);
        }else{
            System.out.println("You can't go north!");
        }
    }
}
