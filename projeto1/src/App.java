import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import compra.Carrinho;
import compra.ItemCompra;
import compra.Produto;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Produto> produtos = new ArrayList<>();
        
        String textoProdutos;

        try {
            textoProdutos = carregaTxtString("produtos.txt");
            for (Produto p:produtos) {
            System.out.println(p);
        }

        for (String linhaProduto : textoProdutos.split("\n")) {
            String itens[] = linhaProduto.split(";");

            int cod = Integer.parseInt(itens[0]);
            String desc = itens[1];
            double preco = Double.parseDouble(itens[2]);


            Produto produto = new Produto(cod,desc,preco);
            produtos.add(produto);
        }
        
        } catch (Exception e) {
            System.out.println("Erro ao tentar ler arquivo");
        }

        ArrayList<ItemCompra> ics = new ArrayList<>();
        for (Produto p:produtos){
            ics.add(new ItemCompra(p, 10));
        }   

        Carrinho c = new Carrinho(ics, 0.10);
        c.mostrar();
        
    }

    public static String carregaTxtString(String nomeArquivo) throws Exception {
        InputStream is = new FileInputStream(nomeArquivo);
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        StringBuilder sb = new StringBuilder();
        while (true) {
            String line = br.readLine();
            if (line == null) {
                break;
            }
            sb.append(line).append('\n');

        }
        is.close();

        return sb.toString();
    }

}
