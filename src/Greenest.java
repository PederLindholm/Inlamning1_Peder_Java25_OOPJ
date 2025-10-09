import java.util.Scanner;

public class Greenest {

    public static void main(String[] args) {

        Plants igge = new Kaktus("Igge", 0.02);
        Köttätande meatloaf = new Köttätande("Meatloaf", 0.7);
        Palm laura = new Palm("Laura", 5);
        Palm olof = new Palm("Olof", 1);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Vilken växt ska få vätska? ");
        String val = scanner.nextLine().toLowerCase();

        if (val.equals(igge.getName().toLowerCase())) {
            igge.vattnaVäxt();
        } else if (val.equals(meatloaf.getName().toLowerCase())) {
            meatloaf.vattnaVäxt();
        } else if (val.equals(laura.getName().toLowerCase())) {
            laura.vattnaVäxt();
        } else if (val.equals(olof.getName().toLowerCase())) {
            olof.vattnaVäxt();
        } else {
            System.out.println("Du har ingen växt som heter " + val);
        }
    }
}
