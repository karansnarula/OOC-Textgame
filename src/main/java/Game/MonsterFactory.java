package Game;

public class MonsterFactory {

    public Monster makeMonster(int MapLevel){
        Monster monster = new Monster();
        int life;
        int attack;
        if(MapLevel == 1){
            life = 80;
            attack = 20;
        }
        else if(MapLevel == 2){
            life = 120;
            attack = 30;
        }
        else{
            life = 200;
            attack = 50;
        }
        monster.setLife(life);
        monster.setAttack(attack);
        return monster;
    }
}
