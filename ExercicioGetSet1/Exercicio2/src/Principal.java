
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produto p = new Produto();
		
		// setar nome
		p.setNome("a�ucar");
		// setar o pre�o de custo
		p.setPrecoCusto(15.00);
		
		// setar o pre�o de venda
		//obs: tem que ser maior que o custo
		p.setPrecoVenda(30.00);
		
		if(p.getPrecoCusto()>=p.getPrecoVenda()) {
			// Finalizada as opera��es
		}else {
			//calculo da margem de lucro
			p.calcularMargemLucro();
			
			//apresenta��o das informa��es do produto
			p.informacoesProduto();
			
		}
	}

}
