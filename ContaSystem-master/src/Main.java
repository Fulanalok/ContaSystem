

public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        Conta conta2 = new Conta();
        Conta contaespecial = new Conta();
        Conta containvestimento = new Conta();
        conta1.setNumero(1021);
        conta1.setSaldo(3000);
        conta1.depositar(10021);
        conta2.setNumero(2021);
        conta2.setSaldo(5000);
        conta2.depositar(20021);
        contaespecial.setNumero(3021);
        contaespecial.setSaldo(7000);
        contaespecial.depositar(30021);
        containvestimento.setNumero(4021);
        containvestimento.setSaldo(9000);
        containvestimento.depositar(40021);

        System.out.println("Numero da conta 1:" + conta1.getNumero());
        System.out.println("Saldo do saldo 1:" + conta1.getSaldo());
        System.out.println("Numero da conta 2:" + conta2.getNumero());
        System.out.println("Saldo do saldo 2:" + conta2.getSaldo());
        System.out.println("Numero da contaEspecial:" + contaespecial.getNumero());
        System.out.println("Saldo da contaEspecial:" + contaespecial.getSaldo());
        System.out.println("Numero da contaInvestimento:" + containvestimento.getNumero());
        System.out.println("Saldo da contaInvestimento:" + containvestimento.getSaldo());
    }
}