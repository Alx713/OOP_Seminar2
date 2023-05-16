package Units;
import java.util.ArrayList;
public class Crossbowman extends Ranged{
    public Crossbowman(String name, ArrayList<Melee> team, int x, int y){
        super(name,15,5,3,4,5,10,7, team, x, y);
    }
    @Override
    public String toString(){
        return "Арбалетчик";
    }

@Override
public String getInfo(){
    return super.getInfo();
}
}
