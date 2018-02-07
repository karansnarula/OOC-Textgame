package command;

import Game.Game;

public class CommandFactory {
    Info info = new Info();
    North north = new North();
    South south = new South();
    East east = new East();
    West west = new West();
    Attack attack = new Attack();
    AttackBoss attackBoss = new AttackBoss();
    DropShield dropShield = new DropShield();
    DropWeapon dropWeapon = new DropWeapon();
    DropArmor dropArmor = new DropArmor();
    Take take = new Take();
    Help help = new Help();
    public void initiateCommand(String commandString){
        if(commandString.equals("info")){
            info.execute();
        }
        else if(commandString.equals("north")){
            north.execute();
        }
        else if(commandString.equals("south")){
            south.execute();
        }
        else if(commandString.equals("east")){
            east.execute();
        }
        else if(commandString.equals("west")){
            west.execute();
        }
        else if(commandString.equals("attack") && Game.getMapLevel()[Game.getHero().getRow()][Game.getHero().getColumn()] == 3 && Game.getMonster() != null){
            attack.execute();
        }
        else if(commandString.equals("attack") && Game.getMapLevel()[Game.getHero().getRow()][Game.getHero().getColumn()] == 9){
            attackBoss.execute();
        }
        else if(commandString.equals("take")){
            take.execute();
        }
        else if(commandString.equals("dropWeapon")){
            dropWeapon.execute();
        }
        else if(commandString.equals("dropShield")){
            dropShield.execute();
        }
        else if(commandString.equals("dropArmor")){
            dropArmor.execute();
        }
        else if(commandString.equals("help")){
            help.execute();
        }
        else if(commandString.equals("quit")){
            Game.gameQuit();
        }else{
            System.out.println("Invalid command entered!");
        }
    }
}
