package br.com.ricardo.Conta;

public class Conta {
    int numero;
    String nome;
    double saldo;
    double limite;


    void sacar(double quantidade) {
        double novoSaldo = this.saldo - quantidade;
        this.saldo = novoSaldo;

    }

    public Conta() {// cria, manualmente, um construtor, não precisa ser criado.
        System.out.println("Criei um objeto Conta :)");
    }
    public Conta(String nome){
        this.nome=nome;

    }
    public Conta(int numero,String nome,double saldo,double limite){
        this.numero=numero;
        this.nome=nome;
        this.saldo=saldo;
        this.limite=limite;

    }
    public Conta(String nome,double saldo){
        this.numero= (int) (Math.random()*10000);
        this.nome=nome;
        this.saldo=saldo;
        this.limite=10000;

    }

}
