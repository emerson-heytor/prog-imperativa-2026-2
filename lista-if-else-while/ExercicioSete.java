import java.util.Scanner;
public class ExercicioSete {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);

        int numero = sc.nextInt();
        System.out.println("\nTabuada de " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        sc.close();
    }
}
