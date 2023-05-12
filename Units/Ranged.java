package Units;
import java.util.ArrayList;

public abstract class Ranged extends Melee{
    int distance, ammo;

    Ranged(String name, float maxHp, float damage, float armor, float speed, int initiative, int ammo, int distance, ArrayList<Melee> team){
        super(name, maxHp, damage, armor, speed, initiative, team);
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
