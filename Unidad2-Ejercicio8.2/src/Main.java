public class Main {

    public static void main(String[] args) {

        ImpresoraFiscal impresora = new ImpresoraFiscal();
        CajaRegistradora caja = new CajaRegistradora(impresora);

        Factura factura = new Factura(1001, "Lucho");

        factura.agregarItem(new ItemFactura("Hamburguesa", 2, 8500));
        factura.agregarItem(new ItemFactura("Gaseosa", 2, 2500));
        factura.agregarItem(new ItemFactura("Papas fritas", 1, 3000));

        caja.cerrarVenta(factura);
    }
}