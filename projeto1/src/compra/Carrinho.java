package compra;
import java.util.ArrayList;

public class Carrinho {
    private ArrayList<ItemCompra> listaItens;
    private Double porcentagemDesconto;

    public Carringo(ArrayList itens, Double desc) {
        listaItens = itens;
        porcentagemDesconto = desc;
    }

    public void mostrar() {
        for (int i=0; i<listaItens.size(); i++) {
            ListaItens[i].mostrar();
        }

        System.out.println("Subtotal: "+ obterSubtotal());

    }

    public Double obterSubtotal() {
        Double subtotal = 0;
        for (ItemCompra ic : listaItens) {
            subtotal += ic.obterSubtotal();
        }

        return subTotal;
    }

    public Double obterValorDesconto() {
        return obterSubtotal() * porcentagemDesconto;
    }

    public Double obterTotal() {
        return (obterSubtotal() - obterValorDesconto());
    }
}
