package Units;
import java.util.ArrayList;
public class Sniper extends Ranged{
    public Sniper(String name, ArrayList<Melee> team){
        super(name, 15,7,2,3,5,10,5, team);
    }
    @Override
    public String toString(){
        return "Снайпер";
    }
    @Override
    public void step(){
    
    }
    @Override
    public String getInfo(){
        return super.getInfo();
    }
}
