package Units;
import java.util.ArrayList;

public abstract class Melee implements GameInterface{
    String name;
    float maxHp, currentHp, damage, armor, speed;
    public int initiative;
    ArrayList<Melee> team;


Melee(String name, float maxHp, float damage, float armor, float speed, int initiative, ArrayList<Melee> team){
    this.name = name;
    this.maxHp = maxHp;
    this.currentHp = maxHp;
    this.damage = damage;
    this.armor = armor;
    this.speed = speed;
    this.initiative = initiative;
    this.team = team;
}

void attack(){

}

void defend(){

}

void walk(){

}

@Override
public String getInfo(){
    return "[" + name + " " + toString() + "] hp:" + currentHp + "/" + maxHp + "damage:" + damage + "armor:" + armor + "speed:" + speed + "initiative:" + initiative;
}

}