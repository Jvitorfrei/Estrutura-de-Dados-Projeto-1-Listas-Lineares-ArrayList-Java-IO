import compra.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Produto> produtos = new ArrayList<>();
        ArrayList<ItemCompra> iC = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        String textoProdutos;

        try {
            textoProdutos = carregaTxtString("projeto1/produtos.txt");

            for (String linhaProduto : textoProdutos.split("\n")) {
                if (linhaProduto.trim().isEmpty()) {
                   continue;
                }

                String itens[] = linhaProduto.split(";");

                int cod = Integer.parseInt(itens[0]);
                String desc = itens[1];
                double preco = Double.parseDouble(itens[2]);

                Produto produto = new Produto(cod,desc,preco);
                produtos.add(produto);
                
            }

            while (true) {
                System.out.print("Digite o codigo do produto (0 pra sair): ");

                int cod = entradaInt(sc, 0);
                int index = buscaCodigo(produtos, cod);

                if (cod == 0) {
                    break;
                } else {
                    if (index == -1) {
                        System.out.println("Não foi encontrado um item com esse codigo!");
                    } else {
                        System.out.print("Digite a qtd: ");
                        int qtd = entradaInt(sc, 1);
                        iC.add(new ItemCompra(produtos.get(index), qtd)); 
                    }
                }
            }
            Carrinho c = new Carrinho(iC, 0.10); 
            c.mostrar();  
            sc.close();   

        } catch (IOException ex) {
            System.out.println("Erro ao tentar ler arquivo");
        }
    }

    public static int entradaInt(Scanner sc, int min) {
        int valor;
        while (true) {
            try {
                valor = Integer.parseInt(sc.nextLine().strip());
                if (valor >= min) {
                    return valor;
                }
                System.out.print("Valor precisa ser igual ou acima de "+min+": ");
            } catch (NumberFormatException ex) {
                System.out.print("Erro: Formato errado, digite apenas número: ");
            }
        }
    }

    public static int buscaCodigo(ArrayList<Produto> ps, int cod) {
        for (int i = 0; i < ps.size(); i++) {
            if (ps.get(i).getCodigo() == cod) {
                    return i; 
                }
            }
        return -1; 
    } 

    public static String carregaTxtString(String nomeArquivo) throws IOException {
        BufferedReader br = new BufferedReader(
                                new InputStreamReader(
                                    new FileInputStream(nomeArquivo)
                                )
                            );

        StringBuilder sb = new StringBuilder();
        while (true) {
            String line = br.readLine();
            if (line == null) {
                break;
            }
            sb.append(line).append('\n');

        }
        br.close();

        return sb.toString();
    }

}
