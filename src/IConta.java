public interface IConta {
    // interface:

    void sacar(double valor);
    void depositar(double valor);
    void transferir(Conta destino, double valor);
    void imprimirExtrato();
}
