
public class Animal {
	
	//definindo os atributos da classe
	private int qtdePatas;
	private String especie;
	private double peso;
	
	// metodo construtor
	public Animal(int qtdePatas, String especie,double peso) {
		this.qtdePatas = qtdePatas;
		this.especie = especie;
		this.peso = peso;
	}
	
	// metodo get para pegar a quantidade de patas
	public int getQtdePatas() {
		return qtdePatas;
	}
	
	//metodo para setar a quantidade de patas
	public void setQtdePatas(int qtdePatas) {
		this.qtdePatas = qtdePatas;
	}
	
	//metodo get para retornar a especie
	public String getEspecie() {
		return especie;
	}
	
	//metodo para setar a especie
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	//metodo get para retornar o peso
	public double getPeso() {
		return peso;
	}
	
	// metodo para setar o peso
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	// metodo para inprimir todas as informações
	public void imprimir() {
		System.out.println("Especie: "+this.getEspecie());
		System.out.println("Quantidade de Patas: "+this.getQtdePatas());
		System.out.println("Peso : "+this.getPeso());
		System.out.println("");
	}
	
}
