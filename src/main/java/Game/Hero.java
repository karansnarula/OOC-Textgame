package Game;

import java.util.HashMap;

public class Hero {

    public int maxLife;
    public int currentLife;
    public int strength;
    int row;
    int column;
    public HashMap<Integer,Items> ListItems;

    public Hero(){
        this.maxLife = 50;
        this.currentLife = maxLife;
        this.strength = 5;
        row = 0;
        column = 0;
        ListItems = new HashMap<Integer, Items>();
    }
    public void addItem(int itemNumber,Items item){
        ListItems.put(itemNumber,item);
    }
    public void setCurrentLife(int life){
        this.currentLife = life;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public int getMaxLife(){
        return  this.maxLife;
    }
    public int getCurrentLife(){
        return this.currentLife;
    }
    public int getStrength(){
        return this.strength;
    }
    public void takeUpdate(String item){
        if(ListItems.containsKey(2) && item.equals("weapon")){
            this.strength += ListItems.get(2).getHitPoints();
        }
        if(ListItems.containsKey(6) && item.equals("shield")){
            this.maxLife += ListItems.get(6).getHitPoints();
            this.currentLife += ListItems.get(6).getHitPoints();
        }
        if(ListItems.containsKey(7) && item.equals("armor")){
            this.maxLife += ListItems.get(7).getHitPoints();
            this.currentLife += ListItems.get(7).getHitPoints();
        }
    }
    public void removeItem(String item){
        if(ListItems.containsKey(2) && item.equals("weapon")){
            this.strength -= ListItems.get(2).getHitPoints();
            ListItems.remove(2);
        }
        if(ListItems.containsKey(6) && item.equals("shield")){
            this.maxLife -= ListItems.get(6).getHitPoints();
            this.currentLife -= ListItems.get(6).getHitPoints();
            ListItems.remove(6);
        }
        if(ListItems.containsKey(7) && item.equals("armor")){
            this.maxLife -= ListItems.get(7).getHitPoints();
            this.currentLife -= ListItems.get(7).getHitPoints();
            ListItems.remove(7);
        }
    }
}
