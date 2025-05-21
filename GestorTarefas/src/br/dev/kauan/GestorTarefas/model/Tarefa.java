package br.dev.kauan.GestorTarefas.model;

import java.sql.DatabaseMetaData;
import java.time.LocalDate;

public class Tarefa {
	private String nome;
	private String descricao;
	private Funcionario responsavel;
	private LocalDate dataInicio;
	private int prazo;
	private LocalDate dataPrevistaEntrega;
	private DatabaseMetaData dateEntrega;
	private Status status;

	public Tarefa(Funcionario responsavel) {
		setResponsavel(responsavel);
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Funcionario getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Funcionario responsavel) {
		this.responsavel = responsavel;
	}

	public LocalDate getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}

	public int getPrazo() {
		return prazo;
	}

	public void setPrazo(int prazo) {
		this.prazo = prazo;
	}

	public LocalDate getDataPrevistaEntrega() {
		//PlusDays é um método da classe LocalDate utilziada para somar uma data
		return dataInicio.plusDays(prazo);
	}

	public DatabaseMetaData getDateEntrega() {
		return dateEntrega;
	}

	public void setDateEntrega(DatabaseMetaData dateEntrega) {
		this.dateEntrega = dateEntrega;
	}

//	public Status getStatus() {
//		LocalDate hoje = LocalDate.now();
//		
//		if (hoje.isEqual(dataInicio)) {
//			
//			Status emAndamento = Status.EM_ANDAMENTO;
//			
//		}
//		
//		return status;
//	}
}
