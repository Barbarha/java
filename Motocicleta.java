package concessionaria;

public class Motocicleta  extends Veiculo{
	private String tipoGuidao;
	

	public Motocicleta(String modelo, String marca, int ano, String tipoGuidao) {
		super(modelo, marca, ano);
		this.tipoGuidao = tipoGuidao;	
	}

	
	

	@Override
	public void exibirDetalhes() {
		// TODO Auto-generated method stub
		super.exibirDetalhes();
		System.out.println("tipoGuidao: " + tipoGuidao);
	}




	public String getTipoGuidao() {
		return tipoGuidao;
	}


	public void setTipoGuidao(String tipoGuidao) {
		this.tipoGuidao = tipoGuidao;
	}
	
	

}
