import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Factura> sucursalSur = new ArrayList<>();
        sucursalSur.add(new SucursalSur("12345", "Santiago", 200000));
        sucursalSur.add(new SucursalSur("67890", "Castilla", 500000));

        List<Factura> sucursalNorte = new ArrayList<>();
        sucursalNorte.add(new SucursalNorte("54321", "Coronel", 400000));
        sucursalNorte.add(new SucursalNorte("09876", "Danna", 250000));

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        while (true) {
            System.out.println("1. Ver facturas registradas por cada sucursal");
            System.out.println("2. Ver total facturado por cada sucursal");
            System.out.println("3. Ver reporte general");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opción: ");
            
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("--------------------------------------");
                    mostrarFacturasSucursales(sucursalSur, "Sucursal Sur");
                    System.out.println("--------------------------------------");
                    mostrarFacturasSucursales(sucursalNorte, "Sucursal Norte");
                    System.out.println("--------------------------------------");
                    break;
                case 2:
                    System.out.println("--------------------------------------");
                    System.out.println("Total facturado en Sucursal Sur: " + totalFacturadoSucursale(sucursalSur));
                    System.out.println("--------------------------------------");
                    System.out.println("Total facturado en Sucursal Norte: " + totalFacturadoSucursale(sucursalNorte));
                    System.out.println("--------------------------------------");
                    break;
                case 3:
                    System.out.println("--------------------------------------");
                    System.out.println("Total facturado en todas las sucursales: " + (totalFacturadoSucursale(sucursalSur) + totalFacturadoSucursale(sucursalNorte)));
                    System.out.println("--------------------------------------");
                    break;
                case 4:
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción incorrecta, intente de nuevo!");
            }
        }
    }

    public static void mostrarFacturasSucursales(List<Factura> facturas, String nombreSucursal) {
        System.out.println("" + nombreSucursal + ":");
        for (Factura factura : facturas) {
            System.out.println(factura);
        }
    }

    public static double totalFacturadoSucursale(List<Factura> facturas) {
        double total = 0;
        for (Factura factura : facturas) {
            total += factura.totalConDescuento();
        }
        return total;
    }
}
