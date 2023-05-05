import Units.Peasant;
import Units.Rogue;
import Units.Sniper;
import Units.Wizard;
import Units.Spearman;
import Units.Crossbowman;
import Units.Monk;

public class Main{
    public static void main(String[] args){
        Peasant peasant = new Peasant("Крестьянин");
        Rogue rogue = new Rogue("Разбойник");
        Sniper sniper = new Sniper("Снайпер");
        Wizard wizard = new Wizard("Колдун");
        Spearman spearman = new Spearman("Копейщик");
        Crossbowman crossbowman = new Crossbowman("Арбалетчик");
        Monk monk = new Monk("Монах");
        System.out.println(peasant);
        System.out.println(rogue);
        System.out.println(sniper);
        System.out.println(spearman);
        System.out.println(crossbowman);
        System.out.println(monk);
        System.out.println(wizard);
    }
}