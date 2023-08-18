package contabancaria;

public class Conta {
    private int numberAccount;
    private String holderAccount;
    private double balanceAccount;

    public Conta(String name, int number, double value){
        this.holderAccount = name;
        this.numberAccount = number;
        this.balanceAccount = value;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public String getHolderAccount() {
        return holderAccount;
    }

    public double getBalanceAccount() {
        return balanceAccount;
    }

    //pegar informações da conta
    public void informationAccount(){
        System.out.println("*******************************************");
        System.out.println("Nome do titular: " + getHolderAccount());
        System.out.println("\nNúmero da conta: " + getNumberAccount());
        System.out.println("\nSaldo atual: " + getBalanceAccount());
        System.out.println("*******************************************");
    }

    //sacar dinheiro
    public void withDraw(double value){
        if (value > this.getBalanceAccount()){
            System.out.println("Saldo insuficiente.");
            System.out.println("*******************************************");
        } else {
            this.balanceAccount -= value;
            System.out.println("\nSaldo atualizado: " + getBalanceAccount());
            System.out.println("*******************************************");
        }
    }

    //depositar dinheiro
    public void deposit(double value){
        this.balanceAccount += value;
        System.out.println("\nSaldo atualizado: " + getBalanceAccount());
        System.out.println("*******************************************");
    }

}
