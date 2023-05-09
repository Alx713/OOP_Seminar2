package Units;

public abstract class Ranged extends Melee{
    int distance, ammo;

    Ranged(String name, float maxHp, float damage, float armor, float speed, int initiative, int ammo, int distance){
        super(name, maxHp, damage, armor, speed, initiative);
        this.ammo = ammo;
        this.distance = distance;
    }
    void shoot(){

    }
    @Override
    public String getInfo(){
        return super.getInfo() + "ammo:" + ammo + "distance" + distance;
    }
}
