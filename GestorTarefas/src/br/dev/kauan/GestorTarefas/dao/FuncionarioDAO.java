package br.dev.kauan.GestorTarefas.dao;

import java.io.BufferedWriter;

import br.dev.kauan.GestorTarefas.factory.ArquivoFuncionarioFactory;
import br.dev.kauan.GestorTarefas.model.Funcionario;

public class FuncionarioDAO {
	private Funcionario funcionario;

	public FuncionarioDAO(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public boolean gravar() {
		ArquivoFuncionarioFactory aff = new ArquivoFuncionarioFactory();
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
	
	public void getFuncionarios() {
		
	}
}
