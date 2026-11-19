import java.util.Scanner;
public static const int TAM_OP = 1000;
public class Operacao {
    int id;
    int idConta;
    char tipo; 
    double valor;
};

public static int filtraOperacoes(Operacao[] vOp, int tamOp, Operacao[] vFiltrado, int x){
    Scanner sc = new Scanner (System.in);
    Operacao o = new Operacao (Class);
    o.id = sc.nextInt();
    o.idConta = sc.nextInt();
    o.tipo = sc.nextChar();
    o.valor = sc.nextDouble;

    for (int i = 0; j < tamOp; i++){
        if (vOp[i].idConta == X){
            vOpFiltrado[n] = vOp [i];
            n++;
        }
    }
    return
}

public static void imprimirOperacaoFiltrado(Operacao o, vOp Filtrado[n]){
    System.out.printf("Operacao Filtrada: " = "(%d, %d, %char, R$%2.f)\n", o.id, o.idConta, o.tipo, o.valor);
}

public static void extrato(Conta[] vContas, int tamConta,
                           Operacao[] vOp, int tamOp, int x) {

    Conta c = null;
    for (int i = 0; i < tamConta; i++) {
        if (vContas[i].id == x) {
            c = vContas[i];
            break;
        }
    }
    if (c == null) {
        System.out.println("Conta não encontrada.");
        return;
    }

    Operacao[] vF = new Operacao[TAM_OP];
    int n = filtraOperacoes(vOp, tamOp, vF, x);

    int inicio = Math.max(0, n - 5);

    double saldo = 0;
    for (int i = 0; i < inicio; i++) {
        saldo += vF[i].valor;
    }

    System.out.println("CONTA N." + c.id);
    System.out.println("CLIENTE: " + c.nome);
    System.out.printf("%-4s | %-15s | %10s | %10s%n", "ID", "OPERAÇÃO", "VALOR", "SALDO");
    System.out.printf("%-4s | %-15s | %10s | %10s%n", "", "Saldo Anterior", "", formata(saldo));

    for (int i = inicio; i < n; i++) {
        Operacao o = vF[i];
        saldo += o.valor;
        System.out.printf("%04d | %-15s | %10s | %10s%n", o.id, tipo(o.tipo), formata(o.valor), formata(saldo));
    }

    System.out.printf("Saldo Atual | %s%n", formata(saldo));
}

public static String formata(double v) {
    String sinal = (v < 0) ? "D" : "C";
    return String.format("%.2f%s", Math.abs(v), sinal);
}

public static String nomeTipo(char tipo) {
    switch (tipo) {
        case 'D': return "Depósito";
        case 'S': return "Saque";
        case 'T': return "Transferência";
        default: return "Outro";
    }
}