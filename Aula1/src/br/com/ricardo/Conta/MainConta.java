package br.com.ricardo.Conta;

public class MainConta {
    public static void main(String [] args){
        Conta c =new Conta();
        c.nome ="Nome Aqui";
        System.out.println("O nome é: "+c.nome);

        Conta c2 =new Conta("Nome2");
        System.out.println("O nome é: "+c2.nome);
        System.out.println();

        Conta c3 =new Conta("Nome3",5000);
        System.out.println("O nome é: "+c3.nome);
        System.out.println("O numero é: "+c3.numero);
        System.out.println("O saldo é: "+c3.saldo);
        System.out.println("O limite é: "+c3.limite);
    }
}
