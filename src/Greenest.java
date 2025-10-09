import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Greenest {

    public static void main(String[] args) {


        Plants igge = new Kaktus("Igge", 0.02);
        Plants meatloaf = new Köttätande("Meatloaf", 0.7);
        Plants laura = new Palm("Laura", 5);
        Plants olof = new Palm("Olof", 1);
        boolean found = false;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Vilken växt ska få vätska? ");
        String val = scanner.nextLine().toLowerCase();

        ArrayList<Plants> plantsList = new ArrayList<>();

        plantsList.add(igge);
        plantsList.add(meatloaf);
        plantsList.add(laura);
        plantsList.add(olof);

        for (Plants plants : plantsList){
            if (val.equalsIgnoreCase(plants.getName())){
                plants.vattnaVäxt();
                found = true;
                break;
            }

        }
        if (!found){
            System.out.println("Det finns ingen växt med namnet " + val);
        }




    }
}
