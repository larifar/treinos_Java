package comprascartao;

import comprascartao.models.Cartao;
import comprascartao.models.Item;
import comprascartao.models.Menu;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o limite do cartão? ");
        double limite = scan.nextDouble();
        Cartao cartaoCredito = new Cartao(limite);
        Menu menu = new Menu();

        menu.showMenu(cartaoCredito);

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
