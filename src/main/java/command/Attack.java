package command;

import Game.Game;
import Game.Hero;
import Game.Monster;

public class Attack implements Command {
    public static void attackMonster(Hero hero, Monster monster){
        monster.setLife(monster.getLife() - hero.getStrength());
    }

    public void execute() {
        attackMonster(Game.getHero(),Game.getMonster());
        System.out.println("You attacked the monster!");
        if(Game.getMonster().getLife() > 0){
            Game.getHero().setCurrentLife(Game.getHero().getCurrentLife() - Game.getMonster().getAttack());
            System.out.println("Monster retaliated!");
        }else{
            System.out.println("Monster is dead!");
            Game.getMapLevel()[Game.getHero().getRow()][Game.getHero().getColumn()] = 1;
            Game.getMap().setNumberOfMonsters(Game.getMap().getNumberOfMonsters(Game.getLevel()) - 1);
            Game.nullMonster();
        }
    }
}
