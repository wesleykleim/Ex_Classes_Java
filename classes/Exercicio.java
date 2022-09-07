package br.com.fiap.exercicio.classes;

public class Exercicio {

	public static void main(String[] args) {
		//Instanciar o Elevador
		Elevador elevador = new Elevador();
		
		//Inicializar o total de andares e a capacidade
		elevador.inicializa(18, 6);
		
		//Subir um andar
		elevador.sobe();
		
		//Adicionar uma pessoa
		elevador.entra();
		
		//Exibir o andar atual e a qtd de pessoas no elevador
		System.out.println("Andar atual: " + elevador.andarAtual);
		System.out.println("Qtd de pessoas: " + elevador.quantidadePessoaAtual);
		
		//Exibir o total de andares e a capacidade
		System.out.println("Total andares: " + elevador.totalAndares);
		System.out.println("Capacidade: " + elevador.capacidade);
	}
}