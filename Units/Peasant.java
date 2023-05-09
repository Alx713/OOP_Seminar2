package Units;

public class Peasant extends Melee {
    public Peasant(String name){
        super(name, 10, 1,0,2,2);
    }
    @Override
    public String toString(){
        return "Крестьянин";
    }
    @Override
    public void step(){
    
    }
    @Override
    public String getInfo(){
        return super.getInfo();
    }
}
