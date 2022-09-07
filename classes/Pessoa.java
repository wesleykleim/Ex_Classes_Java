package br.com.fiap.exercicio.classes;

public class Pessoa {

	//Atributos
	String nome;
	
	int idade;
	
	float altura;
	
	//Métodos
	void alterarNome(String novoNome) {
		nome = novoNome;
	}
	
	void alterarIdade(int novaIdade) {
		idade = novaIdade;
	}
	
	void alterarAltura(float novaAltura) {
		altura = novaAltura;
	}
	
	String recuperarNome() {
		return nome;
	}
	
	int recuperarIdade() {
		return idade;
	}
	
	float recuperarAltura() {
		return altura;
	}
	
}