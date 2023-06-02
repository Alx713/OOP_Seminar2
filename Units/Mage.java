package Units;
import java.util.ArrayList;

public abstract class Mage extends Melee{
    float mana;
    int distance;
    
    Mage(String name, float maxHp, float damage, float armor, float speed, int initiative, float mana, int distance, ArrayList<Melee> team, int x, int y){
        super(name, maxHp, damage, armor, speed, initiative, team, x, y);
        this.mana = mana;
        this.distance = distance;
    }
    void cast(){
        
    }
@Override
public String getInfo(){
    return super.getInfo() + "mana:" + mana + "distance:" + distance;
}
public void step(ArrayList<Melee> enemy) {
    if (!die() && mana > 0) {
        for (Melee unit : team) {
            if (!unit.die() && unit.currentHp < unit.maxHp) {
                unit.getDmage(-damage);
                this.mana--;
                //System.out.println(this.introduce() + " лечит " + unit.introduce());
                return;
            }
        }
    }
}
}
