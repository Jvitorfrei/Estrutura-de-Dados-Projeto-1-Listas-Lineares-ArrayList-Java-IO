package compra;

public class ItemCompra {

	private Produto produto;
	private int quantidade;
	
	public ItemCompra(Produto produto, int quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;	
		}
		
	public void Mostrar() {
		System.out.printf( "%-20.30s | R$%2.2f \t| %d \t| R$%2.2f%n",
			produto.getDescricao(), 
			produto.getPreco(), 
			getQuantidade(), 
			obterSubtotal()
			);
		}
			
	public double obterSubtotal() {
		return produto.getPreco() * quantidade;
	}

	public int getCodigo() {
		return produto.getCodigo();
	}

	public int getQuantidade() {
		return quantidade;
	}
}
		
	
	