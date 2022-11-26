import java.util.Scanner;

public class LocalizeMaiorNumero {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int maior = 0; // ou int maior = Interger.MIN_Value;
        int counter =0;
        String nome= " ";

        while (counter <10){
            counter++;
            System.out.println("Qual seu nome?");
            nome = scan.nextLine();
            System.out.println("Quantas vendas você fez?");
            int number = scan.nextInt();
            scan.nextLine();
            if (number> maior){
                maior = number;

            }

        }
        System.out.printf("O vendedor com maior venda foi, %s, com %d , vendas", nome, maior);
        System.out.println(counter);
    }
}


/*(Localize o maior número) O processo de localizar o maior valor é muito utilizado em aplicativos de computador. Por exemplo, um
programa que determina o vencedor de uma competição de vendas inseriria o número de unidades vendidas por cada vendedor. O vendedor
que vende mais unidades ganha a competição. Escreva um programa em pseudocódigo e, então, um aplicativo Java que aceita como entrada
uma série de 10 inteiros e determina e imprime o maior dos inteiros. Seu programa deve utilizar pelo menos as três variáveis a seguir:
a) counter: um contador para contar até 10 (isto é, monitorar quantos números foram inseridos e determinar quando todos os 10 números foram processados).
b) number: o inteiro mais recentemente inserido pelo usuário.
c) largest: o maior número encontrado até agora*/