public class ContaInvestimento extends Conta {
    double taxa;
    int prazo;

    boolean sacar(double valor) {
        if (this.taxa >= valor) {
            this.taxa -= valor;
            return true;
        } else {
            return false;
        }
    }

    boolean depositar(double valor) {
        if (valor >= 0) {
            this.taxa += valor;
            return true;
        } else {
            return false;
        }
    }

    void aplicaRendimento(double taxaRendimento) {
        if (this.taxa >= 0) {
            this.taxa += this.taxa * taxaRendimento;
        }
    }
}
