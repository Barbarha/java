package concessionaria;

import java.util.ArrayList;
import java.util.Scanner;

public class GestaoVeiculo {
	private ArrayList<Veiculo> veiculos;
	private Scanner scanner;
	
	
	public GestaoVeiculo() {
		veiculos = new ArrayList<>();
		scanner = new Scanner(System.in);
	}

	public void iniciar() {
	int opcao;
	
	do {
		System.out.println("\nMenu");
		System.out.println("1- Adicionar carro");
		System.out.println("2- Adicionar motocicleta");
		System.out.println("3- Vizualizar detalhes dp veiculo");
		System.out.println("4- Sair");
		System.out.println("Escolha uma opçao: ");
		opcao = scanner.nextInt();
		
		switch(opcao) {
		case 1:
			adicionarCarro();
			break;
		case 2:
			adicionarMotocicleta();
			break;
		case 3: 
			vizualizarDetalhesVeiculos();
			break;
		case 4:
			System.out.println("Obrigada por usar o sistema de gestao de veiculos");
			break;
		default: 
			System.out.println("opçao invalida! tente novamente");
			
			}
	
		}while (opcao != 4);
	
	}
 	 private void adicionarCarro() {
 		System.out.println("Digite o modelo do carro: ");
 		String modelo = scanner.next();
 		System.out.println("Digite a marca do carro: ");
 		String marca = scanner.next();
 		System.out.println("Digite o ano do carro: ");
 		int ano = scanner.nextInt();
 		System.out.println("Digite a capacidade de passageiros: ");
 		int capacidadePassageiros = scanner.nextInt();
 		
 		Carro novoCarro = new Carro(modelo, marca, ano, capacidadePassageiros);
 		veiculos.add(novoCarro);
 		
 		System.out.println("Veiculo adicionado com sucesso!");
 	
 	 }
 	 private void adicionarMotocicleta() {
  		System.out.println("Digite o modelo da moto: ");
  		String modelo = scanner.next();
  		System.out.println("Digite a marca da moto: ");
  		String marca = scanner.next();
  		System.out.println("Digite o ano da moto: ");
  		int ano = scanner.nextInt();
  		System.out.println("Digite o todo do guidão: ");
  		String tipoGuidao = scanner.next();
  		
  		Motocicleta moto = new Motocicleta(modelo, marca, ano, tipoGuidao);
  		veiculos.add(moto);
  		
  		System.out.println("Veiculo adicionado com sucesso!");
  	
  	 }
 	 
 	 
 	 private void vizualizarDetalhesVeiculos() {
 		 if(veiculos.isEmpty()) {
 			System.out.println("Nenhum veiculo disponivel!");
 			return;
 			
 			
 		 }
 		 
 		 for (Veiculo veiculo: veiculos) {
 			 veiculo.exibirDetalhes();
 			System.out.println("----------------------");
 		 }
 	 }
 		
 	}



