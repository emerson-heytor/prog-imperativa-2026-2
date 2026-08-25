import java.util.Scanner;
public class ExercicioQuatro {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Digite o seu salário bruto (R$): ");
        double salarioBruto = sc.nextDouble();

        double impostoRenda = 0.0;

        if (salarioBruto <= 5000.00) {
            impostoRenda = 0.0;
        } else {
            if (salarioBruto <= 2428.80) {
                impostoRenda = 0.0;
            } else if (salarioBruto <= 2826.65) {
                impostoRenda = (salarioBruto * 0.075) - 182.16;
            } else if (salarioBruto <= 3751.05) {
                impostoRenda = (salarioBruto * 0.15) - 394.16;
            } else if (salarioBruto <= 4664.68) {
                impostoRenda = (salarioBruto * 0.225) - 675.49;
            } else {
                impostoRenda = (salarioBruto * 0.275) - 908.73;
            }

   
            if (salarioBruto <= 7350.00) {
                double redutorAdicional = 978.62 - (0.133145 * salarioBruto);
                impostoRenda -= redutorAdicional;
                if (impostoRenda < 0) {
                    impostoRenda = 0;
                }
            }
        }

        System.out.printf("Valor do Imposto de Renda descontado na fonte: R$ %.2f\n", impostoRenda);

        sc.close();
    }
}
