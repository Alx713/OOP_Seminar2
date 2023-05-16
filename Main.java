import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import Units.Names;
import Units.Melee;
import Units.Peasant;
import Units.Rogue;
import Units.Sniper;
import Units.Wizard;
import Units.Spearman;
import Units.Crossbowman;
import Units.Monk;

public class Main{
    public static void main(String[] args){
        ArrayList<Melee> team1 = new ArrayList<>();
        for (int i = 1; i < 11; i++){
            switch (new Random().nextInt(4)){
                case 0:
                team1.add(new Peasant(getName(), team1, 1, i));
                break;
                case 1:
                team1.add(new Spearman(getName(), team1, 1, i));
                break;
                case 2:
                team1.add(new Crossbowman(getName(), team1, 1, i));
                case 3:
                team1.add(new Wizard(getName(), team1, 1, i));
                break;
            }
        }
        

        ArrayList<Melee> team2 = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            switch (new Random().nextInt(4)) {
                case 0:
                    team2.add(new Peasant(getName(), team2, 10, i));
                    break;
                case 1:
                    team2.add(new Rogue(getName(), team2, 10, i));
                    break;
                case 2: 
                    team2.add(new Sniper(getName(), team2, 10, i));
                    break;
                case 3:
                    team2.add(new Monk(getName(), team2, 10, i));
                    break;
            }
        }
        ArrayList<Melee> team3 = new ArrayList<Melee>();
        team3.addAll(team1);
        team3.addAll(team2);
        team3.sort(new Comparator<Melee>() {
            @Override
            public int compare(Melee o1, Melee o2){
                return o2.initiative - o1.initiative;
            }
        });
        team3.forEach(n -> n.getDmage(2));
        System.out.println("[Команда 1]");
        team1.forEach(n -> System.out.println(n.getInfo()));
        System.out.println("\n[Команда 2]");
        team2.forEach(n -> System.out.println(n.getInfo()));

        System.out.println("\n[Инициатива]");
        System.out.println(team3);
        team1.forEach(n -> n.step(team2));
        team2.forEach(n -> n.step(team1));
        System.out.println("\n[Команда 1]");
        team1.forEach(n -> System.out.println(n.getInfo()));
        System.out.println("\n[Команда 2]");
        team2.forEach(n -> System.out.println(n.getInfo()));
    }
    private static String getName(){
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
    
    }
}