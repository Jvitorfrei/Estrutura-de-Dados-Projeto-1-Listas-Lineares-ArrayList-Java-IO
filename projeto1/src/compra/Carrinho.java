package compra;
import java.util.ArrayList;

public class Carrinho {
    private ArrayList<ItemCompra> listaItens;
    private double porcentagemDesconto;

    public Carringo(ArrayList itens, double desc) {
        listaItens = itens;
        porcentagemDesconto = desc;
    }

    public void mostrar() {
        System.out.println("\tItem\t\tPreço\tQuantidade");
        for (int i=0; i<listaItens.size(); i++) {
            System.out.println((i+1)+"\t"+ListaItens[i].mostrar());
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
        return subTotal;
    }

    public double obterValorDesconto() {
        return obterSubtotal() * porcentagemDesconto;
    }

    public double obterTotal() {
        return (obterSubtotal() - obterValorDesconto());
    }
}
