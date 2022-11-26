import java.util.Scanner;

public class CalculadoraCredito {
    public static void main(String[] args) {
        int saldo = 0;
        int total=0;
        int limiteCredito = 100;
        String conta="";

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o numero da conta:");
        conta = scan.nextLine();
        System.out.println("Qual seu saldo:");
        saldo = scan.nextInt();
        System.out.println("Digite o valor do item ou digite -1 para sair:");
        int valor = scan.nextInt();
        while (valor!= -1){
            System.out.println("Digite o valor do item ou digite -1 para sair:");
            valor = scan.nextInt();
            total += valor + 1;
            saldo -= valor+ 1;

        }
        if (total<=saldo){
            System.out.println("Você tem saldo suficiente");

        } else if ((total+limiteCredito) <= saldo) {
            System.out.println("Limite de crédito usado");

        }else {
            System.out.println("Limite de crédito excedido");
        }
        System.out.printf("O seu saldo da conta, %s%n%d", conta, saldo);
        System.out.printf("tota da compra, %d", total);

    }

}
/*(Calculador de limite de crédito) Desenvolva um aplicativo Java que determina
 se um cliente de uma loja de departamentos excedeu o

limite de crédito em uma conta-corrente. Para cada cliente, os seguintes dados estão disponíveis:
a) Número de conta.
b) Saldo no início do mês.
c) Total de todos os itens cobrados desse cliente no mês.
d) Total de créditos aplicados ao cliente no mês.
e) Limite de crédito autorizado.
O programa deve inserir todos esses dados como inteiros, calcular o n
ovo saldo (= saldo inicial + despesas – créditos), exibir o novo saldo e

determinar se o novo saldo excede ao limite de crédito do cliente.
Para aqueles clientes cujo limite de crédito foi excedido, o programa deve

exibir a mensagem "Limite de crédito excedido".*/