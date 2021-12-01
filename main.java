package sample;


import sample.model.Conta;
import sample.controller.ContaDAO;

public class Main {
    public static void main(String[]args){
        ContaDAO contas = new ContaDAO();
        contas.add("12334-45", "1122-3");
        contas.add("88998-23","4455-3");
        contas.add("98275-87","1144-3");
        contas.depositar("12334-45","1122-3",100);
        contas.depositar("88998-23","4455-3",100);
        contas.depositar("98275-87","1144-3",100);

        contas.sacar("12334-45","1122-3", 50 );
        contas.sacar("88998-23","4455-3", 50 );
        contas.sacar("98275-87","1144-3", 50 );

        System.out.println(contas);



//        System.out.println("Meu banco");
//        Conta conta = new Conta();
//        System.out.println();
//
//        Conta conta1 = new Conta();
//        System.out.println(conta);
//        conta1.setNumeroConta("12874");
//        conta1.setNumeroAgencia("09876");
//        conta1.depositar(100);

    }
}
