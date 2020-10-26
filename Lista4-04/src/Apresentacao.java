//Desenvolvido por João Vitor de Oliveira, Natália Sens Weise, Paulo Rubens de Moraes Leme Júnior
//A parte da impressão dos dados está na aba consulta do programa.

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.JFormattedTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;

/**
 *
 * @author marcel
 */
public class Apresentacao extends javax.swing.JFrame {

	private Camara camara = new Camara("Blumenau");
	private Partido pesquisado;
	private ArrayList<ProjetoDeLei> projetos = new ArrayList<>();
	private int numVereadores = 0;

	/**
	 * Creates new form Apresentacao
	 */
	public Apresentacao() {
		setResizable(false);
		initComponents();
	}

	@SuppressWarnings("unchecked")

	private void initComponents() {

		jLabel7 = new javax.swing.JLabel();
		jTabbedPane1 = new javax.swing.JTabbedPane();
		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jtfNumPartido = new javax.swing.JTextField();
		jtfNomePartido = new javax.swing.JTextField();
		jbCadastrarPartido = new javax.swing.JButton();
		jPanel2 = new javax.swing.JPanel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jtfNomeVereador = new javax.swing.JTextField();
		jtfNumPartidoVereador = new javax.swing.JTextField();
		jtfNumPartidoVereador.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				pesquisado = camara.getPartido(Integer.parseInt(jtfNumPartidoVereador.getText()));
				String msg;
				boolean existe;
				if (pesquisado == null) {
					msg = "Número não encontrado";
					existe = false;
				} else {
					msg = pesquisado.getNome();
					existe = true;
				}
				jlNomePartido.setText(msg);
				jbCadastrarVereador.setEnabled(existe);
			}
		});

		jlNomePartido = new javax.swing.JLabel();
		jtfQtdProjApres = new javax.swing.JTextField();
		jtfQtdProjAprov = new javax.swing.JTextField();
		jbCadastrarVereador = new javax.swing.JButton();
		jbCadastrarVereador.setEnabled(false);
		jPanel3 = new javax.swing.JPanel();
		jbMenorDesempenho = new javax.swing.JButton();
		jbMenorDesempenho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Vereador menor = camara.getVereadorMenorDesempenho();
				String msg;
				if (menor == null) {
					msg = "Não há vereadores cadastrados";
				} else {
					msg = "Menor desempenho: " + menor.getNome() + " do partido " + menor.getPartido().getNome()
							+ " está com desempenho " + menor.getDesempenho();
				}
				JOptionPane.showMessageDialog(null, msg);
			}
		});
		jbMaisProjetos = new javax.swing.JButton();
		jbMaisProjetos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Vereador mais = camara.getVereadorMaisProjAprov();
				String msg;
				if (mais == null) {
					msg = "Não há vereadores cadastrados";
				} else {
					msg = "Menor desempenho: " + mais.getNome() + " do partido " + mais.getPartido().getNome()
							+ " está com desempenho " + mais.getDesempenho();
				}
				JOptionPane.showMessageDialog(null, msg);
			}
		});
		jLabel9 = new javax.swing.JLabel();
		jTextField7 = new javax.swing.JTextField();
		jbEstatisticas = new javax.swing.JButton();
		jbEstatisticas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		jSeparator1 = new javax.swing.JSeparator();
		jbTotalProjetos = new javax.swing.JButton();
		jbVereadoresAcimaMedia = new javax.swing.JButton();

		jLabel7.setText("jLabel7");

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Lista 3 - Exercício 5");

		jLabel1.setText("Número:");

		jLabel2.setText("Nome:");

		jbCadastrarPartido.setText("Cadastrar");
		jbCadastrarPartido.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(jbCadastrarPartido)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel1)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jtfNumPartido, javax.swing.GroupLayout.PREFERRED_SIZE, 44,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel2)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jtfNomePartido, javax.swing.GroupLayout.PREFERRED_SIZE,
														177, javax.swing.GroupLayout.PREFERRED_SIZE))))
						.addContainerGap(153, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel1)
								.addComponent(jtfNumPartido, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel2).addComponent(jtfNomePartido,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(28, 28, 28).addComponent(jbCadastrarPartido).addContainerGap(139, Short.MAX_VALUE)));

		jTabbedPane1.addTab("Partido", jPanel1);

		jLabel3.setText("Nome: ");

		jLabel4.setText("Número do partido:");

		jLabel5.setText("Quantidade de projetos apresentados:");

		jLabel6.setText("aprovados:");

		jbCadastrarVereador.setText("Cadastrar");
		jbCadastrarVereador.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel3)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jtfNomeVereador, javax.swing.GroupLayout.PREFERRED_SIZE, 264,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel4)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jtfNumPartidoVereador, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18).addComponent(
												jlNomePartido, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGroup(jPanel2Layout.createSequentialGroup()
										.addGroup(jPanel2Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(jLabel6).addComponent(jLabel5))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel2Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addComponent(jtfQtdProjApres, javax.swing.GroupLayout.DEFAULT_SIZE, 40,
														Short.MAX_VALUE)
												.addComponent(jtfQtdProjAprov)))
								.addGroup(jPanel2Layout.createSequentialGroup().addGap(132, 132, 132)
										.addComponent(jbCadastrarVereador)))
						.addContainerGap(63, Short.MAX_VALUE)));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addGap(19, 19, 19)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel3).addComponent(jtfNomeVereador,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel4)
								.addComponent(jtfNumPartidoVereador, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jlNomePartido, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGap(18, 18, 18)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel5).addComponent(jtfQtdProjApres,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel6).addComponent(jtfQtdProjAprov,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(27, 27, 27).addComponent(jbCadastrarVereador).addGap(70, 70, 70)));

		jTabbedPane1.addTab("Vereador", jPanel2);

		jbMenorDesempenho.setText("Vereador menor desempenho");

		jbMaisProjetos.setText("Vereador com mais proj. aprovados");

		jLabel9.setText("Número do partido:");

		jbEstatisticas.setText("Estatísticas do partido");

		jbTotalProjetos.setText("Total de projetos da Câmara");
		jbTotalProjetos.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton6ActionPerformed(evt);
			}
		});

		jbVereadoresAcimaMedia.setText("Vereadores acima da média");
		jbVereadoresAcimaMedia.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton7ActionPerformed(evt);
			}
		});
		
		JButton jbResumo = new JButton();
		jbResumo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String msg = "";
				
				if (camara.getPartidos().size() > 0 && numVereadores > 0) {
					for (Partido part : camara.getPartidos()) {
						for(Vereador vereador : part.getVereadores()) {
							msg += "Nome do Vereador: " + vereador.getNome() + "\nPartido: " + vereador.getPartido().getNome() +
									"\nDesempenho: " + vereador.getDesempenho();
							
							for (ProjetoDeLei proj : vereador.getProjetosDeLei()) {
								msg += "\n" + proj.mostrar();
							}
						}
					}
					
					JOptionPane.showMessageDialog(null, msg);
				}
				
				else {
					JOptionPane.showMessageDialog(null, "Não existem dados suficientes para executar essa operação");
				}

			}
		});
		jbResumo.setText("Imprimir dados gerais de Vereadores");

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3Layout.setHorizontalGroup(
			jPanel3Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup()
					.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel3Layout.createSequentialGroup()
							.addContainerGap()
							.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
								.addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(jPanel3Layout.createSequentialGroup()
									.addComponent(jLabel9)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(jTextField7, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(jbEstatisticas))))
						.addComponent(jbMenorDesempenho)
						.addComponent(jbMaisProjetos)
						.addComponent(jbTotalProjetos)
						.addComponent(jbVereadoresAcimaMedia)
						.addComponent(jbResumo, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		jPanel3Layout.setVerticalGroup(
			jPanel3Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jLabel9)
						.addComponent(jTextField7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(jbEstatisticas))
					.addGap(13)
					.addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(jbMenorDesempenho)
					.addGap(18)
					.addComponent(jbMaisProjetos)
					.addGap(18)
					.addComponent(jbTotalProjetos)
					.addGap(18)
					.addComponent(jbVereadoresAcimaMedia)
					.addGap(18)
					.addComponent(jbResumo)
					.addContainerGap(246, Short.MAX_VALUE))
		);
		jPanel3.setLayout(jPanel3Layout);

		jTabbedPane1.addTab("Consultas", jPanel3);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup().addContainerGap().addComponent(jTabbedPane1).addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup().addContainerGap().addComponent(jTabbedPane1).addGap(28, 28, 28)));
		
		JPanel jPanel4 = new JPanel();
		jTabbedPane1.addTab("Projetos", null, jPanel4, null);
		
		JSeparator jSeparator1_1 = new JSeparator();
		
		JLabel jLabel9_1 = new JLabel();
		jLabel9_1.setText("T\u00EDtulo do Projeto");
		
		tfTitulo = new JTextField();
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Data da Apresenta\u00E7\u00E3o");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JFormattedTextField tfDataApresentacao2 = new JFormattedTextField();
		tfDataApresentacao2.setColumns(2);
		
		JFormattedTextField tfDataApresentacao1 = new JFormattedTextField();
		tfDataApresentacao1.setColumns(2);
		
		JFormattedTextField tfDataApresentacao = new JFormattedTextField();
		tfDataApresentacao.setColumns(2);
		
		JLabel lblNewLabel_2 = new JLabel("/");
		
		JRadioButton rdbtnProjetoDeLei = new JRadioButton("Projeto de Lei");
		rdbtnProjetoDeLei.setSelected(true);
		
		JRadioButton rdbtnProjetoDeLeiComp = new JRadioButton("Projeto de Lei Complementar");
		
		rdbtnProjetoDeLei.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	    		if (rdbtnProjetoDeLei.isSelected()) {
	    			rdbtnProjetoDeLeiComp.setSelected(false);
	    			lblNewLabel_3.setEnabled(false);
	    			tfArtigo.setEnabled(false);
	    			lblNewLabel_4.setEnabled(false);
	    			tfVotos.setEnabled(false);
	    		} 
	        }
	    });
		
		rdbtnProjetoDeLeiComp.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	    		if (rdbtnProjetoDeLeiComp.isSelected()) {
	    			rdbtnProjetoDeLei.setSelected(false);
	    			lblNewLabel_3.setEnabled(true);
	    			tfArtigo.setEnabled(true);
	    			lblNewLabel_4.setEnabled(true);
	    			tfVotos.setEnabled(true);
	    		
	    		} 
	        }
	    });
		
		lblNewLabel = new JLabel("/");
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Aprovado");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	    		if (chckbxNewCheckBox.isSelected()) {
	    			lblDataAprovacao.setEnabled(true);
	    			tfDataAprovacao.setEnabled(true);
	    			tfDataAprovacao1.setEnabled(true);
	    			tfDataAprovacao2.setEnabled(true);
	    			lblNewLabel_2_1.setEnabled(true);
	    			lblNewLabel_1.setEnabled(true);
	    		} 
	    		else {
	    			lblDataAprovacao.setEnabled(false);
	    			tfDataAprovacao.setEnabled(false);
	    			tfDataAprovacao1.setEnabled(false);
	    			tfDataAprovacao2.setEnabled(false);
	    			lblNewLabel_2_1.setEnabled(false);
	    			lblNewLabel_1.setEnabled(false);
	    		}
	        }
	    });
		
		lblDataAprovacao = new JLabel("Data da Aprova\u00E7\u00E3o");
		lblDataAprovacao.setEnabled(false);
		lblDataAprovacao.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		tfDataAprovacao = new JFormattedTextField();
		tfDataAprovacao.setEnabled(false);
		tfDataAprovacao.setColumns(2);
		
		lblNewLabel_2_1 = new JLabel("/");
		lblNewLabel_2_1.setEnabled(false);
		
		tfDataAprovacao1 = new JFormattedTextField();
		tfDataAprovacao1.setEnabled(false);
		tfDataAprovacao1.setColumns(2);
		
		lblNewLabel_1 = new JLabel("/");
		lblNewLabel_1.setEnabled(false);
		
		tfDataAprovacao2 = new JFormattedTextField();
		tfDataAprovacao2.setEnabled(false);
		tfDataAprovacao2.setColumns(2);
		
		lblNewLabel_3 = new JLabel("Artigo da Lei Org\u00E2nica");
		lblNewLabel_3.setEnabled(false);
		
		tfArtigo = new JTextField();
		tfArtigo.setEnabled(false);
		tfArtigo.setColumns(10);
		
		lblNewLabel_4 = new JLabel("Quantidade de votos recebidos");
		lblNewLabel_4.setEnabled(false);
		
		tfVotos = new JTextField();
		tfVotos.setEnabled(false);
		tfVotos.setColumns(10);
		
		JButton btnNewButton = new JButton("Cadastrar Projeto");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nomeVereador = tfNomeVereadorProjeto.getText();
				
				ArrayList<String> nomesVereadores = new ArrayList<>();
				for (Partido part : camara.getPartidos()) {
					for(Vereador vereador : part.getVereadores()) {
						nomesVereadores.add(vereador.getNome());
					}
				}
				
				
				if (nomesVereadores.contains(nomeVereador)) {
					try {
						int day = Integer.parseInt(tfDataApresentacao.getText());
						int month = Integer.parseInt(tfDataApresentacao1.getText());
						int year = Integer.parseInt(tfDataApresentacao2.getText());
						
						if (dateIsValid(day, month, year)) {
							DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
							String dataApresentacaoFormatada = tfDataApresentacao.getText() + "/" + tfDataApresentacao1.getText() + "/" + tfDataApresentacao2.getText();
							LocalDate dataApresentacao = LocalDate.parse(dataApresentacaoFormatada, formatter);
							LocalDate dataAprovacao = null;
							
							if (chckbxNewCheckBox.isSelected()) {
								try {
									day = Integer.parseInt(tfDataAprovacao.getText());
									month = Integer.parseInt(tfDataAprovacao1.getText());
									year = Integer.parseInt(tfDataAprovacao2.getText());
									
									if (dateIsValid(day, month, year)) {
										String dataAprovacaoFormatada = tfDataApresentacao.getText() + "/" + tfDataApresentacao1.getText() + "/" + tfDataApresentacao2.getText();
										dataAprovacao = LocalDate.parse(dataAprovacaoFormatada, formatter);
										
									}
									else {
										JOptionPane.showMessageDialog(null, "Erro na data de aprovação inserida");
									}
								}
								catch (Exception eDataAprovacao) {
									JOptionPane.showMessageDialog(null, "Erro na data de aprovação inserida");
								}
							}
							
							if (!tfTitulo.getText().isEmpty()) {
								boolean projetoExiste = false;
								for (ProjetoDeLei proj : projetos) {
									if (proj.getTitulo().equals(tfTitulo.getText())) {
										projetoExiste = true;
									}
								}
								
								if (!projetoExiste) {
									//É projeto de lei
									if (rdbtnProjetoDeLei.isSelected()) {
										ProjetoDeLei projetoLei = new ProjetoDeLei();
										projetoLei.setTitulo(tfTitulo.getText());
										projetoLei.setNumeroProjeto(projetos.size() + 1);
										projetoLei.setDataApresentacao(dataApresentacao);
										if (dataAprovacao != null) {
											projetoLei.setDataAprovacao(dataAprovacao);
										}
										
										projetos.add(projetoLei);
										for (Partido part : camara.getPartidos()) {
											for(Vereador vereador : part.getVereadores()) {
												if (vereador.getNome().equals(nomeVereador)) {
													vereador.addProjeto(projetoLei);
												}
											}
										}
										JOptionPane.showMessageDialog(null, "Projeto de Lei cadastrado com sucesso!");

									}
									
									//É projeto de lei complementar
									else if (rdbtnProjetoDeLeiComp.isSelected()){
										if (!tfArtigo.getText().isEmpty()) {
											String strVotos = tfVotos.getText();
											if (!strVotos.isEmpty()) {
												try {
													int qtdVotos = Integer.parseInt(strVotos);
													
													ProjetoDeLeiComplementar projetoLeiComplementar = new ProjetoDeLeiComplementar();
													projetoLeiComplementar.setTitulo(tfTitulo.getText());
													projetoLeiComplementar.setNumeroProjeto(projetos.size() + 1);
													projetoLeiComplementar.setDataApresentacao(dataApresentacao);
													projetoLeiComplementar.setArtigoLO(tfArtigo.getText());
													projetoLeiComplementar.setQtdVotosFavoraveis(qtdVotos);
													
													if (dataAprovacao != null) {
														projetoLeiComplementar.setDataAprovacao(dataAprovacao);
													}
													
													projetos.add(projetoLeiComplementar);
													for (Partido part : camara.getPartidos()) {
														for(Vereador vereador : part.getVereadores()) {
															if (vereador.getNome().equals(nomeVereador)) {
																vereador.addProjeto(projetoLeiComplementar);
															}
														}
													}
													
													JOptionPane.showMessageDialog(null, "Projeto de Lei Complementar cadastrado com sucesso!");
												}
												catch (Exception eVotos) {
													JOptionPane.showMessageDialog(null, "Informe um número válido em quantidade de votos");
												}
											}
											else {
												JOptionPane.showMessageDialog(null, "Informe a quantidade de votos recebidos no momento da aprovação");
											}
										}
										else {
											JOptionPane.showMessageDialog(null, "Um projeto de Lei Complementar exige um artido da Lei Orgânica ao qual ele se refere");
										}
									}
									
									else {
										JOptionPane.showMessageDialog(null, "Selecione um tipo de projeto de lei");
									}
								}
								else {
									JOptionPane.showMessageDialog(null, "Esse projeto já está cadastrado");
								}

							}
							
							else {
								JOptionPane.showMessageDialog(null, "O título do projeto é obrigatório");
							}

						}
					} 
					catch (Exception eDataApresentacao){
						JOptionPane.showMessageDialog(null, "Erro na data de apresentação inserida");
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "O vereador não foi encontrado.");
				}
			}
		});
		
		lblDataApresentacaoValida = new JLabel("");
		
		lblDataAprovacaoValida = new JLabel("");
		
		lblNewLabel_5 = new JLabel("Nome do Vereador");
		
		tfNomeVereadorProjeto = new JTextField();
		
		lvlNomeDoVereadorExiste = new JLabel("");
		


		GroupLayout gl_jPanel4 = new GroupLayout(jPanel4);
		gl_jPanel4.setHorizontalGroup(
			gl_jPanel4.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_jPanel4.createSequentialGroup()
					.addGroup(gl_jPanel4.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_jPanel4.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_jPanel4.createParallelGroup(Alignment.LEADING)
								.addComponent(chckbxNewCheckBox)
								.addGroup(gl_jPanel4.createSequentialGroup()
									.addGroup(gl_jPanel4.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_1_1_2, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_jPanel4.createSequentialGroup()
											.addComponent(jSeparator1_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(gl_jPanel4.createParallelGroup(Alignment.LEADING)
												.addComponent(rdbtnProjetoDeLei)
												.addComponent(jLabel9_1, GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))
											.addPreferredGap(ComponentPlacement.RELATED))
										.addGroup(gl_jPanel4.createSequentialGroup()
											.addComponent(lblNewLabel_5, GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
											.addPreferredGap(ComponentPlacement.RELATED)))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_jPanel4.createParallelGroup(Alignment.TRAILING)
										.addComponent(tfNomeVereadorProjeto, GroupLayout.PREFERRED_SIZE, 254, GroupLayout.PREFERRED_SIZE)
										.addGroup(Alignment.LEADING, gl_jPanel4.createParallelGroup(Alignment.LEADING)
											.addGroup(gl_jPanel4.createSequentialGroup()
												.addComponent(tfDataApresentacao, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
												.addGap(3)
												.addGroup(gl_jPanel4.createParallelGroup(Alignment.LEADING)
													.addGroup(gl_jPanel4.createSequentialGroup()
														.addGap(7)
														.addComponent(tfDataApresentacao1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
													.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 13, GroupLayout.PREFERRED_SIZE))
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 7, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(tfDataApresentacao2, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addComponent(lblDataApresentacaoValida))
											.addGroup(gl_jPanel4.createSequentialGroup()
												.addGap(84)
												.addComponent(rdbtnProjetoDeLeiComp))
											.addComponent(tfTitulo, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)))
									.addGap(9))
								.addGroup(gl_jPanel4.createSequentialGroup()
									.addGroup(gl_jPanel4.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(lblDataAprovacao, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
										.addComponent(lblNewLabel_3, Alignment.LEADING))
									.addGap(4)
									.addGroup(gl_jPanel4.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_jPanel4.createSequentialGroup()
											.addComponent(tfDataAprovacao, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
											.addGap(3)
											.addGroup(gl_jPanel4.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_jPanel4.createSequentialGroup()
													.addGap(7)
													.addComponent(tfDataAprovacao1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
												.addComponent(lblNewLabel_2_1, GroupLayout.PREFERRED_SIZE, 13, GroupLayout.PREFERRED_SIZE))
											.addGap(4)
											.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 7, GroupLayout.PREFERRED_SIZE)
											.addGap(4)
											.addComponent(tfDataAprovacao2, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(lblDataAprovacaoValida, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE))
										.addComponent(tfArtigo, GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)))
								.addGroup(gl_jPanel4.createSequentialGroup()
									.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(tfVotos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_jPanel4.createSequentialGroup()
							.addGap(139)
							.addComponent(btnNewButton)))
					.addContainerGap())
				.addGroup(gl_jPanel4.createSequentialGroup()
					.addContainerGap(282, Short.MAX_VALUE)
					.addComponent(lvlNomeDoVereadorExiste)
					.addGap(123))
		);
		gl_jPanel4.setVerticalGroup(
			gl_jPanel4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jPanel4.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_jPanel4.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnProjetoDeLei)
						.addComponent(rdbtnProjetoDeLeiComp))
					.addGap(14)
					.addGroup(gl_jPanel4.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_jPanel4.createParallelGroup(Alignment.BASELINE)
							.addComponent(tfTitulo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(jLabel9_1))
						.addComponent(jSeparator1_1, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_jPanel4.createParallelGroup(Alignment.BASELINE)
						.addComponent(tfNomeVereadorProjeto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_5))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lvlNomeDoVereadorExiste)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_jPanel4.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_jPanel4.createSequentialGroup()
							.addGap(13)
							.addGroup(gl_jPanel4.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_1_1_2, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(tfDataApresentacao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_jPanel4.createParallelGroup(Alignment.BASELINE)
									.addComponent(tfDataApresentacao1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblNewLabel)
									.addComponent(tfDataApresentacao2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblDataApresentacaoValida))
								.addGroup(gl_jPanel4.createSequentialGroup()
									.addGap(2)
									.addComponent(lblNewLabel_2)))
							.addGap(18)
							.addComponent(chckbxNewCheckBox)
							.addGap(18)
							.addGroup(gl_jPanel4.createParallelGroup(Alignment.LEADING)
								.addComponent(lblDataAprovacao, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(tfDataAprovacao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(tfDataAprovacao1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_jPanel4.createSequentialGroup()
									.addGap(2)
									.addComponent(lblNewLabel_2_1))
								.addGroup(gl_jPanel4.createSequentialGroup()
									.addGap(3)
									.addComponent(lblNewLabel_1))
								.addComponent(tfDataAprovacao2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18))
						.addGroup(gl_jPanel4.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
							.addComponent(lblDataAprovacaoValida, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)
							.addGap(27)))
					.addGroup(gl_jPanel4.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(tfArtigo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_jPanel4.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_4)
						.addComponent(tfVotos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(61)
					.addComponent(btnNewButton)
					.addContainerGap(128, Short.MAX_VALUE))
		);
		jPanel4.setLayout(gl_jPanel4);

		pack();
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			Partido partido = new Partido();
			partido.setNome(jtfNomePartido.getText());
			partido.setNumero(Integer.parseInt(jtfNumPartido.getText()));
			camara.addPartido(partido);
		} catch (NumberFormatException nfe) {
			JOptionPane.showMessageDialog(this, "Número do partido deve ser dois dígitos");
		} catch (IllegalArgumentException iae) {
			JOptionPane.showMessageDialog(this, iae.getMessage());
		}
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			Vereador vereador = new Vereador(jtfNomeVereador.getText());
			vereador.setQtdProjApres(Integer.parseInt(jtfQtdProjApres.getText()));
			vereador.setQtdProjAprov(Integer.parseInt(jtfQtdProjAprov.getText()));
			pesquisado.addVereador(vereador);
			String msg = "Vereador " + vereador.getNome() + " do partido " + vereador.getPartido().getNome()
					+ " com desempenho " + vereador.getDesempenho();
			JOptionPane.showMessageDialog(this, msg);
			numVereadores += 1;
		} catch (NumberFormatException bfe) {
			JOptionPane.showMessageDialog(this, "Quantidade de projetos deve ser um número");
		} catch (IllegalArgumentException iae) {
			JOptionPane.showMessageDialog(this, iae.getMessage());
		}
	}

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
		String msg = "CÂMARA\n\nTotal de projetos apresentados: " + camara.getTotProjApres()
				+ "\nTotal de projetos aprovados:" + camara.getTotProjAprov();
		JOptionPane.showMessageDialog(this, msg);
	}

	private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
		String msg = "Vereadores acima da média:" + camara.getDesempenhoMedioCamara();
		ArrayList<Vereador> lista = camara.getVereadoresAcimaMediaDesempenho();
		for (Vereador v : lista) {
			msg += "\nVereador " + v.getNome() + " do partido " + v.getPartido().getNome() + " com desempenho "
					+ v.getDesempenho();
		}
		JOptionPane.showMessageDialog(this, msg);
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Windows".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Apresentacao.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Apresentacao.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Apresentacao.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Apresentacao.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Apresentacao().setVisible(true);
			}
		});
	}
	
	private boolean dateIsValid (int day, int month, int year) {
		if (day <= 31 && month <= 12 && year <= 2100 && year >= 1900)
			return true;
		
		return false;
	}

	// Variables declaration
	private javax.swing.JButton jbCadastrarPartido;
	private javax.swing.JButton jbCadastrarVereador;
	private javax.swing.JButton jbMenorDesempenho;
	private javax.swing.JButton jbMaisProjetos;
	private javax.swing.JButton jbEstatisticas;
	private javax.swing.JButton jbTotalProjetos;
	private javax.swing.JButton jbVereadoresAcimaMedia;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jlNomePartido;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JSeparator jSeparator1;
	private javax.swing.JTabbedPane jTabbedPane1;
	private javax.swing.JTextField jtfNumPartido;
	private javax.swing.JTextField jtfNomePartido;
	private javax.swing.JTextField jtfNomeVereador;
	private javax.swing.JTextField jtfNumPartidoVereador;
	private javax.swing.JTextField jtfQtdProjApres;
	private javax.swing.JTextField jtfQtdProjAprov;
	private javax.swing.JTextField jTextField7;
	private JTextField tfTitulo;
	private JLabel lblNewLabel;
	private JLabel lblDataAprovacao;
	private JFormattedTextField tfDataAprovacao;
	private JLabel lblNewLabel_2_1;
	private JFormattedTextField tfDataAprovacao1;
	private JLabel lblNewLabel_1;
	private JFormattedTextField tfDataAprovacao2;
	private JLabel lblNewLabel_3;
	private JTextField tfArtigo;
	private JLabel lblNewLabel_4;
	private JTextField tfVotos;
	private JLabel lblDataApresentacaoValida;
	private JLabel lblDataAprovacaoValida;
	private JLabel lblNewLabel_5;
	private JTextField tfNomeVereadorProjeto;
	private JLabel lvlNomeDoVereadorExiste;
}