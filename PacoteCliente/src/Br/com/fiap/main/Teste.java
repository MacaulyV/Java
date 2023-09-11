package Br.com.fiap.main;

import javax.management.openmbean.OpenDataException;
import javax.swing.JOptionPane;

import Br.com.fiap.beans.Cliente;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente objetoCliente = new Cliente();
		
		objetoCliente.setCpf("digite seu cpf:");
		objetoCliente.setNome("digite seu nome:");
		objetoCliente.setEndereco("digite seu endereco:");
		objetoCliente.setIdade("digite sua idade:");
	}

}
