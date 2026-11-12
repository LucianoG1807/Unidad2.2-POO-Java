import java.util.ArrayList;

public class Factura {

    private int numero;
    private String cliente;
    private ArrayList<ItemFactura> items;

    public Factura(int numero, String cliente) {
        this.numero = numero;
        this.cliente = cliente;
        this.items = new ArrayList<>();
    }

    public void agregarItem(ItemFactura item) {
        items.add(item);
    }

    public int getNumero() {
        return numero;
    }

    public String getCliente() {
        return cliente;
    }

    public ArrayList<ItemFactura> getItems() {
        return new ArrayList<>(items);
    }

    public double calcularTotal() {
        double total = 0;

        for (ItemFactura item : items) {
            total += item.calcularSubtotal();
        }

        return total;
    }
}