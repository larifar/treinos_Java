package comprascartao.models;

import java.util.ArrayList;
import java.util.List;

public class Cartao{
    private double limite;
    private double saldo;
    private List<Item> listaCompra;

    public Cartao(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.listaCompra = new ArrayList<>();
    }

    public boolean lancaCompra(Item item){
        if (this.saldo > item.getValor()){
            this.saldo -= item.getValor();
            this.listaCompra.add(item);
            return true;
        }
        return false;
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo(){
        return saldo;
    }

    public List<Item> getListaCompra() {
        return listaCompra;
    }
}
