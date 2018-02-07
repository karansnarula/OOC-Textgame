package Game;

public class Monster implements MonsterInterface {


    public int life;
    public int attack;


    public void setLife(int life) {
        this.life = life;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getLife(){
        return this.life;
    }

    public int getAttack(){
        return this.attack;
    }
}
