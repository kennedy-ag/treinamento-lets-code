package br.com.letscode;

import br.com.letscode.clientes.Cliente;
import br.com.letscode.contas.Conta;

public class App {
    public static void main( String[] args ) {
        // Definições
        Cliente luany = new Cliente("Luany Fernanda", 21);
        Cliente kennedy = new Cliente("Kennedy", 21);
        Conta contaDaLuany = new Conta(luany);
        Conta contaDoKennedy = new Conta(kennedy);

        // Operações
        contaDaLuany.depositar(40.1);
        contaDaLuany.sacar(15);
        contaDaLuany.consultarSaldo();
        contaDoKennedy.consultarSaldo();
    }
}
