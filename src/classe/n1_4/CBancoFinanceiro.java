package classe.n1_4;

import java.util.Scanner;

public abstract class CBancoFinanceiro implements IBancoFinanceiro {
    Scanner leia = new Scanner(System.in);

    //atributos
    private double saldo;

    //constructor
    public CBancoFinanceiro(double saldo) {
        this.saldo = saldo;
    }

    //get e set
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //metodos
    public double Sacar(double Valor){
        System.out.println("Quanto você deseja Sacar? ");
        Valor = leia.nextDouble();
        if (getSaldo() >= Valor) {
            setSaldo(getSaldo() - Valor);
            System.out.println("Saque de R$" + Valor + " realizado com sucesso.");
            return this.getSaldo();
        } else {
            System.out.println("Saldo insuficiente.");
            return 0.0;
        }
    }

    public double Depositar(double Valor){
        System.out.println("Quanto você deseja depositar? ");
        Valor = leia.nextDouble();
        setSaldo(getSaldo() + Valor);
        System.out.println("O depósito de R$" + Valor + " foi realizado com sucesso.");
        return this.getSaldo();
    }

    public double Transferir(double Valor){
        System.out.println("Quanto você deseja Transferir? ");
        Valor = leia.nextDouble();
        if (getSaldo() >= Valor) {
            setSaldo(getSaldo() - Valor);
            System.out.println("Transferência de R$" + Valor + " foi realizado com sucesso.");
            return this.getSaldo();
        } else {
            System.out.println("Saldo insuficiente.");
            return 0.0;
        }
    }

    public void VerSaldo(){
        System.out.println("Você possui na sua conta: R$" + getSaldo() + " .");
    }

}