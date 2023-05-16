package Units;
import java.util.ArrayList;
public class Spearman extends Melee{
    public Spearman(String name, ArrayList<Melee> team, int x, int y){
        super(name, 20, 4, 5, 2, 3, team, x, y);
    }
    @Override
    public String toString(){
        return "Копейщик";
    }
    
    @Override
    public String getInfo(){
        return super.getInfo();
    }
}
