package command;

import Game.Game;

public class DropShield implements Command {
    @Override
    public void execute() {
        if(Game.getHero().ListItems.containsKey(6) == true){
            Drop.dropItem(Game.getHero(),"shield");
            System.out.println("Item dropped!");
        }
        else{
            System.out.println("There is nothing to drop!");
        }
    }
}
