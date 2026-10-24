public class RedSolana implements RedBlockchain{
    public double verificarSaldo(String direccion) {
        if (direccion == null || ! direccion.startsWith("sol")) {
            return 0;
        }
        return 10.0;
    }
    public boolean ejecutarTransaccion(String origen, String destino, double monto) {
        if (origen == null || destino == null || ! origen.startsWith("sol") || ! destino.startsWith("solana") || monto <= 0) {
            return false;
        }
        System.out.println("transaccion solana confirmada");
        return true;
    }
}

