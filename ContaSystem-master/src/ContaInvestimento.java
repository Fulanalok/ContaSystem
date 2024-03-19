public class ContaInvestimento extends Conta {
    private double taxa;
    private int prazo;

    public ContaInvestimento (double taxa, int prazo) {
        this.taxa = taxa ;
        this.prazo = prazo ;
    }

    public boolean sacar(double valor) {
        if (getSaldo() >= valor) {
            double novoSaldo = getSaldo() - (valor * this.taxa);
            setSaldo(novoSaldo);
            return true;
        } else {
            return false;
        }
    }

    public boolean depositar(double valor) {
        if (valor >= 0) {
            double novoSaldo = getSaldo() + (valor * taxa);
            setSaldo(novoSaldo);
            return true;
        } else {
            return false;
        }
    }

    void aplicaRendimento(double  taxa) {
         setSaldo(getSaldo() + (1 * taxa));
        }
    }