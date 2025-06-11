package br.dev.kauan.GestorTarefas.ui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import br.dev.kauan.GestorTarefas.dao.FuncionarioDAO;
import br.dev.kauan.GestorTarefas.model.Funcionario;

public class FuncionarioListaFrame {
	private JLabel labelTitulo;
	private JButton btnCadastrarFuncionarios;
	private JButton btnSair;

	private DefaultTableModel model; // Dados da tabela
	private JTable tabelaFuncionarios; // Tabela visualmente
	private JScrollPane scrollFuncionarios; // Contâiner da tabela
	String[] colunas = { "CÓDIGO", "NOME FUNCIONÁRIO", "CARGO" };

	public FuncionarioListaFrame(JFrame pai) {
		CriarTela(pai);
	}

	private void CriarTela(JFrame pai) {
		JDialog telaFuncionarioLista = new JDialog(pai ,true);
		telaFuncionarioLista.setSize(700, 500);
		telaFuncionarioLista.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		telaFuncionarioLista.setLayout(null);
		telaFuncionarioLista.setLocationRelativeTo(null);
		telaFuncionarioLista.setResizable(false);

		Container painel = telaFuncionarioLista.getContentPane();

		labelTitulo = new JLabel("Cadastro de Funcionários");
		labelTitulo.setBounds(10, 10, 500, 40);
		labelTitulo.setFont(new Font("Arial", Font.BOLD, 32));
		labelTitulo.setForeground(Color.RED);

		// Criar Tabela

		model = new DefaultTableModel(colunas, 100);
		tabelaFuncionarios = new JTable(model);
		scrollFuncionarios = new JScrollPane(tabelaFuncionarios);
		scrollFuncionarios.setBounds(10, 70, 680, 300);
		carregarDadosTabela();
		
		btnCadastrarFuncionarios = new JButton("Cadastrar novo funcionário");
		btnCadastrarFuncionarios.setBounds(10, 400, 200, 50);
		
		btnSair = new JButton("Sair");
		btnSair.setBounds(250, 400, 150, 50);
		
		btnCadastrarFuncionarios.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new FuncionarioFrame(telaFuncionarioLista);
				carregarDadosTabela();
				
			}
		});

		btnSair.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				telaFuncionarioLista.dispose();
				
			}
		});
		
		painel.add(labelTitulo);
		painel.add(scrollFuncionarios);
		painel.add(btnCadastrarFuncionarios);
		painel.add(btnSair);

		telaFuncionarioLista.setVisible(true);
	}

	private void carregarDadosTabela() {

		List<Funcionario> funcionarios = new ArrayList<>();

		FuncionarioDAO dao = new FuncionarioDAO(null);
		funcionarios = dao.getFuncionarios();

		int i = 0;

		Object[][] dados = new Object[funcionarios.size()][3];

		// Para cada objeto "f" na lista de funcionarios ele executa a operação
		for (Funcionario f : funcionarios) {
			dados[i][0] = f.getMatricula();
			dados[i][1] = f.getNome();
			dados[i][2] = f.getCargo();
			i++;

		}

		model.setDataVector(dados, colunas);

	}
}
