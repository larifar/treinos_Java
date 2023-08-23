package comprascartao.models;

public class Item implements Comparable<Item>{
    private String descricao;
    private double valor;

    public Item(String descricao, double valor){
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor(){
        return valor;
    }

    @Override
    public String toString() {
        return "Item: descrição = " + descricao + ", valor = " + valor;
    }

    @Override
    public int compareTo(Item outroItem) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(outroItem.valor));
    }
}
