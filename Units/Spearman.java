package Units;

public class Spearman extends Melee{
    public Spearman(String name){
        super(name, 20, 4, 5, 2, 3);
    }
    @Override
    public String toString(){
        return name;
    }
}
