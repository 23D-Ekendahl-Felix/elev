import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        elev ny_elev = new elev();
        Scanner Tb = new Scanner(System.in);

        System.out.println("Skriv in Elevens namn");
        ny_elev.Namn = Tb.nextLine();

        System.out.println("Skriv in Elevens personnummer");
        ny_elev.Personnummer = Tb.nextLine();

        System.out.println("Skriv in Elevens email");
        ny_elev.Email = Tb.nextLine();

        System.out.println("Skriv in Elevens mobilnummer");
        ny_elev.mobilnummer = Tb.nextLine();

        System.out.println("Skriv in Elevens klass");
        ny_elev.Klass = Tb.nextLine();

        System.out.println("Skriv in Elevens program");
        ny_elev.Program = Tb.nextLine();

        System.out.println("Elevens namn är: " + ny_elev.Namn);
        System.out.println("Elevens personnummer är: " + ny_elev.Personnummer);
        System.out.println("Elevens email är: " + ny_elev.Email);
        System.out.println("Elevens mobilnummer är: " + ny_elev.mobilnummer);
        System.out.println("Elevens klass är: " + ny_elev.Klass);
        System.out.println("Elevens program är: " + ny_elev.Program);

        Tb.close();

    }
}
