package br.dev.kauan.GestorTarefas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.UUID;

import br.dev.kauan.GestorTarefas.dao.FuncionarioDAO;
import br.dev.kauan.GestorTarefas.dao.TarefaDao;
import br.dev.kauan.GestorTarefas.model.Funcionario;
import br.dev.kauan.GestorTarefas.model.Status;
import br.dev.kauan.GestorTarefas.model.Tarefa;
import br.dev.kauan.GestorTarefas.ui.FuncionarioFrame;
import br.dev.kauan.GestorTarefas.ui.FuncionarioListaFrame;
import br.dev.kauan.GestorTarefas.ui.GerenciadorFrame;
import br.dev.kauan.GestorTarefas.utils.Utils;

public class Main {

	public static void main(String[] args) {
//		new FuncionarioListaFrame(null);
//		new FuncionarioFrame(null);
//		new GerenciadorFrame();
		
//		new TarefaDao();

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private static void testarLeituraEscritaArquivo(int i) {
		String so = System.getProperty("os.name");
		System.out.println(so);

		String caminhoFuncionario = "/Users/25132925/projetoGestorTarefas/Funcionarios.csv";
		String caminhoTarefa = "/Users/25132925/projetoGestorTarefas/Tarefas.csv";
		FileReader fr = null;
		BufferedReader br = null;

		FileWriter fw = null;
		BufferedWriter bw = null;
		if (i == 1) {
			try {
				fr = new FileReader(caminhoFuncionario);
				br = new BufferedReader(fr, 1);

				fw = new FileWriter(caminhoFuncionario, true);
				bw = new BufferedWriter(fw);

//				bw.append("Teste de localização do arquivo\n"); // Escreve na Linha
				bw.flush();

				String linha = br.readLine();

				while (linha != null) {
					System.out.println(linha);
					linha = br.readLine();
				}

			} catch (FileNotFoundException erro) {
				System.out.println("Arquivo não encontrado!");
			} catch (IOException erro) {
				System.out.println("Acesso negado!");
			} catch (Exception erro) {
				System.out.println(erro.getMessage());
			}
		} 
		else {
			try {
				fr = new FileReader(caminhoTarefa);
				br = new BufferedReader(fr, 1);

				fw = new FileWriter(caminhoTarefa, true);
				bw = new BufferedWriter(fw);
				
//				bw.append("Teste de localização do arquivo\n"); // Escreve na linha
				bw.flush();

				String linha = br.readLine();

				while (linha != null) {
					System.out.println(linha);
					linha = br.readLine();
				}

			} catch (FileNotFoundException erro) {
				System.out.println("Arquivo não encontrado!");
			} catch (IOException erro) {
				System.out.println("Acesso negado!");
			} catch (Exception erro) {
				System.out.println(erro.getMessage());
			}
			
		}
		
	}

}
