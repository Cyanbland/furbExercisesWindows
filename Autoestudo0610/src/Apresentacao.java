import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.text.DateFormatter;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.awt.event.ActionEvent;

public class Apresentacao {

	private JFrame frame;
	private JTextField tfRua;
	private JTextField tfNumeroEndereco;
	private JTextField tfCidade;
	private JLabel lblNewLabel_1_1_1_1_1_1;
	private JComboBox<String> comboBoxEstado;
	private JTextField tfNome;
	private JTextField tfNumeroTelefone;
	private JTextField tfDataInstalacao;
	private final JSeparator separator = new JSeparator();
	private JTextField tfConsulta;
	private JTextField tfQtdOcorrencias;
	private JLabel lblConexao;
	private JCheckBox chckbxConexao;
	private JLabel lblRamo;
	private JTextField tfRamo;
	private JLabel lblQtdOcorrencias;
	
	private HashMap<String, Telefone> telefones = new HashMap<>(); 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Apresentacao window = new Apresentacao();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Apresentacao() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 931, 911);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastro de telefone");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblNewLabel.setBounds(320, 11, 271, 40);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome do usu\u00E1rio");
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(32, 77, 115, 20);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("N\u00FAmero do telefone");
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(32, 121, 127, 20);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Rua");
		lblNewLabel_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_1_1_1.setBounds(589, 77, 115, 20);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o de instala\u00E7\u00E3o");
		lblEndereo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEndereo.setBounds(634, 26, 271, 40);
		frame.getContentPane().add(lblEndereo);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("N\u00FAmero");
		lblNewLabel_1_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_1_1_1_1.setBounds(589, 121, 60, 20);
		frame.getContentPane().add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Cidade");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_1_1_1_1_1.setBounds(589, 169, 115, 20);
		frame.getContentPane().add(lblNewLabel_1_1_1_1_1);
		
		lblNewLabel_1_1_1_1_1_1 = new JLabel("Estado");
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_1_1_1_1_1_1.setBounds(589, 217, 60, 20);
		frame.getContentPane().add(lblNewLabel_1_1_1_1_1_1);
		
		tfRua = new JTextField();
		tfRua.setBounds(659, 79, 225, 20);
		frame.getContentPane().add(tfRua);
		tfRua.setColumns(10);
		
		tfNumeroEndereco = new JTextField();
		tfNumeroEndereco.setColumns(10);
		tfNumeroEndereco.setBounds(659, 123, 225, 20);
		frame.getContentPane().add(tfNumeroEndereco);
		
		tfCidade = new JTextField();
		tfCidade.setColumns(10);
		tfCidade.setBounds(659, 171, 225, 20);
		frame.getContentPane().add(tfCidade);
		
		String[] estados = new String[] { "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RO", "RS", "RR", "SC", "SE", "SP", "TO" };
		comboBoxEstado = new JComboBox(estados);
		comboBoxEstado.setBounds(659, 219, 71, 20);
		frame.getContentPane().add(comboBoxEstado);
		
		tfNome = new JTextField();
		tfNome.setColumns(10);
		tfNome.setBounds(168, 79, 225, 20);
		frame.getContentPane().add(tfNome);
		
		tfNumeroTelefone = new JTextField();
		tfNumeroTelefone.setColumns(10);
		tfNumeroTelefone.setBounds(168, 123, 86, 20);
		frame.getContentPane().add(tfNumeroTelefone);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Data da Instala\u00E7\u00E3o");
		lblNewLabel_1_1_2.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_1_1_2.setBounds(32, 169, 127, 20);
		frame.getContentPane().add(lblNewLabel_1_1_2);
		
		tfDataInstalacao = new JTextField();
		tfDataInstalacao.setBounds(168, 171, 86, 20);
		frame.getContentPane().add(tfDataInstalacao);
		tfDataInstalacao.setColumns(10);
		
		
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Tipo de linha");
		lblNewLabel_1_1_2_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_1_1_2_1.setBounds(32, 217, 127, 20);
		frame.getContentPane().add(lblNewLabel_1_1_2_1);
		
		String[] opcoesLinha = new String[] {"Residencial", "Comercial", "Especializada"};
		JComboBox comboBoxLinha = new JComboBox(opcoesLinha);
		comboBoxLinha.setSelectedIndex(-1);
		comboBoxLinha.setBounds(168, 219, 137, 20);
		frame.getContentPane().add(comboBoxLinha);
		comboBoxLinha.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if (comboBoxLinha.getSelectedItem().equals(opcoesLinha[0])) {
					lblConexao.setEnabled(true);
					chckbxConexao.setEnabled(true);
					lblRamo.setEnabled(false);
					tfRamo.setEnabled(false);
					lblQtdOcorrencias.setEnabled(false);
					tfQtdOcorrencias.setEnabled(false);
				}
				else if (comboBoxLinha.getSelectedItem().equals(opcoesLinha[1])) {
					lblConexao.setEnabled(false);
					chckbxConexao.setEnabled(false);
					lblRamo.setEnabled(true);
					tfRamo.setEnabled(true);
					lblQtdOcorrencias.setEnabled(false);
					tfQtdOcorrencias.setEnabled(false);
				}
				else if (comboBoxLinha.getSelectedItem().equals(opcoesLinha[2])) {
					lblConexao.setEnabled(false);
					chckbxConexao.setEnabled(false);
					lblRamo.setEnabled(false);
					tfRamo.setEnabled(false);
					lblQtdOcorrencias.setEnabled(true);
					tfQtdOcorrencias.setEnabled(true);
				}
			}
		});
		

		
		chckbxConexao = new JCheckBox("");
		chckbxConexao.setEnabled(false);
		chckbxConexao.setBounds(183, 261, 29, 23);
		frame.getContentPane().add(chckbxConexao);
		
		lblConexao = new JLabel("Conexão com Internet");
		lblConexao.setEnabled(false);
		lblConexao.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblConexao.setBounds(32, 260, 148, 20);
		frame.getContentPane().add(lblConexao);
		separator.setBounds(0, 446, 915, 31);
		frame.getContentPane().add(separator);
		
		JLabel lblConsultaDeTelefone = new JLabel("Consulta de telefone");
		lblConsultaDeTelefone.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblConsultaDeTelefone.setBounds(320, 470, 271, 40);
		frame.getContentPane().add(lblConsultaDeTelefone);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("N\u00FAmero do telefone para consulta");
		lblNewLabel_1_1_3.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_1_1_3.setBounds(330, 536, 219, 20);
		frame.getContentPane().add(lblNewLabel_1_1_3);
		
		tfConsulta = new JTextField();
		tfConsulta.setColumns(10);
		tfConsulta.setBounds(330, 583, 120, 20);
		frame.getContentPane().add(tfConsulta);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(3, 641, 915, 31);
		frame.getContentPane().add(separator_1);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
					LocalDate data = LocalDate.parse(tfDataInstalacao.getText(), formatter);
					String numeroTelefone = tfNumeroTelefone.getText();
					
					if (comboBoxLinha.getSelectedItem().equals(opcoesLinha[0])) {
						//Residencial
						Residencial telefoneResidencial = new Residencial(data, numeroTelefone, chckbxConexao.isSelected());
						telefones.put(numeroTelefone, telefoneResidencial);
					}
					else if (comboBoxLinha.getSelectedItem().equals(opcoesLinha[1])) {
						//Comercial	
						String ramoAtividade = tfRamo.getText();
						Comercial telefoneComercial = new Comercial(data, numeroTelefone, ramoAtividade);
						telefones.put(numeroTelefone, telefoneComercial);

					}
					else if (comboBoxLinha.getSelectedItem().equals(opcoesLinha[2])) {
						//Especializada
						int qtdOcor = Integer.parseInt(tfQtdOcorrencias.getText());
						Especializada telefoneEspecializada = new Especializada(data, numeroTelefone, qtdOcor);
						telefones.put(numeroTelefone, telefoneEspecializada);
					}
					
					
				} catch(IllegalArgumentException iae) {
					JOptionPane.showMessageDialog(frame, iae.getMessage());
				}
				
			}
		});
		btnCadastrar.setBounds(707, 377, 133, 30);
		frame.getContentPane().add(btnCadastrar);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setBounds(460, 582, 89, 23);
		frame.getContentPane().add(btnConsultar);
		
		JLabel lblVerificarPotencialFaturamento = new JLabel("Verificar potencial faturamento da empresa");
		lblVerificarPotencialFaturamento.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblVerificarPotencialFaturamento.setBounds(204, 660, 500, 40);
		frame.getContentPane().add(lblVerificarPotencialFaturamento);
		
		JButton btnVerificar = new JButton("Verificar");
		btnVerificar.setBounds(382, 723, 133, 30);
		frame.getContentPane().add(btnVerificar);
		
		lblRamo = new JLabel("Ramo de atividade");
		lblRamo.setEnabled(false);
		lblRamo.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblRamo.setBounds(32, 304, 127, 20);
		frame.getContentPane().add(lblRamo);
		
		tfRamo = new JTextField();
		tfRamo.setEnabled(false);
		tfRamo.setColumns(10);
		tfRamo.setBounds(168, 306, 86, 20);
		frame.getContentPane().add(tfRamo);
		
		lblQtdOcorrencias = new JLabel("Quantidade de ocorr\u00EAncias");
		lblQtdOcorrencias.setEnabled(false);
		lblQtdOcorrencias.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblQtdOcorrencias.setBounds(32, 352, 180, 20);
		frame.getContentPane().add(lblQtdOcorrencias);
		
		tfQtdOcorrencias = new JTextField();
		tfQtdOcorrencias.setEnabled(false);
		tfQtdOcorrencias.setColumns(10);
		tfQtdOcorrencias.setBounds(222, 354, 86, 20);
		frame.getContentPane().add(tfQtdOcorrencias);
		

	}
}
