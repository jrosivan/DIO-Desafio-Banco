public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = Conta.SEQUENCIAL++;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }
    public int getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(Conta destino, double valor) {
        this.sacar(valor);
        destino.depositar(valor);
    }

    @Override
    public void mostrarSaldo() {
        System.out.println("--- Extrato Conta Corrente ---");
        System.out.println(String.format("Cliente..: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia..: %d", this.agencia));
        System.out.println(String.format("Conta CP.: %d", this.numero));
        System.out.println(String.format("Saldo..: %.2f", this.saldo));
    }

}
