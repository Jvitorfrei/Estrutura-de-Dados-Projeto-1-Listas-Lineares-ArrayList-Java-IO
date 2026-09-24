package compra;
import java.util.ArrayList;

public class Carrinho {
    private ArrayList<ItemCompra> listaItens;
    private double porcentagemDesconto;

    public Carrinho(ArrayList itens, double desc) {
        listaItens = itens;
        porcentagemDesconto = desc;
    }

    public void mostrar() {
        System.out.println("\tItem\t\tPreço\tQuantidade");
        for (int i=0; i<listaItens.size(); i++) {
            listaItens.get(i).Mostrar();
        }

        System.out.println("Subtotal: " + obterSubtotal());
        System.out.println("Desconto: " + obterValorDesconto());
        System.out.println("Total: "+ obterTotal());
    }

    public double obterSubtotal() {
        double subtotal = 0;
        for (ItemCompra ic : listaItens) {
            subtotal += ic.obterSubtotal();
        }
        return subtotal;
    }

    public double obterValorDesconto() {
        return obterSubtotal() * porcentagemDesconto;
    }

    public double obterTotal() {
        return (obterSubtotal() - obterValorDesconto());
    }
}
