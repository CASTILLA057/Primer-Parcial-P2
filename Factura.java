public class Factura {
    protected String documento;
    protected String nombre;
    protected double total;

    public Factura(String documento, String nombre, double total) {
        this.documento = documento;
        this.nombre = nombre;
        this.total = total;
    }

    public double descuento() {
        return 0;
    }

    public double totalConDescuento() {
        return total - descuento();
    }

    @Override
    public String toString() {
        return documento + ", " + nombre + ", valor original: " + total + ", valor con descuento: " + totalConDescuento();
    }
}
