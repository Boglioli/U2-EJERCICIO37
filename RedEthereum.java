public class RedEthereum implements RedBlockchain{
    public double verificarSaldo(String direccion) {
        if (direccion == null || ! direccion.startsWith("eth")) {
            return 0;
        }
        return 5.0;
    }
    public boolean ejecutarTransaccion(String origen, String destino, double monto) {
        if (origen == null || destino == null || ! origen.startsWith("eth") || ! destino.startsWith("eth") || monto <= 0) {
            return false;
        }
        System.out.println("transaccion ethereum confirmada");
        return true;
    }
}

