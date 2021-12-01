package sample.model;

public class Conta {

    private String numeroAgencia;
    private String numeroConta;
    private Double saldo;

    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(String numeroAgencia) { this.numeroAgencia = numeroAgencia; }
    public String getNumeroConta() { return numeroConta; }
    public void setNumeroConta(String numeroConta) { this.numeroConta = numeroConta; }
    public Double getSaldo() { return saldo; }
    public void depositar(double valor){
        this.saldo += valor;
    }
    public double sacar (double valor) {
        if (this.saldo >=valor) {
            this.saldo -= valor;
            return valor;

        } else {
            return 0;

        }
    }

    @Override
    public String toString(){
        return "Agência: " +numeroAgencia
                + "Conta Corrente: " + numeroConta
                + "Saldo " + saldo;
    }
}
