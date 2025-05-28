package br.dev.kauan.GestorTarefas.model;

import br.dev.kauan.GestorTarefas.utils.Utils;

public class Funcionario {
	private String nome;
	private String cargo;
	private String setor;
	private String matricula;
	private double salario;

	//Construtores do objeto Funcionário
	public Funcionario() {
		System.out.println("Criando um Funcionário...");
	}
	public Funcionario(String nome) {
		System.out.println("Criando um Funcionário "+nome);
		setNome(nome);
		setMatricula(Utils.gerarUUID8());
	}
	public Funcionario(String nome, String cargo) {
		setNome(nome);
		setCargo(cargo);
		setMatricula(Utils.gerarUUID8());
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	@Override // sobreescrevendo um método de outra classe, e marcando override como anotação de sobreescrita.
	public String toString() {
		// TODO Auto-generated method stub
		//System.out.println("Este é o meu toString()");
		//return super.toString();
		return matricula+","+nome+","+cargo+","+setor+","+salario+"\n";
	}
}
