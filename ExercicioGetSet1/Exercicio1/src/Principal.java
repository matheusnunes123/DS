
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// metodo construtor para definir valores iniciais
		Animal ani = new Animal(4,"Gato",10.00);
		
		//imprimindo os valores iniciais
		ani.imprimir();
		
		// setando a especie
		ani.setEspecie("Cachorro");
		
		//setando o peso   
		ani.setPeso(25.00);
		
		//setando a quantidade de patas
		ani.setQtdePatas(4);
		
		//imprimindo os novos valores
		ani.imprimir();
	}

}
