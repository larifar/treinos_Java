package comprascartao;

import comprascartao.models.Cartao;
import comprascartao.models.Item;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o limite do cartão? ");
        double limite = scan.nextDouble();
        Cartao cartaoCredito = new Cartao(limite);

        int op = 0;
        while (op!=2) {
            System.out.println("O que você gostaria de fazer?\n 1- Comprar\n 2- Encerrar compras.");
            op = scan.nextInt();
            if (op==1){
                System.out.println("Qual item que comprou: ");
                String item = scan.next();
                System.out.println("Qual o valor: ");
                double valor = scan.nextDouble();

                Item compra = new Item(item, valor);
                boolean validaCompra = cartaoCredito.lancaCompra(compra);

                if (validaCompra){
                    System.out.println("Compra realizada! Seu saldo atual é de " + cartaoCredito.getSaldo() +"\n");
                } else {
                    System.out.println("Saldo insuficiente! Seu saldo atual é de " + cartaoCredito.getSaldo() +"\n");
                }
            }

        }
        System.out.println("*************************************");
        System.out.println("Resumo de Compras: \n");
        Collections.sort(cartaoCredito.getListaCompra());
        for (Item c : cartaoCredito.getListaCompra()) {
            System.out.println(c.getDescricao() + " - " + c.getValor());
        }
        System.out.println("*************************************");
        System.out.println("Saldo do cartão: " + cartaoCredito.getSaldo());

    }
}
