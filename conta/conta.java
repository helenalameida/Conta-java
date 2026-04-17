package model;

public class Conta {
    

    private int numero;
    private String titular;
    private double saldo;

    public Conta(int numero) {
        this.numero = numero;
        this.titular = "Desconhecido";
        this.saldo = 0.0;
    })
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("✅ Depósito de R$ " + valor + " realizado com sucesso!");
        } else {
            System.out.println("❌ Erro: O valor do depósito deve ser positivo.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0) {
            if (valor <= this.saldo) {
                this.saldo -= valor;
                System.out.println("✅ Saque de R$ " + valor + " realizado!");
            } else {
                System.out.println("❌ Erro: Saldo insuficiente.");
            }
        } else {
            System.out.println("❌ Erro: O valor do saque deve ser positivo.");
        }
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        if (Validacoes.isTextoValido(titular)) {
            this.titular = titular;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Conta [Número=" + numero + ", Titular=" + titular + ", Saldo= R$ " + saldo + "]";
    }
}