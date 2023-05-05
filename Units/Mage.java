package Units;

public class Mage extends Melee{
    float mana;
    int distance;
    
    Mage(String name, float hp, float damage, float armor, float speed, int initiative, float mana, int distance){
        super(name, hp, damage, armor, speed, initiative);
        this.mana = mana;
        this.distance = distance;
    }
    void cast(){
        
    }

}
