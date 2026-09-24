package compra;

public class ItemCompra {

	private Produto produto;
	private int quantidade;
	
	public ItemCompra(Produto produto, int quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;	
		}
		
	public void Mostrar(){
		System.out.println(
			produto.getDescricao() +"\t\t"+
			produto.getPreco() +"\t" +
			getQuantidade() +"\t" +
			obterSubtotal() +"\t"
			);
		}
			
	public double obterSubtotal() {
		return produto.getPreco() * quantidade;
	}

	public int getCodigo() {
		return codigo;
	}

	public int getQuantidade() {
		return quantidade;
	}
}
		
	
	