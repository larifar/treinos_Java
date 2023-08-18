package contabancaria;

public class Main {
    public static void main(String[] args) {
        Conta minhaConta = new Conta("Jorge Ricardo", 101, 100.0);
        minhaConta.informationAccount();
        minhaConta.withDraw(50.0);

        Conta contaAna = new Conta("Ana Banana", 122, 200.0);
        minhaConta.transferAccount(contaAna, 50.0);
        contaAna.transferAccount(minhaConta, 100.0);
    }
}
