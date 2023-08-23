package comprascartao.models;

import java.util.Scanner;

public class Menu {
    private Cartao cartao;

    public void showMenu(Cartao cartao) {
        this.cartao = cartao;
        Scanner scan = new Scanner(System.in);

        int op = 0;
        while (op != 2) {
            System.out.println("O que você gostaria de fazer?\n 1- Comprar\n 2- Encerrar compras.");
            op = scan.nextInt();
            if (op == 1) {
                System.out.println("Qual item que comprou: ");
                String item = scan.next();
                System.out.println("Qual o valor: ");
                double valor = scan.nextDouble();

                Item compra = new Item(item, valor);
                boolean validaCompra = cartao.lancaCompra(compra);

                if (validaCompra) {
                    System.out.println("Compra realizada! Seu saldo atual é de " + cartao.getSaldo() + "\n");
                } else {
                    System.out.println("Saldo insuficiente! Seu saldo atual é de " + cartao.getSaldo() + "\n");
                }
            }
        }
    }
}
