
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produto p = new Produto();
		
		// setar nome
		p.setNome("açucar");
		// setar o preço de custo
		p.setPrecoCusto(15.00);
		
		// setar o preço de venda
		//obs: tem que ser maior que o custo
		p.setPrecoVenda(30.00);
		
		if(p.getPrecoCusto()>=p.getPrecoVenda()) {
			// Finalizada as operações
		}else {
			//calculo da margem de lucro
			p.calcularMargemLucro();
			
			//apresentação das informações do produto
			p.informacoesProduto();
			
		}
	}

}
