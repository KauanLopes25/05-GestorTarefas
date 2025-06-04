package br.dev.kauan.GestorTarefas.dao;

import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;

import br.dev.kauan.GestorTarefas.factory.ArquivoFuncionarioFactory;
import br.dev.kauan.GestorTarefas.model.Funcionario;

public class FuncionarioDAO {
	private Funcionario funcionario;
	ArquivoFuncionarioFactory aff = new ArquivoFuncionarioFactory();

	public FuncionarioDAO(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public boolean gravar() {
		try {
			BufferedWriter bw = aff.getBw();
			bw.write(funcionario.toString());
			bw.flush();
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	public List<Funcionario> getFuncionarios() {
		
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();

		try {
			BufferedReader br = aff.getBr();
			String linha = "";
			
			
			while (linha != null) {
				linha = br.readLine();
				
				if (linha != null) {
					String [] funcionarioVector = linha.split(",");
					Funcionario funcionario = new Funcionario();
					funcionario.setMatricula(funcionarioVector[0]);
					funcionario.setNome(funcionarioVector[1]);
					funcionario.setCargo(funcionarioVector[2]);
					funcionario.setSetor(funcionarioVector[3]);
					funcionario.setSalario(Double.parseDouble(funcionarioVector[4]));
					funcionarios.add(funcionario);
				}
				
			}
			return funcionarios;
			
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
}
