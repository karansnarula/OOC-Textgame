package command;

import Game.Game;

public class RoomDescriptor {
    public static void showRoomDescriptor(int room){
        if(room == 1){
            System.out.println("You are in a empty room!");
        }
        if(room == 2){
            System.out.println("There is a weapon in this room!");
            Game.createWeapon(Game.level);
        }
        if(room == 3){
            System.out.println("There is a monster in this room! KILL it before it kills you!");
            Game.spawnMonster(Game.level);
        }
        if(room == 5){
            System.out.println("There is life in this room! You have been revived!");
        }
        if(room == 6){
            System.out.println("There is a shield in this room!");
        }
        if(room == 7){
            System.out.println("There is a armor in this room!");
        }
        if(room == 9){
            System.out.println("The BOSS is here, kill it to win the game!");
        }
    }
}
