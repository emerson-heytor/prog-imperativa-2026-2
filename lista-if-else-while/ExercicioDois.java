import java.util.Scanner;
public class ExercicioDois {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);

        double peso = sc.nextDouble();
        double altura = sc.nextDouble();
        double imc = peso / (altura * altura);
        System.out.printf("Seu Indíce de Massa Corporal é: %.2f\n", imc);

        if (imc < 18.5) {
            System.out.println("Você está abaixo do peso");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Seu peso está normal e estável");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Você está com sobrepeso");
        } else {
            System.out.println("Você está beso");
        }

        sc.close();
    }
}
