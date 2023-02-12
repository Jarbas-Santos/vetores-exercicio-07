import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double[] vect;
        double sumAverage, average;

        System.out.print("Quantos elementos vai ter o vetor? ");
        n = sc.nextInt();

        vect = new double[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.printf("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }

        sumAverage = 0.0;
        for (int i = 0; i < vect.length; i++) {
            sumAverage += vect[i];
        }
        average = sumAverage / vect.length;

        System.out.println();
        System.out.printf("MEDIA DO VETOR = %.3f%n", average);

        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < average) {
                System.out.printf("%.1f%n", vect[i]);
            }
        }
        
        sc.close();
    }
}