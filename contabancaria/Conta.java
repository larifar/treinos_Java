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

    public void informationBalance(){
        System.out.println("Saldo da conta atual: " + getBalanceAccount());
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
    public boolean withDraw(double value){
        if (value > this.getBalanceAccount()){
            System.out.println("Saldo insuficiente.");
            System.out.println("\n*******************************************");
            return false;
        } else {
            this.balanceAccount -= value;
            System.out.println("Saldo da conta " + getNumberAccount() + " atualizado.");
            this.informationBalance();
            System.out.println("\n*******************************************");
            return true;
        }
    }

    //depositar dinheiro
    public boolean deposit(double value){
        this.balanceAccount += value;
        System.out.println("Saldo da conta " + getNumberAccount() + " atualizado.");
        this.informationBalance();
        System.out.println("\n*******************************************");
        return true;
    }

    //transferenica entre contas
    public boolean transferAccount(Conta account, double value) {
        if (value > 0) {
            boolean take = this.withDraw(value);
            if (take == true) {
                account.deposit(value);
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

}
