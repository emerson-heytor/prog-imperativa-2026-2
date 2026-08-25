import java.util.Scanner;
public class ExercicioSeis {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int numero = sc.nextInt();

        if (numero < 0) {
        } else {
            long fatorial = 1;
            int i = numero;

            while (i > 1) {
                fatorial *= i;
                i--;
            }

            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }

        sc.close();
    }
}
