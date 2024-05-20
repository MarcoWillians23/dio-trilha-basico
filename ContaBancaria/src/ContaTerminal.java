import java.util.Scanner;

public class ContaTerminal {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
  
    System.out.println("Por favor, digite o número da Conta: ");
    int numeroConta = sc.nextInt();

    System.out.println("Por favor, digite o número da Agência: ");
    int agencia = sc.nextInt();

    System.out.println("Por favor, digite o nome do Cliente: ");
    sc.nextLine();
    String nomeCliente = sc.next();

    System.out.println("Por favor, digite o saldo do cliente: ");
    double saldo = sc.nextDouble();

    System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque!" );

    sc.close();
  }
  
}


