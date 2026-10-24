public class Main {
    public static void main(String[] args) {
        RedBlockchain red = new RedBitcoin();
        System.out.println("saldo btc: " + red.verificarSaldo("btc1"));
        red.ejecutarTransaccion("btc1", "btc2", 0.5);
        red = new RedEthereum();
        System.out.println("saldo eth: " + red.verificarSaldo("eth1"));
        red.ejecutarTransaccion("eth1", "eth2" , 1.0);
        red = new RedSolana();
        System.out.println("saldo sol: " + red.verificarSaldo("sol1"));
        red.ejecutarTransaccion("sol1", "sol2", 2.0);
    }
}
