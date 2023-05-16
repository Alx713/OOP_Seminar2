package Units;
import java.util.ArrayList;

public interface GameInterface {
    void step(ArrayList<Melee> enemy);

    String getInfo();
    String introduce();
}