
public class SucursalSur extends Factura {
    public SucursalSur(String documento, String nombre, double total) {
        super(documento, nombre, total);
    }

    @Override
    public double descuento() {
        return total * 0.10;
    }
}
