package command;

import Game.Game;

public class DropArmor implements Command{
    @Override
    public void execute() {
        if(Game.getHero().ListItems.containsKey(7) == true){
            Drop.dropItem(Game.getHero(),"armor");
            System.out.println("Item dropped!");
        }
        else{
            System.out.println("There is nothing to drop!");
        }
    }
}
