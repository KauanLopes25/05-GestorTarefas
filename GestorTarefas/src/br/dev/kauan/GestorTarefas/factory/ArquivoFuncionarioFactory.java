package br.dev.kauan.GestorTarefas.factory;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ArquivoFuncionarioFactory {

	private String caminho = "/Users/25132925/projetoGestorTarefas/Funcionarios.csv";
	private FileWriter fw;
	private BufferedWriter bw;
	
	//throws lança uma excessão para quem chamou o método
	public BufferedWriter getBw() throws IOException {
		fw = new FileWriter(caminho, true);
		bw = new BufferedWriter(fw);
		return bw;
	}

}
