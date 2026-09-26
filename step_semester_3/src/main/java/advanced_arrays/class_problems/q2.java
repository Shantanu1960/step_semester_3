package advanced_arrays.class_problems;

public class q2 {

    public static void main(String[] args) {
        MessWallet wallet = new MessWallet(500);

        wallet.topUp(200);
        System.out.println("Balance after top-up: " + wallet.getBalance());

        wallet.deduct(1000);
        System.out.println("Final balance: " + wallet.getBalance());
    }
}