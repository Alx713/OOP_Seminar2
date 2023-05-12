package Units;
import java.util.ArrayList;
public class Peasant extends Melee {
    public Peasant(String name, ArrayList<Melee> team){
        super(name, 10, 1,0,2,2, team);
    }
    @Override
    public String toString(){
        return "Крестьянин";
    }
    @Override
    public void step(){
    
    }
    @Override
    public String getInfo(){
        return super.getInfo();
    }
}
