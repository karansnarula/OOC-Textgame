package command;

import Game.Boss;
import Game.Game;

public class AttackBoss implements Command {
    public void execute() {
        Boss.life -= Game.getHero().getStrength();
        System.out.println("You attacked the boss!");
        if(Boss.life > 0){
            Game.getHero().setCurrentLife(Game.getHero().getCurrentLife() - Boss.attack);
            System.out.println("Boss retaliated!");
        }else{
            System.out.println("Hooray the boss is dead!");
            System.out.println("Congratulation! You have finished the game!");
            Game.gameQuit();
        }
    }
}
