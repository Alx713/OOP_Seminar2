package Units;
import java.util.ArrayList;
public class Wizard extends Mage{
    public Wizard(String name, ArrayList<Melee> team){
        super(name, 20,10,1,5,7,10,4, team);
    }
    @Override
    public String toString(){
        return "Колдун";
    }
    void fireball(){

    }
    void snowball(){
        
    }
    @Override
    public void step(){
    
    }
    @Override
    public String getInfo(){
        return super.getInfo();
    }
}
