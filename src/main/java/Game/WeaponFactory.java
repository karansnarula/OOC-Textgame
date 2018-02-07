package Game;

public class WeaponFactory {
    public Weapon makeWeapon(int MapLevel){
        Weapon weapon = new Weapon();
        int hitPoints;
        if(MapLevel == 1){
            hitPoints = 35;
        }
        else if (MapLevel == 2){
            hitPoints = 85;
        }
        else{
            hitPoints = 150;
        }
        weapon.setHitPoints(hitPoints);
        return weapon;
    }
}
