package Units;
import java.util.ArrayList;
public class Spearman extends Melee{
    public Spearman(String name, ArrayList<Melee> team){
        super(name, 20, 4, 5, 2, 3, team);
    }
    @Override
    public String toString(){
        return "Копейщик";
    }
    @Override
    public void step(){
    
    }
    @Override
    public String getInfo(){
        return super.getInfo();
    }
}
