package br.dev.kauan.GestorTarefas.ui;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.dev.kauan.GestorTarefas.utils.Utils;

public class TarefaFrame {
	private JLabel labelCodigo;
	private JLabel labelTarefa;
	private JLabel labelDescricao;
	private JLabel labelResponsavel;
	private JLabel labelDataInicio;
	private JLabel labelPrazo;
	private JLabel labelDataPrevista;
	private JLabel labelDataEntregue;
	private JLabel labelStatus;
	private JTextField txtCodigo;
	private JTextField txtTarefa;
	private JTextField txtDescricao;
	private JTextField txtResponsavel;
	private JTextField txtDataInicio;
	private JTextField txtPrazo;
	private JTextField txtDataPrevista;
	private JTextField txtDataEntregue;
	private JTextField txtStatus;
	private JButton btnSalvar;
	private JButton btnSair;
	
	public TarefaFrame(JDialog pai) {
		criarTela(pai);
	}
	
	private void criarTela(JDialog pai) {
		JDialog telaTarefa = new JDialog(pai, true);
		telaTarefa.setSize(500, 750);
		telaTarefa.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		telaTarefa.setLayout(null);
		telaTarefa.setResizable(false);
		telaTarefa.setLocationRelativeTo(null);
		
		Container painel = telaTarefa.getContentPane();
		
		labelCodigo = new JLabel("Codigo");
		labelCodigo.setBounds(10, 20, 150, 30);
		txtCodigo = new JTextField();
		txtCodigo.setBounds(10, 50, 200, 30);
		txtCodigo.setEnabled(false);
		txtCodigo.setText(Utils.gerarUUID8());

		labelTarefa = new JLabel("Tarefa");
		labelTarefa.setBounds(10, 85, 150, 30);
		txtTarefa = new JTextField();
		txtTarefa.setBounds(10, 115, 200, 30);

		labelDescricao = new JLabel("Descricao");
		labelDescricao.setBounds(10, 150, 150, 30);
		txtDescricao = new JTextField();
		txtDescricao.setBounds(10, 180, 350, 30);

		labelResponsavel = new JLabel("Responsavel");
		labelResponsavel.setBounds(10, 215, 150, 30);
		txtResponsavel = new JTextField();
		txtResponsavel.setBounds(10, 245, 200, 30);

		labelDataInicio = new JLabel("Data Inicio");
		labelDataInicio.setBounds(10, 280, 150, 30);
		txtDataInicio = new JTextField();
		txtDataInicio.setBounds(10, 310, 200, 30);
		
		labelPrazo = new JLabel("Prazo");
		labelPrazo.setBounds(10, 345, 150, 30);
		txtPrazo = new JTextField();
		txtPrazo.setBounds(10, 375, 200, 30);
		
		labelDataPrevista = new JLabel("Data Prevista");
		labelDataPrevista.setBounds(10, 410, 150, 30);
		txtDataPrevista = new JTextField();
		txtDataPrevista.setBounds(10, 440, 200, 30);
		
		labelDataEntregue = new JLabel("Data Entregue");
		labelDataEntregue.setBounds(10, 475, 150, 30);
		txtDataEntregue = new JTextField();
		txtDataEntregue.setBounds(10, 505, 200, 30);
		
		labelStatus = new JLabel("Data Status");
		labelStatus.setBounds(10, 540, 150, 30);
		txtStatus = new JTextField();
		txtStatus.setBounds(10, 570, 200, 30);
		
		btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(10, 640, 200, 40);
		btnSalvar.setOpaque(true);
		btnSalvar.setBackground(Color.GREEN);

		btnSair = new JButton("Sair");
		btnSair.setBounds(220, 640, 120, 40);
		btnSair.setOpaque(true);
		btnSair.setBackground(Color.RED);
		
		btnSair.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int resposta = JOptionPane.showConfirmDialog(telaTarefa, "Sair do Sistema?", "Atencão!",
						JOptionPane.YES_NO_OPTION);
				if (resposta == 0) {
					telaTarefa.dispose();
				}

			}
		});
		
		painel.add(labelCodigo);
		painel.add(labelDataEntregue);
		painel.add(labelDataInicio);
		painel.add(labelDataPrevista);
		painel.add(labelDescricao);
		painel.add(labelPrazo);
		painel.add(labelResponsavel);
		painel.add(labelStatus);
		painel.add(labelTarefa);
		painel.add(txtCodigo);
		painel.add(txtDataEntregue);
		painel.add(txtDataInicio);
		painel.add(txtDataPrevista);
		painel.add(txtDescricao);
		painel.add(txtPrazo);
		painel.add(txtResponsavel);
		painel.add(txtStatus);
		painel.add(txtTarefa);
		painel.add(btnSalvar);
		painel.add(btnSair);

		
		telaTarefa.setVisible(true);
		
		
		
	}
	
}
