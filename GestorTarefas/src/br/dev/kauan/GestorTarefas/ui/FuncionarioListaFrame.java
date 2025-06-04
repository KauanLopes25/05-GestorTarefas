package br.dev.kauan.GestorTarefas.ui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class FuncionarioListaFrame {
	private JLabel labelTitulo;
	private JButton btnNovo;
	private DefaultTableModel model; // Dados da tabela
	private JTable tabelaFuncionarios; // Tabela visualmente
	private JScrollPane scrollFuncionarios; // Contâiner da tabela
	
	public FuncionarioListaFrame (){
		CriarTela();
	}
	private void CriarTela() {
		JFrame telaFuncionarioLista = new JFrame("Lista de Funcionários");
		telaFuncionarioLista.setSize(700, 500);
		telaFuncionarioLista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaFuncionarioLista.setLayout(null);
		telaFuncionarioLista.setLocationRelativeTo(null);
		telaFuncionarioLista.setResizable(false);
		
		Container painel = telaFuncionarioLista.getContentPane();
		
		labelTitulo = new JLabel("Cadastro de Funcionários");
		labelTitulo.setBounds(10, 10, 500, 40);
		labelTitulo.setFont(new Font("Arial", Font.BOLD, 32));
		labelTitulo.setForeground(Color.RED);
		
		//Criar Tabela
		
		String[] colunas = {"CÓDIGO","NOME FUNCIONÁRIO", "CARGO"};
		model = new DefaultTableModel(colunas, 100);
		tabelaFuncionarios = new JTable(model);
		scrollFuncionarios = new JScrollPane(tabelaFuncionarios);
		scrollFuncionarios.setBounds(10, 70, 680, 300);
		
		painel.add(labelTitulo);
		painel.add(scrollFuncionarios);
		
		telaFuncionarioLista.setVisible(true);
	}
	
}
