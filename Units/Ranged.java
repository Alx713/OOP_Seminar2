package Units;

public class Ranged extends Melee{
    int distance, ammo;

    Ranged(String name, float hp, float damage, float armor, float speed, int initiative, int ammo, int distance){
        super(name, hp, damage, armor, speed, initiative);
        this.ammo = ammo;
        this.distance = distance;
    }
    void shoot(){

    }
}
