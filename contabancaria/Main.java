package contabancaria;

public class Main {
    public static void main(String[] args) {
        Conta minhaConta = new Conta("Jorge Ricardo", 101, 100.0);
        minhaConta.informationAccount();
        minhaConta.withDraw(50.0);
        minhaConta.deposit(30.5);
    }
}
