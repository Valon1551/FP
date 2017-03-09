import java.util.ArrayList;
import java.util.List;

public class Stable {

    public static void main(String[] args) {
        Stable stable = new Stable();
        Horse paul = new Horse("Paul", 4, "male");
        Horse pauline = new Horse("Pauline", 3, "female");


        paul.insertFoal(new Horse("Paulchen", 1, "male"));
        pauline.insertFoal(new Horse("Paulchen", 1, "male"));

        stable.addHorse(paul);
        stable.addHorse(pauline);

        paul.nameOfFoal();
        pauline.nameOfFoal();

        stable.whoIsInStable();
        //Alternative for whoIsInStable
        System.out.println("\nCurrently there are the following horses in the stable:" + stable.whoIsInStableString());

        stable.removeHorse(paul);
        stable.whoIsInStable();


    }


    List<Horse> horses = new ArrayList<>();


    public void addHorse(Horse objHorse){
        horses.add(objHorse);
    }

    public void removeHorse(Horse objHorse){
        horses.remove(objHorse);
    }

    public int amountOfHorses(){
        return horses.size();
    }

    public void whoIsInStable(){
        System.out.println("Currently there are the following horses in the stable:");
        for (int i = 0; i < horses.size(); i++) {
            System.out.println(horses.get(i).getName());
        }
    }

    //Alternative for "whoIsInStable
    public List whoIsInStableString(){
        List<String> horsesInStable = new ArrayList<>();

        for (int i = 0; i < horses.size(); i++) {
            horsesInStable.add(horses.get(i).getName());
        }
        return horsesInStable;
    }
}


