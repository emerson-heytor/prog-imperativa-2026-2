import java.util.Scanner;
public class ExercicioTres {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);

        double salarioBruto = sc.nextDouble();
        double contribuicaoINSS = 0.0;

        if (salarioBruto <= 1621.00) {
            contribuicaoINSS = salarioBruto * 0.075;
        } else if (salarioBruto <= 2902.84) {
            contribuicaoINSS = (salarioBruto * 0.09) - 24.32;
        } else if (salarioBruto <= 4354.27) {
            contribuicaoINSS = (salarioBruto * 0.12) - 111.40;
        } else if (salarioBruto <= 8475.55) {
            contribuicaoINSS = (salarioBruto * 0.14) - 198.49;
        } else {
            contribuicaoINSS = 1695.11; 
        }

        double salarioLiquido = salarioBruto - contribuicaoINSS;

        System.out.printf("Valor da contribuição ao INSS: R$ %.2f\n", contribuicaoINSS);
        System.out.printf("Salário Líquido final: R$ %.2f\n", salarioLiquido);

        sc.close();
    }
}
