public class RedBitcoin implements RedBlockchain {
    public double verificarSaldo(String direccion) {
        if (direccion == null || ! direccion.startsWith("btc")) {
            return 0;
        }
        return 2.5;
    }
    public boolean ejecutarTransaccion(String origen, String destino, double monto) {
        if (origen == null || destino == null || ! origen.startsWith("btc") || ! destino.startsWith("btc") || monto <= 0) {
    return false;
        }
        System.out.println("transaccion bitcoin confirmada");
return true;
    }
}
