package compra;

public class ItemCompra {

	private int codigo;
	private int quantidade;
	
	public ItemCompra(int codigo, int quantidade) {
		this.codigo = codigo;
		this.quantidade = quantidade;
		
		}
		
	public void Mostrar(){
		System.out.println(
			"Descrição: " + produto.getDescricao() +
			" Preço " + produto.getPreco() +
			" Quantidade " + getQuantidade() +
			" Subtotal " + obterSubtotal()
			
			);
		}
			
	public double obterSubtotal() {
		return produto.getPreco * quantidade;
	
	}

	public int getCodigo() {
		return codigo;
	}

	public int getQuantidade() {
		return quantidade;
	}
}
		
	
	