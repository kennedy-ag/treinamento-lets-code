package br.com.letscode.contas;

import java.math.BigDecimal;

import br.com.letscode.clientes.Cliente;

public class Conta {
    // Definição dos atributos/características
    private static int codigoGerado;
    private Cliente titular;
    private int numeroDaConta;
    private BigDecimal saldo;
    
    // Definição dos métodos/comportamentos
    
    public Conta(Cliente titular){
        this.titular = titular;
        this.saldo = BigDecimal.ZERO;
        this.numeroDaConta = Conta.codigoGerado;
        Conta.codigoGerado += 1;
    }

    public boolean sacar(double valor){
        if(this.saldo.compareTo(BigDecimal.valueOf(valor))==-1){
            System.out.println("Saldo insuficiente para a realização do saque.");
            return false;
        } else {
            this.saldo = this.saldo.subtract(BigDecimal.valueOf(valor));
            System.out.println("Saque realizado com sucesso.");
            return true;
        }
    }

    public void depositar(double valor){
        this.saldo = this.saldo.add(BigDecimal.valueOf(valor));
        System.out.println("Depósito realizado com sucesso.");
    }

    public void consultarSaldo(){
        System.out.println("O saldo da conta "+this.numeroDaConta+" é "+this.getSaldo());
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public int getNumeroDaConta() {
        return this.numeroDaConta;
    }

    public BigDecimal getSaldo() {
        return this.saldo;
    }

}