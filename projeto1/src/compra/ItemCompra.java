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
			produto.getDescricao() +"\t\t"+
			produto.getPreco() +"\t" +
			getQuantidade() +"\t" +
			obterSubtotal() +"\t"
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
		
	
	