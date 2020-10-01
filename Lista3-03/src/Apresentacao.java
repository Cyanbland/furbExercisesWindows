
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

/*
 * Apresentacao.java
 * Lista 3 - Exerc�cio 3
 * GUI gerada com Netbeans
 */

public class Apresentacao extends javax.swing.JFrame {

	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private Agenda agenda = new Agenda();

	/** Creates new form Apresentacao */
	public Apresentacao() {
		initComponents();
	}

	@SuppressWarnings("unchecked")

	private void initComponents() {

		buttonGroup1 = new javax.swing.ButtonGroup();
		jTabbedPane1 = new javax.swing.JTabbedPane();
		jPanel1 = new javax.swing.JPanel();
		tfEfemeride = new javax.swing.JTextField();
		tfData = new javax.swing.JTextField();
		jLabel2 = new javax.swing.JLabel();
		jLabel1 = new javax.swing.JLabel();
		jBIncluirNaAgenda = new javax.swing.JButton();
		jPanel2 = new javax.swing.JPanel();
		jLabel3 = new javax.swing.JLabel();
		tfTempo = new javax.swing.JTextField();
		tfHora = new javax.swing.JTextField();
		jLabel4 = new javax.swing.JLabel();
		jRadioButton1 = new javax.swing.JRadioButton();
		jLabel6 = new javax.swing.JLabel();
		tfDescricao = new javax.swing.JTextField();
		jLabel5 = new javax.swing.JLabel();
		jRadioButton3 = new javax.swing.JRadioButton();
		jRadioButton2 = new javax.swing.JRadioButton();
		jBInserirCompromisso = new javax.swing.JButton();
		jLabel10 = new javax.swing.JLabel();
		jPanel3 = new javax.swing.JPanel();
		jScrollPane2 = new javax.swing.JScrollPane();
		jTAConsultas = new javax.swing.JTextArea();
		jBCompromissosDiaPrioridade = new javax.swing.JButton();
		jBTempoMedio = new javax.swing.JButton();
		jBMenorCompromisso = new javax.swing.JButton();
		jLabel8 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		jComboBox1 = new javax.swing.JComboBox();
		jLabel7 = new javax.swing.JLabel();
		jLabel11 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Lista 3 - Exerc\u00EDcio 3");

		jLabel2.setText("Efem�ride:");

		jLabel1.setText("Data:");

		jBIncluirNaAgenda.setText("Incluir na agenda");
		jBIncluirNaAgenda.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jBIncluirNaAgendaActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel2)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(tfEfemeride, javax.swing.GroupLayout.PREFERRED_SIZE, 222,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel1)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(tfData, javax.swing.GroupLayout.PREFERRED_SIZE, 72,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addComponent(jBIncluirNaAgenda))
						.addContainerGap(282, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel1).addComponent(tfData, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel2).addComponent(tfEfemeride, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(28, 28, 28).addComponent(jBIncluirNaAgenda).addContainerGap(221, Short.MAX_VALUE)));

		jTabbedPane1.addTab("Nova data", jPanel1);

		jLabel3.setText("Hora:");

		jLabel4.setText("Tempo (min):");

		buttonGroup1.add(jRadioButton1);
		jRadioButton1.setText("Alta");

		jLabel6.setText("Prioridade:");

		jLabel5.setText("Descri��o:");

		buttonGroup1.add(jRadioButton3);
		jRadioButton3.setSelected(true);
		jRadioButton3.setText("Baixa");

		buttonGroup1.add(jRadioButton2);
		jRadioButton2.setText("Normal");

		jBInserirCompromisso.setText("Inserir compromisso");
		jBInserirCompromisso.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jBInserirCompromissoActionPerformed(evt);
			}
		});

		jLabel10.setText("Data:");

		tfDataCompromisso = new JTextField();
		tfDataCompromisso.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				LocalDate dataDigitada = LocalDate.parse(tfDataCompromisso.getText(), formatter);
				DataAgenda atual = agenda.buscarData(dataDigitada);
				String msg;
				if (atual == null) {
					JOptionPane.showMessageDialog(null, "Data n�o cadastrada. Primeiro crie o dia");
				}
			}
		});
		tfDataCompromisso.setColumns(10);

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout
				.createSequentialGroup().addGap(27)
				.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel10).addGap(18).addComponent(
								tfDataCompromisso, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING, false)
								.addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel5)
										.addPreferredGap(ComponentPlacement.RELATED).addComponent(tfDescricao))
								.addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel3)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(tfHora, GroupLayout.PREFERRED_SIZE, 53,
												GroupLayout.PREFERRED_SIZE)
										.addGap(31).addComponent(jLabel4).addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(tfTempo, GroupLayout.PREFERRED_SIZE, 41,
												GroupLayout.PREFERRED_SIZE)))
						.addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel6)
								.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(jRadioButton1)
								.addPreferredGap(ComponentPlacement.RELATED).addComponent(jRadioButton2)
								.addPreferredGap(ComponentPlacement.RELATED).addComponent(jRadioButton3))
						.addComponent(jBInserirCompromisso))
				.addContainerGap(320, Short.MAX_VALUE)));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout
				.createSequentialGroup().addGap(22)
				.addGroup(jPanel2Layout
						.createParallelGroup(Alignment.BASELINE).addComponent(jLabel10).addComponent(tfDataCompromisso,
								GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel3)
						.addComponent(tfHora, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel4).addComponent(tfTempo, GroupLayout.PREFERRED_SIZE,
								GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel5).addComponent(
						tfDescricao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel6)
						.addComponent(jRadioButton1).addComponent(jRadioButton2).addComponent(jRadioButton3))
				.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(jBInserirCompromisso)
				.addContainerGap(158, Short.MAX_VALUE)));
		jPanel2.setLayout(jPanel2Layout);

		jTabbedPane1.addTab("Novo Compromisso", jPanel2);

		jTAConsultas.setColumns(20);
		jTAConsultas.setRows(5);
		jTAConsultas.setText("Para apresentar os resultados das pesquisas.");
		jScrollPane2.setViewportView(jTAConsultas);

		jBCompromissosDiaPrioridade.setText("Compromissos dia&prioridade");
		jBCompromissosDiaPrioridade.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jBCompromissosDiaPrioridadeActionPerformed(evt);
			}
		});

		jBTempoMedio.setText("Tempo m�dio");
		jBTempoMedio.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jBTempoMedioActionPerformed(evt);
			}
		});

		jBMenorCompromisso.setText("Menor compromisso");
		jBMenorCompromisso.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jBMenorCompromissoActionPerformed(evt);
			}
		});

		jLabel8.setText("Data:");

		jLabel9.setText("Prioridade:");

		jComboBox1.setModel(new DefaultComboBoxModel(new String[] {"Alta", "Normal", "Baixa"}));

		jLabel7.setText("Pesquisar compromissos:");
		
		tfDataConsulta = new JTextField();
		tfDataConsulta.setColumns(10);

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3Layout.setHorizontalGroup(
			jPanel3Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup()
					.addGap(27)
					.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel3Layout.createSequentialGroup()
							.addComponent(jLabel7)
							.addGap(18)
							.addComponent(jLabel8)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(tfDataConsulta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(78)
							.addComponent(jLabel9)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel3Layout.createParallelGroup(Alignment.TRAILING, false)
							.addGroup(jPanel3Layout.createSequentialGroup()
								.addComponent(jBMenorCompromisso)
								.addGap(34)
								.addComponent(jBTempoMedio)
								.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jBCompromissosDiaPrioridade))
							.addComponent(jScrollPane2, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 471, GroupLayout.PREFERRED_SIZE)))
					.addGap(293))
		);
		jPanel3Layout.setVerticalGroup(
			jPanel3Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup()
					.addGap(13)
					.addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jLabel7)
						.addComponent(jLabel8)
						.addComponent(jLabel9)
						.addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfDataConsulta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(9)
					.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE)
							.addComponent(jBMenorCompromisso)
							.addComponent(jBTempoMedio))
						.addComponent(jBCompromissosDiaPrioridade))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 237, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(26, Short.MAX_VALUE))
		);
		jPanel3.setLayout(jPanel3Layout);

		jTabbedPane1.addTab("Consultas", jPanel3);

		jLabel11.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
		jLabel11.setText("Agenda");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(505, 505, 505)
						.addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 80,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(30, Short.MAX_VALUE))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup().addContainerGap(21, Short.MAX_VALUE).addComponent(jTabbedPane1,
								javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(19, 19, 19)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jLabel11)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jTabbedPane1,
								javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(21, Short.MAX_VALUE)));

		pack();
	}

	private void jBInserirCompromissoActionPerformed(java.awt.event.ActionEvent evt) {		
		LocalDate dataDigitada = LocalDate.parse(tfDataCompromisso.getText(), formatter);
		DataAgenda atual = agenda.buscarData(dataDigitada);
		String msg;
		if (atual == null) {
			msg = "Compromisso n�o criado por falta do dia na agenda. Crie o dia primeiro";
		}
		else {
			LocalTime lt = LocalTime.parse(tfHora.getText());
			char prioridade;
			if (jRadioButton1.isSelected()) {
				prioridade = 'A';
			}
			else if (jRadioButton2.isSelected()) {
				prioridade = 'N';
			}
			else {
				prioridade = 'B';
			}
			Compromisso compromisso = new Compromisso(lt,tfDescricao.getText(),
									Integer.parseInt(tfTempo.getText()),
									prioridade);
			if (atual.addCompromisso(compromisso)) {
				msg = "Compromisso inserido";
			}
			else {
				msg = "Hor�rio conflitante";
			}
		}
		JOptionPane.showMessageDialog(this, msg);
	}

	private void jBTempoMedioActionPerformed(java.awt.event.ActionEvent evt) {
		LocalDate dataDigitada = LocalDate.parse(tfDataConsulta.getText(), formatter);
		DataAgenda atual = agenda.buscarData(dataDigitada);
		String msg;
		if (atual == null) {
			msg = "Dia n�o cadastrado";
		}
		else {
			msg = "Tempo m�dio dos compromissos de "+atual.getData()+" : "+atual.getTempoMedio();
		}
		jTAConsultas.setText(msg);
	}

	private void jBIncluirNaAgendaActionPerformed(java.awt.event.ActionEvent evt) {
		LocalDate dataDigitada = LocalDate.parse(tfData.getText(), formatter);
		DataAgenda atual = agenda.buscarData(dataDigitada);
		String msg;
		if (atual == null) {  // o dia digitado ainda n�o foi inclu�do na agenda 
			atual = new DataAgenda();
			atual.setData(dataDigitada);
			atual.setEfemeride(tfEfemeride.getText());
			agenda.addDataAgenda(atual);
			msg = "Data inclu�da";
		}
		else {  // a data j� existia na agenda
			msg = "Data:"+atual.getData();
			msg += "\nAlta prioridade:"+atual.getQtdCompromissosPrioridade('A');
			for (Compromisso c: atual.getLista()) {
				msg += "\n"+c.toString();
			}
		}
		JOptionPane.showMessageDialog(this, msg);
	}

	private void jBCompromissosDiaPrioridadeActionPerformed(java.awt.event.ActionEvent evt) {
		LocalDate dataDigitada = LocalDate.parse(tfDataConsulta.getText(), formatter);
		DataAgenda atual = agenda.buscarData(dataDigitada);
		String msg;
		if (atual == null) {
			msg = "Dia n�o cadastrado";
		}
		else {
			msg = "Compromissos de "+atual.getData()+" com prioridade "+ jComboBox1.getSelectedItem();
			ArrayList<Compromisso> resultado = atual.getCompromissosPrioridade(jComboBox1.getSelectedItem().toString().charAt(0));
			for (Compromisso c: resultado) {
				msg += "\n"+c.toString();
			}
		}
		jTAConsultas.setText(msg);
	}

	private void jBMenorCompromissoActionPerformed(java.awt.event.ActionEvent evt) {
		Compromisso menor = agenda.getMenorCompromisso();
		String msg;
		if (menor == null) {
			msg = "N�o h� compromissos cadastrados";
		}
		else {
			msg = "Menor compromisso da Agenda\n"+menor.toString();
		}
		jTAConsultas.setText(msg);
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Apresentacao().setVisible(true);
			}
		});
	}

	// Variables declaration
	private javax.swing.ButtonGroup buttonGroup1;
	private javax.swing.JButton jBCompromissosDiaPrioridade;
	private javax.swing.JButton jBIncluirNaAgenda;
	private javax.swing.JButton jBInserirCompromisso;
	private javax.swing.JButton jBMenorCompromisso;
	private javax.swing.JButton jBTempoMedio;
	private javax.swing.JComboBox jComboBox1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JRadioButton jRadioButton1;
	private javax.swing.JRadioButton jRadioButton2;
	private javax.swing.JRadioButton jRadioButton3;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JTextArea jTAConsultas;
	private javax.swing.JTabbedPane jTabbedPane1;
	private javax.swing.JTextField tfData;
	private javax.swing.JTextField tfEfemeride;
	private javax.swing.JTextField tfHora;
	private javax.swing.JTextField tfTempo;
	private javax.swing.JTextField tfDescricao;
	private JTextField tfDataCompromisso;
	private JTextField tfDataConsulta;
}