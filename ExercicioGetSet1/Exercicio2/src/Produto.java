import java.text.DecimalFormat;
public class Produto {
	// definição de todos os atributos da classe
	private String nome;
	private double precoCusto;
	private double precoVenda;
	private double margemLucro;
	
	//instanciando metodo DecimalFormat, para formatar 
	// valores decimais que podem virar dizima
	DecimalFormat df = new DecimalFormat("00.00");
	
	// metodo get do nome do produto
	public String getNome() {
		return nome;
	}
	
	//metodo para setar o nome do produto
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//metodo get do preco de custo do produto
	public double getPrecoCusto() {
		return precoCusto;
	}
	
	//metodo para setar o preço de custo do produto
	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}
	
	// metodo get para o preco da venda;
	public double getPrecoVenda() {
		return precoVenda;
	}
	
	// metodo de Set de precoVenda
	// obs: caso os usuários coloquem um preço menor
	// os outros metodos não funcionaram, sendo necessária
	// a mudança do valor no parâmetro e a reinicialização do programa
	public void setPrecoVenda(double precoVenda) {
		
		if(precoVenda>this.precoCusto) {
			this.precoVenda = precoVenda;
		}else {
			System.out.println("O preço da venda é igual ou menor ao do custo, Modifique-o");
			System.out.println("e reinicie o programa");
		}
		
	}
	
	// metodo get da margem de lucro
	public double getMargemLucro() {
		return margemLucro;
	}
	
	// metodo de calculo da margem de lucro
	public void calcularMargemLucro() {
		this.margemLucro = this.precoVenda - this.precoCusto;
	}
	
	
	// Metodo para calcular o percentual da margem de lucro
	// Onde pegamos 1% do preço do produto e vemos
	// quantas vezes isso cabe na margem apartir da divisão
	
	public double getMargemLucroPercentual() {
		return margemLucro/(precoCusto/100);
	}
	
	// Metodo para retornar todas as informações do produto
	public void informacoesProduto() {
		System.out.println("Nome do produto: "+this.getNome());
		System.out.println("Valor do custo do produto: R$"+this.getPrecoCusto());
		System.out.println("Valor de venda do produto: R$"+this.getPrecoVenda());
		System.out.println("Margem de lucro do produto: R$"+df.format(this.getMargemLucro()));
		System.out.println("Percentual da margem de lucro: "+df.format(this.getMargemLucroPercentual())+"%");
	}
	
}
