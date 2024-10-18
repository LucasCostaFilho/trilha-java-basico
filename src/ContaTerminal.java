import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        Double saldo;

        System.out.println("Por favor, digite o número:");
        numero = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Por favor, digite a agência:");
        agencia = scanner.nextLine();
        System.out.println("Por favor, digite seu nome:");
        nomeCliente = scanner.nextLine();
        System.out.println("Por favor, digite seu saldo:");
        saldo = scanner.nextDouble();
        scanner.close();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
