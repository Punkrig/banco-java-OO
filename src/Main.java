//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        cc.depositar(100);
        Conta pp= new ContaPoupanca();
        cc.transferir(100, pp);
        cc.imprimirExtrato();
        pp.imprimirExtrato();
    }
}