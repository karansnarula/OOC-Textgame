package Game;

import command.Info;
import command.*;

import java.util.Scanner;


public class Game {

    public static Monster monster;
    public static Weapon weapon;
    public static int level = 1;
    static Hero hero = new Hero();
    static Map map = new Map();
    static int mapLevel[][] = map.getMap(level);
    static boolean quit = false;
    String command;

    public void start(){
        CommandFactory inputCommand = new CommandFactory();
        System.out.println("Welcome to my very own Text Game!");
        Scanner input = new Scanner(System.in);
        while(quit == false){ //Game Loop
            command = input.next();
            inputCommand.initiateCommand(command);
            if(mapLevel[hero.getRow()][hero.getColumn()] == 8){
                System.out.println("You died because there is a suicide monster in this room!");
                quit = true;
            }
            if(mapLevel[hero.getRow()][hero.getColumn()] == 5){
                hero.setCurrentLife(hero.getMaxLife());
            }
            if(hero.getCurrentLife() <= 0){
                System.out.println("You are dead!");
                quit = true;
            }
        }
        input.close();
        System.out.println("Game Over!");
    }

    public static int getLevel(){
        return level;
    }

    public static Hero getHero(){
        return hero;
    }

    public static Map getMap(){
        return map;
    }

    public static Monster getMonster(){
        return monster;
    }

    public static void nullMonster(){
        monster = null;
    }

    public static Weapon getWeapon(){
        return weapon;
    }

    public static int[][] getMapLevel(){
        return mapLevel;
    }

    public static void setLevel(int number){
        level = number;
    }

    public static void setMapLevel(){
        mapLevel = map.getMap(level);
    }

    public static void spawnMonster(int level){
        monster = new MonsterFactory().makeMonster(level);
    }

    public static void createWeapon(int level){
        weapon = new WeaponFactory().makeWeapon(level);
    }
    public static void gameQuit(){
        quit = true;
    }
}
