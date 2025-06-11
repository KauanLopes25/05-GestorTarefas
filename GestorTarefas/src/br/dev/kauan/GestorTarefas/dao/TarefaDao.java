package br.dev.kauan.GestorTarefas.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.dev.kauan.GestorTarefas.factory.ArquivoFuncionarioFactory;
import br.dev.kauan.GestorTarefas.model.Funcionario;
import br.dev.kauan.GestorTarefas.model.Tarefa;

public class TarefaDao {
	private Tarefa tarefa;
	ArquivoFuncionarioFactory aff = new ArquivoFuncionarioFactory();

	public TarefaDao() {
		gravarTarefa();
	}
	public TarefaDao(Tarefa tarefa) {
		this.tarefa = tarefa;
	}
	
	public boolean gravarTarefa() {
		try {
			BufferedWriter bw = aff.getBw();
			bw.write(tarefa.toString());
			bw.flush();
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
	
public List<Tarefa> getTarefa() {
		
		List<Tarefa> tarefas = new ArrayList<Tarefa>();

		try {
			BufferedReader br = aff.getBr();
			String linha = "";
			
			
			while (linha != null) {
				linha = br.readLine();
				
				if (linha != null) {
//					String [] tarefaVector = linha.split(",");
//					Funcionario funcionario = new Funcionario();
//					funcionario.setMatricula(funcionarioVector[0]);
//					funcionario.setNome(funcionarioVector[1]);
//					funcionario.setCargo(funcionarioVector[2]);
//					funcionario.setSetor(funcionarioVector[3]);
//					funcionario.setSalario(Double.parseDouble(funcionarioVector[4]));
//					funcionarios.add(funcionario);
				}
				
			}
			return tarefas;
			
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
}
