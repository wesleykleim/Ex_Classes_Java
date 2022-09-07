package br.com.fiap.exercicio.classes;

public class Elevador {
	
	//Atributos
	int andarAtual, totalAndares, capacidade, quantidadePessoaAtual;
	
	//Métodos
	void inicializa(int andares, int capacidade) {
		totalAndares = andares;
		this.capacidade = capacidade;
	}
	
	void sobe() {
		andarAtual++;
	}
	
	void desce() {
		andarAtual--;
	}
	
	void entra() {
		quantidadePessoaAtual++;
	}
	
	void sai() {
		quantidadePessoaAtual--;
	}
}
