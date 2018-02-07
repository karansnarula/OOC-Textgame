package Game;

public class Weapon implements WeaponInterface,Items {

    int hitPoints;

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getHitPoints() {
        return hitPoints;
    }

}
