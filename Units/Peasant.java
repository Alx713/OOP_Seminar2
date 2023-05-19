package Units;
import java.util.ArrayList;
public class Peasant extends Melee {
    boolean readiness;
    public Peasant(String name, ArrayList<Melee> team, int x, int y){
        super(name, 10, 1,0,2,2, team, x, y);
        this.readiness = true;

    }
    @Override
    public String toString(){
        return "Крестьянин";
    }
    @Override
    public void step(ArrayList<Melee> enemy) {
        if (readiness) {
            //System.out.println(this + " " + this.name + " ничего не делает");
        }else{
            readiness = true;
            //System.out.println(this + " " + this.name + " находит припасы");
        }
    }
    @Override
    public String getInfo(){
        return super.getInfo();
    }
}
