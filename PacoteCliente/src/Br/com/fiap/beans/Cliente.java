package Br.com.fiap.beans;

public class Cliente {
	// visibilidade, tipo de dado e variavel
private String nome;
private String cpf;
private int idade;
private double valor;
private Endereco endereco;
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	nome = nome;
}
public int getIdade() {
	return idade;
}
public void setIdade(int idade) {
	this.idade = idade;
}
public double getValor() {
	return valor;
}
public void setValor(double valor) {
	this.valor = valor;
}
public String getCpf() {
	return cpf;
}
public void setCpf(String cpf) {
	this.cpf = cpf;
}
public Endereco getEndereco() {
	return endereco;
}
public void setEndereco(Endereco endereco) {
	this.endereco = endereco;
}


}
