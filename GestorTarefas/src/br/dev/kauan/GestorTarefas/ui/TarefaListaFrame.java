package br.dev.kauan.GestorTarefas.ui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TarefaListaFrame {
	private JLabel labelTitulo;
	private JButton btnCadastrarTarefas;
	private JButton btnSair;
	
	private DefaultTableModel model; // Dados da tabela
	private JTable tabelaTarefas; // Tabela visualmente
	private JScrollPane scrollTarefas; // Contâiner da tabela
	
	public TarefaListaFrame(JFrame pai) {
		CriarTela(pai);
	}
	
	String[] colunas = { "CÓDIGO","TAREFA", "DESCRIÇÃO", "RESPONSÁVEL","DATA INICIO","PRAZO","DATA PREVISTA","DATA ENTREGUE","STATUS" };
	
	private void CriarTela (JFrame pai) {
		JDialog telaTarefaLista = new JDialog(pai, true);
		telaTarefaLista.setSize(1000, 500);
		telaTarefaLista.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		telaTarefaLista.setLayout(null);
		telaTarefaLista.setLocationRelativeTo(null);
		telaTarefaLista.setResizable(false);
		
		Container painel = telaTarefaLista.getContentPane();
		
		labelTitulo = new JLabel("Cadastro de Tarefas");
		labelTitulo.setBounds(10, 10, 500, 40);
		labelTitulo.setFont(new Font("Arial", Font.BOLD, 32));
		labelTitulo.setForeground(Color.RED);

		// Criar Tabela

		model = new DefaultTableModel(colunas, 100);
		tabelaTarefas = new JTable(model);
		scrollTarefas = new JScrollPane(tabelaTarefas);
		scrollTarefas.setBounds(10, 70, 980, 300);
		//carregarDadosTabela();
		
		btnCadastrarTarefas = new JButton("Cadastrar nova tarefa");
		btnCadastrarTarefas.setBounds(10, 400, 200, 50);
		
		btnSair = new JButton("Sair");
		btnSair.setBounds(250, 400, 150, 50);
		
		btnCadastrarTarefas.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new TarefaFrame(telaTarefaLista);
				
			}
		});
		
		btnSair.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				telaTarefaLista.dispose();
				
			}
		});
		
		
		painel.add(labelTitulo);
		painel.add(scrollTarefas);
		painel.add(btnCadastrarTarefas);
		painel.add(btnSair);
		
		telaTarefaLista.setVisible(true);
	}
	
}
