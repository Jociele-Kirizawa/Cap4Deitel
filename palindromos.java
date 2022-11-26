import java.util.Scanner;

public class palindromos {
    public static void main(String[] args) {
        String numero = "";
        boolean valida = false;
        boolean pali = true;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Digite um número inteiro com 5 digitos");
             numero = scan.nextLine();
            if (numero.length()!=5){
                valida=false;
            }else {
                valida=true;
            }

        }while (valida==false);

        int i =0;
        int j = numero.length()-1;
        while (i <j){
            if (numero.charAt(i)!=numero.charAt(j)){
                break;
            }
            i++;
            j--;
        }
        if (i>=j){
            System.out.println("Palindromo");
        }else{
            System.out.println("Não é palindromo");
        }






    }
}
