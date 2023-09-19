import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

       public static void main(String[] args) {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Para acessar sua conta, informe os dados: \n");

        System.out.println("Informe seu nome: ");
        String nome = scanner.next();

        System.out.println("Informe sua agência: ");
        String agencia = scanner.next();

        System.out.println("Informe sua conta: ");
        int conta = scanner.nextInt();

        double saldo = 5000.000;


        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco," +
                " sua agência é " + agencia + ", conta " + conta + " e seu saldo de R$" + saldo + " já está disponível para saque");


    }
    
}
