package Units;
import java.util.ArrayList;
import Game.Coordinate;

public abstract class Melee implements GameInterface{
    String name;
    float maxHp, currentHp, damage, armor, speed;
    public int initiative;
    ArrayList<Melee> team;
    Coordinate coordinate;


Melee(String name, float maxHp, float damage, float armor, float speed, int initiative, ArrayList<Melee> team, int x, int y){
    this.name = name;
    this.maxHp = maxHp;
    this.currentHp = maxHp;
    this.damage = damage;
    this.armor = armor;
    this.speed = speed;
    this.initiative = initiative;
    this.team = team;
    this.coordinate = new Coordinate(x, y);
}

void attack(Melee target){
target.getDmage(damage);
//System.out.println(this.introduce() + " атакует " + target.introduce());
}

void defend(){

}

void walk(){

}
boolean die(){
    if (currentHp <= 0) {
        return true;
    }else{
        return false;
    }
}
public void getDmage(float attack){
    this.currentHp -= attack;
    if (this.currentHp > this.maxHp) {
        this.currentHp = this.maxHp;
    }
    if (this.currentHp < 0) {
        this.currentHp = 0;
    }
}

@Override
public String getInfo(){
    return "[" + name + " " + toString() + "] hp:" + currentHp + "/" + maxHp + "damage:" + damage + "armor:" + armor + "speed:" + speed + "initiative:" + initiative;
}


@Override
public void step(ArrayList<Melee> enemy) {
    if (die()) {
        return;
    }
    Melee target = findNearUnit(enemy);
    if (target.coordinate.distance(this.coordinate) < 2) {
        attack(target);
    }else {
        move(target);
    }
}
public Melee findNearUnit(ArrayList<Melee> team){
    Melee nearUnit = null;
    float minDist = Float.MAX_VALUE;
    for (Melee unit : team) {
        if(unit.die())continue;
        float dist = unit.coordinate.distance(this.coordinate);
        if (minDist > dist) {
            nearUnit = unit;
            minDist = dist;
        }
    }
    return nearUnit;
}

@Override
public String introduce() {
    return this + " " + this.name;
}
public int[] getCoords() {
    return new int[]{this.coordinate.y, coordinate.x};
}

public float getHp() {
    return currentHp;
}
protected void move(Melee target){
    int dx = target.coordinate.distanceXY(this.coordinate)[0];
    int dy = target.coordinate.distanceXY(this.coordinate)[1];
    if (Math.abs(dx) < Math.abs(dy)){
        moveY(dx, dy, true);
    }else {
        moveX(dx, dy, true);
    }
}

private void moveX(int dx, int dy, boolean flag){
    if (dx > 0) {
        if (isEmptyPosition(this.coordinate.x-1, this.coordinate.y)) {
            this.coordinate.x--;
        }else if(flag){
            moveY(dx,dy, false);
        }
    }else {
        if (isEmptyPosition(this.coordinate.x+1, this.coordinate.y)) {
            this.coordinate.x++;
        }else if(flag){
            moveY(dx,dy, false);
        }
    }
}
private void moveY(int dx, int dy, boolean flag){
    if (dy > 0) {
        if (isEmptyPosition(this.coordinate.x, this.coordinate.y-1)) {
            this.coordinate.y--;
        }else if(flag){
            moveX(dx,dy, false);
        }
    }else {
        if (isEmptyPosition(this.coordinate.x, this.coordinate.y+1)) {
            this.coordinate.y++;
        }else if(flag){
            moveX(dx,dy, false);
        }
}
}



protected boolean isEmptyPosition(int x, int y){
    for (Melee unit: team) {
        if (unit.coordinate.x == x && unit.coordinate.y == y) {
            if (!unit.die()) {
                return false;
            }
        }
    }
    return true;
}
}