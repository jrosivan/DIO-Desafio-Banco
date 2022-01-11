import java.awt.*;
import java.util.Scanner;
import static java.util.Objects.isNull;

public class Main {

//    private static int Menu() {
//        //System.out.println(System.lineSeparator().repeat(50));
//        System.out.println("\n\n\n----------------------------------------------------");
//        System.out.println("          ***  BANCO \"DAPRAÇA\"  *** ");
//        System.out.println("----------------------------------------------------");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("  1 = Criar Conta");
//        System.out.println("  2 = Depositar");
//        System.out.println("  3 = Sacar");
//        System.out.println("  4 = Transferir");
//        System.out.println("  5 = Saldo");
//        System.out.println("  6 = Extrato");
//        System.out.println("  0 = [SAIR]");
//        System.out.print("\nEntre com sua opção: ");
//        Integer opcao = sc.nextInt();
//        return opcao;
//
//    }
//
    public static void main(String[] args) {
//        Banco banco = new Banco();
//        int opcao;
//        do {
//
//            opcao = Menu();
//            if (opcao == 1){
//
//            }
//            else
//            if (opcao == 2){
//                System.out.println(banco.getNomeBanco());
//                if (  ) {
//                    System.out.println("CONTA AINDA NÃO FOI ABERTA!");
//                }
//            }
//
//
//        } while (opcao != 0);

        Cliente cliente_01 = new Cliente();
        cliente_01.setNome("Jorge Rosivan");

        Conta cc = new ContaCorrente(cliente_01);
        Conta cp = new ContaPoupanca(cliente_01);

        cc.mostrarSaldo();
        cp.mostrarSaldo();

        cc.depositar(250.00);
        cp.depositar(1321.75);

        cc.mostrarSaldo();
        cp.mostrarSaldo();

        cc.transferir(cp, 200);

        cc.mostrarSaldo();
        cp.mostrarSaldo();

    }
}
