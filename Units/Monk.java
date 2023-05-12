package Units;
import java.util.ArrayList;

public class Monk extends Mage{
    public Monk(String name, ArrayList<Melee> team){
        super(name,7,7,2,7,7,7,7, team);
    }
    @Override
    public String toString(){
        return "Монах";
    }
    void heal(){
        
    }
    @Override
    public void step(){
    
    }
    @Override
    public String getInfo(){
        return super.getInfo();
    }
}
