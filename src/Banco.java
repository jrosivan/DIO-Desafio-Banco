import java.sql.ClientInfoStatus;
import java.util.List;

public class Banco {

    private static final String NOME_BANCO = "BANCO DAPRAÇA";

    private List<Conta> contas;

    public String getNomeBanco() {
        return NOME_BANCO;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public List<Conta> getContas() {
        return contas;
    }
}
