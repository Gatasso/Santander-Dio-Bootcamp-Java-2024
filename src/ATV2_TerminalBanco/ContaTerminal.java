package ATV2_TerminalBanco;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta !");
        int numeroConta = scanner.nextInt();
        System.out.println("Informe agora a Agência com o dígito:");
        String agencia = scanner.next();
        scanner.nextLine();
        System.out.print("Por favor, informe seu nome:");
        String nomeCliente = scanner.nextLine();
        System.out.println("Qual seu saldo inicial?");
        double saldoInicial = scanner.nextDouble();

        System.out.print("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " +
                                agencia + " conta " + numeroConta + " e seu saldo de R$ " +
                                saldoInicial + " já está disponível para saque");
    }
}
