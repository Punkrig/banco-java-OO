public abstract class Conta implements IConta {
    protected int agencia;
    protected int numero;
    protected double saldo;
    private static int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    public Conta(){
        this.agencia=Conta.AGENCIA_PADRAO;
        this.numero= SEQUENCIAL++;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void depositar(double valor) {
        this.saldo+=valor;
    }

    @Override
    public void sacar(double valor) {
        this.saldo-=valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
    protected void imprimirInfosComuns() {
        System.out.println(String.format("Saldo atual: R$ %.2f", this.saldo));
        System.out.println("---------------------------------------");
        System.out.println(String.format("Agencia %d", this.agencia));
        System.out.println("---------------------------------------");
        System.out.println(String.format("Numero %d", this.numero));
    }
}
