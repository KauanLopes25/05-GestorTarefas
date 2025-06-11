package br.dev.kauan.GestorTarefas.ui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class GerenciadorFrame {
	JLabel labelTitulo;

	JButton btnFuncionarios;
	JButton btnTarefa;

	public GerenciadorFrame() {
		CriarTela();
		
	}

	private void CriarTela() {
		JFrame telaGerenciador = new JFrame("Gerenciador de Tarefas");
		telaGerenciador.setSize(600,300);
		telaGerenciador.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaGerenciador.setLayout(null);
		telaGerenciador.setLocationRelativeTo(null);
		telaGerenciador.setResizable(false);
		
		Container painel = telaGerenciador;

		labelTitulo = new JLabel("GERENCIADOR");
		labelTitulo.setBounds(160, 20, 250, 40);
		labelTitulo.setFont(new Font("Arial", Font.BOLD, 32));
		labelTitulo.setForeground(Color.RED);

		btnFuncionarios = new JButton("Funcionários");
		btnFuncionarios.setBounds(50, 100, 200, 70);
		
		btnTarefa = new JButton("Tarefas");
		btnTarefa.setBounds(350, 100, 200, 70);
		
		btnFuncionarios.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new FuncionarioListaFrame(telaGerenciador);
				
			}
		});

		painel.add(labelTitulo);
		painel.add(btnFuncionarios);
		painel.add(btnTarefa);

		telaGerenciador.setVisible(true);

	}
}
