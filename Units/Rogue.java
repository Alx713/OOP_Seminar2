package Units;
import java.util.ArrayList;
public class Rogue extends Melee {
    public Rogue(String name, ArrayList<Melee> team, int x, int y){
        super(name, 15, 5, 1,5,5, team, x, y);
    }
    @Override
    public String toString(){
        return "Разбойник";
    }
    
    @Override
    public String getInfo(){
        return super.getInfo();
    }
}
