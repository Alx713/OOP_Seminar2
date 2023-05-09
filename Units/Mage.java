package Units;

public abstract class Mage extends Melee{
    float mana;
    int distance;
    
    Mage(String name, float maxHp, float damage, float armor, float speed, int initiative, float mana, int distance){
        super(name, maxHp, damage, armor, speed, initiative);
        this.mana = mana;
        this.distance = distance;
    }
    void cast(){
        
    }
@Override
public String getInfo(){
    return super.getInfo() + "mana:" + mana + "distance:" + distance;
}
}
