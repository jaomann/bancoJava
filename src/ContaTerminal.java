import Entity.User;
import java.util.Scanner;


public class ContaTerminal{
    public static void main(String[] args){
    User user = new User();
    Scanner scan = new Scanner(System.in);

        System.out.println("Olá Cliente\nInforme abaixo os dados necessários para criar sua conta.");
        System.out.print("Nome:");
        user.Nome = scan.nextLine();
        System.out.print("Depósito Inicial:");
        user.Saldo = scan.nextDouble();
        scan.close();
        user.setAgencia();
        user.setNumero();
         System.out.println("Bem vindo "+user.Nome+". Segue seus dados:\n---Numero da conta: "+user.Numero+"\n---Numero da agência: "+user.Agencia+"\n---Proprietário: "+user.Nome+"\n---Saldo Atual: R$"+user.Saldo+".");

    }
}