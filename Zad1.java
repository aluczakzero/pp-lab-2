import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę przedmiotów: ");
        int LiczbaPrzedmiotow = scanner.nextInt();

        double sumaOcen = 0;
        

        for (int i = 1; i <= LiczbaPrzedmiotow; i++) {
            System.out.print("Podaj ocenę z przedmiotu: " + i + ": ");
            double ocena = scanner.nextDouble();
            sumaOcen += ocena;
        }

        double srednia = sumaOcen / LiczbaPrzedmiotow;

        System.out.println("Średnia arytmetyczna ocen: " + srednia);

        scanner.close();
    }
}
