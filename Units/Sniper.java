package Units;

public class Sniper extends Ranged{
    public Sniper(String name){
        super(name, 15,7,2,3,5,10,5);
    }
    @Override
    public String toString(){
        return name;
    }
}
