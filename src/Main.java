public class Main {

    public static void main(String[] args) {

        Cliente cliente_01 = new Cliente();
        cliente_01.setNome("Jorge Rosivan");

        Conta cc = new ContaCorrente(cliente_01);
        Conta cp = new ContaPoupanca(cliente_01);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        cc.depositar(250.00);
        cp.depositar(1321.75);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        cc.transferir(cp, 200);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

    }
}
