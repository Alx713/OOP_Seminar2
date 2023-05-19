package Units;
import java.util.ArrayList;

public abstract class Ranged extends Melee{
    int distance, ammo;

    Ranged(String name, float maxHp, float damage, float armor, float speed, int initiative, int ammo, int distance, ArrayList<Melee> team, int x, int y){
        super(name, maxHp, damage, armor, speed, initiative, team, x, y);
        this.ammo = ammo;
        this.distance = distance;
    }
    void shoot(){

    }
    @Override
    public String getInfo(){
        return super.getInfo() + "ammo: " + ammo + "distance: " + distance;
    }
    @Override
    public void step(ArrayList<Melee> enemy) {
        if (die() || ammo <= 0) {
            return;
        }
        attack(findNearUnit(enemy));
        for (Melee unit : team) {
            if (unit instanceof Peasant) {
                if (!unit.die() && ((Peasant)unit).readiness) {
                    ((Peasant)unit).readiness = false;
                    return;
                }
            }
        }
        this.ammo--;
    }
}
