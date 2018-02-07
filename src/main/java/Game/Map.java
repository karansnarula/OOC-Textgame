package Game;

public class Map {

//          Keys:
//          1) Available room
//          2) Weapon
//          3) Monster
//          4) Enter new level
//          5) Heart
//          6) Shield
//          7) Armor
//          8) Suicide Monster
//          9) Boss

    private int[][] map;
    private int numberOfMonsters;
    private int getNumberOfItems;
    public int monsterLife;
    public int monsterAttack;

    public int[][] getMap(int level){

        if(level == 1){
            this.map = new int[][]{{1,1,1,1,1,1,2,3},
                                   {0,0,0,0,0,4,0,0}};
            this.numberOfMonsters = 1;
            this.getNumberOfItems = 1;
            this.monsterLife = 80;
            this.monsterAttack = 20;
        }
        else if (level == 2){
            this.map = new int[][] {{1,1,1,1,1,0,0,0,0,0},
                                    {0,0,0,0,5,0,0,0,0,0},
                                    {0,0,0,0,1,0,0,0,0,0},
                                    {6,3,1,1,1,1,2,1,1,0},
                                    {0,0,0,0,1,0,0,0,0,0},
                                    {0,0,0,0,3,1,3,1,1,7},
                                    {0,0,0,0,4,0,0,0,0,0}};
            this.numberOfMonsters = 3;
            this.getNumberOfItems = 4;
            this.monsterLife = 120;
            this.monsterAttack = 30;
        }
        else{
            this.map = new int[][] {{1,0,0,0,0,0},
                                    {1,1,1,3,1,1},
                                    {8,0,0,0,0,3},
                                    {1,1,3,5,1,1},
                                    {1,0,1,0,0,0},
                                    {5,0,1,0,0,0},
                                    {2,1,9,0,0,0}};
            this.numberOfMonsters = 5;
            this.getNumberOfItems = 2;
            this.monsterLife = 200;
            this.monsterAttack = 50;
        }
        return map;
    }
    public int getNumberOfMonsters(int level){
        return numberOfMonsters;
    }
    public void setNumberOfMonsters(int number){
        this.numberOfMonsters = number;
    }
    public int getGetNumberOfItems(int level){
        return getNumberOfItems;
    }

    public int getMonsterAttack() {
        return monsterAttack;
    }

    public int getMonsterLife() {
        return monsterLife;
    }
}
