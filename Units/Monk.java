package Units;
import java.util.ArrayList;

public class Monk extends Mage{
    public Monk(String name, ArrayList<Melee> team, int x, int y){
        super(name,7,7,2,7,7,7,7, team, x, y);
    }
    @Override
    public String toString(){
        return "Монах";
    }
    void heal(){
        
    }
    
    @Override
    public String getInfo(){
        return super.getInfo();
    }
}
