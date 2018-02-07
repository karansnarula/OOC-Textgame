package command;

import Game.Game;
import Game.Hero;

public class West implements Command {
    public static void goWest(Hero hero){
        hero.setColumn(hero.getColumn() - 1);
    }

    public void execute() {
        if(Game.getHero().getColumn() > 0 && Game.getMapLevel()[Game.getHero().getRow()][Game.getHero().getColumn() - 1] != 0){
            West.goWest(Game.getHero());
            RoomDescriptor.showRoomDescriptor(Game.getMapLevel()[Game.getHero().getRow()][Game.getHero().getColumn()]);
        }else{
            System.out.println("You can't go west!");
        }
    }
}
