package Units;

public class Crossbowman extends Ranged{
    public Crossbowman(String name){
        super(name,15,5,3,4,5,10,7);
    }
    @Override
    public String toString(){
        return name;
    }
}
