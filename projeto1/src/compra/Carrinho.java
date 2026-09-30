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
        int n = listaItens.size();

        int tam = 0;
        long temp = 1;
        while (temp <= n) {
            tam++;
            temp *= 10;
        }
        
        String dis = "%0"+tam+"d ";


        System.out.println("=========================================================================");
        System.out.printf("%-2.2s"+"| %-40.40s | %-8.8s | %-4.4s | %s %n", " ","Item","Valor","Qtd","Total");

        for (int i=0; i<n; i++) {
            System.out.printf(dis, (i+1));
            listaItens.get(i).Mostrar();
        }

        System.out.println("-------------------------------------------------------------------------");
        System.out.printf("\t\t\t\t\t\tSubtotal: R$% 2.2f%n" , obterSubtotal());
        System.out.printf("\t\t\t\t\t\tDesconto: R$% 2.2f%n" , obterValorDesconto());
        System.out.printf("\t\t\t\t\t\tTotal:    R$ %2.2f%n", obterTotal());
        System.out.println("=========================================================================");
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
