import java.util.Scanner;
public static const TAM_CONTAS = 50:
public class Conta{
    int id;
    String cliente;
    double saldo;
    double limite;
}

public static int cadastrarConta(Conta[] v, int tam){
    Scanner sc = new Scanner (System.in);
    int spc_contas = TAM_CONTAS;
    int nova_conta = -1;
    Conta c = new Conta (Class);
    c.id = sc.nextInt();
    c.cliente = sc.nextLine();
    c.saldo = sc.nextDouble();
    c.limite = sc.nextDouble();
    System.out.println("Pressionar [Enter] para imprimir");
    sc.nextline();
}
public static void imprimir (Conta c, cadastrarConta){
    System.out.println("Cadastramento respectivo do cliente (nº identidade, nome do cliente, saldo e limite do cartão):");
    System.out.printf("(%d, %s, saldo: R$%2.f, limite: R$2.f)\n", c.id, c.cliente, c.saldo, c.limite);
}

public static int buscaBinariaCliente(Conta[] v, int tam, String x){
    Scanner sc = new Scanner(Ssytem.in);
    Conta c = new Conta (Class);
    System.out.println("Pesquisar o cliente pelo nº de ID:");
    c.id = sc.nextInt();
    if (c.id = public static int cadastrarConta(c.id)){
        System.out.println("Conta pesqisada:");
        imprimir conta_pesquisada;
    } else {
        System.out.println("Não foi achada ou não existe. Tente novamente");
    }
}

public static int insertionSortCliente(Conta[] v, int tam){
    int n = array.length;
    int comparacoes = 0;
    for (int i = 1; i < tam; i++){
        Conta chave = v[i];
        int j = i-1;

        while (j >= 0){
            comparacoes++;
            if (v[j].getCliente().compareToIgnoreCase(chave.getCliente() > 0)){
                v[j + 1] = v[j];
            } else {
                break;
            }
        }
        v[j + 1] = chave;
    }
}