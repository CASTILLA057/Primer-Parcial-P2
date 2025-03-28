
class SucursalNorte extends Factura {
    public SucursalNorte(String documento, String nombre, double total) {
        super(documento, nombre, total);
    }

    @Override
    public double descuento() {
        return total > 300000 ? total * 0.30 : 0;
    }
}
