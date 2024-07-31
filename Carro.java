package concessionaria;

public class Carro extends Veiculo{
	private int capacidadedePassageiros;
	
	public Carro(String modelo, String marca, int ano, int capacidadedePassageiros) {
		super (modelo, marca, ano);
		this.capacidadedePassageiros = capacidadedePassageiros;
	}
	
	
	
	
	
	
	
	@Override
	public void exibirDetalhes() {
		// TODO Auto-generated method stub
		super.exibirDetalhes();
		System.out.println("capacidade de passageiros :" + capacidadedePassageiros);
	}







	public int getCapacidadedePassageiros() {
		return capacidadedePassageiros;
	}
	public void setCapacidadedePassageiros(int capacidadedePassageiros) {
		this.capacidadedePassageiros = capacidadedePassageiros;
	}
	
	
	
	
	
}
