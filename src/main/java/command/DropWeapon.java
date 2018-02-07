package command;

import Game.Game;

public class DropWeapon implements Command {
    @Override
    public void execute() {
        if(Game.getHero().ListItems.containsKey(2) == true){
            Drop.dropItem(Game.getHero(),"weapon");
            System.out.println("Item dropped!");
        }
        else{
            System.out.println("There is nothing to drop!");
        }
    }
}
