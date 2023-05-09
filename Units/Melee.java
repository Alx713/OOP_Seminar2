package Units;

public abstract class Melee implements GameInterface{
    String name;
    float maxHp, currentHp, damage, armor, speed;
    int initiative;


Melee(String name, float maxHp, float damage, float armor, float speed, int initiative){
    this.name = name;
    this.maxHp = maxHp;
    this.currentHp = maxHp;
    this.damage = damage;
    this.armor = armor;
    this.speed = speed;
    this.initiative = initiative;
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