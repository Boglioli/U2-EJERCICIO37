public interface RedBlockchain {
    double verificarSaldo(String direccion);
    boolean ejecutarTransaccion(String origen, String destino, double monto);
}
