import java.util.Scanner;
public class ExercicioUm {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        int divisao = a / b;

        System.out.println("[ " + a + ", " + b + "] Soma: " + soma + "; Subtração: " + subtracao + "; Multiplicação: " + multiplicacao + "; Divisão: " + divisao + ".");
        sc.close();
    }
}