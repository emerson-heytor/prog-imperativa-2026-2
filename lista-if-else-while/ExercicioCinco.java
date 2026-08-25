import java.util.Scanner;
public class ExercicioCinco {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int inicio = Math.min(num1, num2);
        int fim = Math.max(num1, num2);
        System.out.println("\n--- Números Pares ---");
        for (int i = inicio; i <= fim; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n\n--- Números Ímpares ---");
        for (int i = inicio; i <= fim; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        sc.close();
    }
}
