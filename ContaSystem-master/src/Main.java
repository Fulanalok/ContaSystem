public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        Conta conta2 = new Conta();
        Conta contaespecial = new Conta();
        Conta containvestimento = new Conta();
        conta1.numero = 1;
        conta1.saldo = 10000;
        conta1.depositar(10021);
        conta2.numero = 2;
        conta2.saldo = 20000;
        conta2.depositar(20021);
        contaespecial.numero = 3;
        contaespecial.saldo = 30000;
        contaespecial.depositar(30021);
        containvestimento.numero = 4;
        containvestimento.saldo = 40000;
        containvestimento.depositar(40021);

        System.out.println("Numero da conta 1:" + conta1.numero);
        System.out.println("Saldo do saldo 1:" + conta1.saldo);
        System.out.println("Numero da conta 2:" + conta2.numero);
        System.out.println("Saldo do saldo 2:" + conta2.saldo);
        System.out.println("Numero da contaEspecial:" + contaespecial.numero);
        System.out.println("Saldo da contaEspecial:" + contaespecial.saldo);
        System.out.println("Numero da contaInvestimento:" + containvestimento.numero);
        System.out.println("Saldo da contaInvestimento:" + containvestimento.saldo);
    }
}