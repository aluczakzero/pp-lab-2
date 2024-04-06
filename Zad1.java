import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę przedmiotów: ");
        int LiczbaPrzedmiotow = scanner.nextInt();

        double sumaOcen = 0;
        double [] oceny = new double[LiczbaPrzedmiotow];
        

        for (int i = 0; i < LiczbaPrzedmiotow; i++) {
            double ocena;
            do {
                System.out.print("Podaj ocenę z przedmiotu " + (i+1) + ": ");
                ocena = scanner.nextDouble();
                if (ocena <= 0 || ocena >= 6) {
                    System.out.println("Ocena musi być dodatnia i mniejsza od 6. Podaj ocenę ponownie");
                }
            } while (ocena <=0 || ocena >= 6);
            oceny[i] = ocena;
        }

        System.out.println("Oceny:");
        for (int i = 0; i < LiczbaPrzedmiotow; i++) {
            System.out.println("Ocena z przedmiotu " + (i+1) + ": " + oceny[i]);
            sumaOcen += oceny[i];
        }
        System.out.println("Suma ocen: " + sumaOcen);
        

        double srednia = sumaOcen / LiczbaPrzedmiotow;

        System.out.println("Średnia arytmetyczna ocen: " + srednia);

        scanner.close();
    }
}
