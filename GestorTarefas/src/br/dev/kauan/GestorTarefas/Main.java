package br.dev.kauan.GestorTarefas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

import br.dev.kauan.GestorTarefas.model.Funcionario;
import br.dev.kauan.GestorTarefas.model.Status;
import br.dev.kauan.GestorTarefas.model.Tarefa;

public class Main {

	public static void main(String[] args) {
		//testarLeituraEsctritaArquivo();
		Funcionario funcionario = new Funcionario("Kauan","Programador");
		Tarefa tarefa = new Tarefa(funcionario);
		tarefa.setNome("Lavar a Louça");
		tarefa.setDataInicio(LocalDate.of(2025, 05, 21));
		tarefa.setPrazo(1);
		tarefa.getDataPrevistaEntrega();
	}

	private static void testarLeituraEsctritaArquivo() {
		String so = System.getProperty("os.name");
		System.out.println(so);

		String caminho = "/Users/25132925/projetoGestorTarefas/Tarefa";
		FileReader fr = null;
		BufferedReader br = null;

		FileWriter fw = null;
		BufferedWriter bw = null;

		try {
			fr = new FileReader(caminho);
			br = new BufferedReader(fr, 1);

			fw = new FileWriter(caminho, true);
			bw = new BufferedWriter(fw);

			bw.append("Kauan\n");
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
