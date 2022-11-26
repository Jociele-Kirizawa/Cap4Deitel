import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Qual fatorial vc quer??");
        int numero = scan.nextInt();
        int fatorial = 1;

        for (int i = 1; i <= numero; i++){
            fatorial = fatorial* i;
        }
        System.out.printf("Fatorial de %d é %d",numero,fatorial);

    }
}


/*(Fatorial) O fatorial de um inteiro não negativo n é escrito como n! (pronuncia-se “n fatorial”) e é definido como segue:
n! = n · (n – 1) · (n – 2) · ... · 1 (para valores de n maiores ou iguais a 1)
e
n! = 1 (para n = 0)
Por exemplo, 5! = 5 · 4 · 3 · 2 · 1, o que dá 120.
0jhtp.indb 117 07/07/2016 15:18:31
118 Java: como programar
a) Escreva um aplicativo que lê um inteiro não negativo, calcula e imprime seu fatorial*/