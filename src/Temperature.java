import java.util.Scanner;
import java.util.Random;
public class Temperature{
    public static void main(String[]argh){
        System.out.println("Program za pracenje temperatura tokom dana.");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        double temperature;
        double temperatura=0;
        double suma=0;
        double min = Double.MAX_VALUE;
        double brojMjerenja=0;
        double max = Double.MIN_VALUE;
        double povisenomjerenje=0;
        System.out.println("Unesite temperature tokom dana (0 za kraj):");

        do{
            System.out.println("Temperatura:");
            temperatura=scanner.nextDouble();
            if(temperatura!=0){
                suma+=temperatura;
                brojMjerenja++;
                if (temperatura < min) {
                    min = temperatura;
                }
                if (temperatura > max) {
                    max = temperatura;
                }
                if(temperatura>37){
                    povisenomjerenje++;
                }
            }
        } while(temperatura!=0);
        if (brojMjerenja > 0) {
            double prosjek = suma / brojMjerenja;
            System.out.println("Broj unesenih temperatura: " + brojMjerenja);
            System.out.printf("Minimalna temperatura: %.2f%n", min);
            System.out.printf("Maksimalna temperatura: %.2f%n", max);
            System.out.printf("Prosjecna temperatura: %.2f%n", prosjek);
            if(povisenomjerenje!=0){
                System.out.println("Broj povisenih mjerenja: " + povisenomjerenje);
            } else {
                System.out.println("Nema povisenih mjerenja.");
            }
        } else {
            System.out.println("Nema unesenih temperatura.");
        }
    }
}