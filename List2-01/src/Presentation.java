import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;

public class Presentation {

	private JFrame frame;
	private JTextField tfName;
	private JTextField tfCPF;
	private JTextField tfIncome;
	private JTextField tfUF;
	
	//private Taxpayer[] taxpayerArr = new Taxpayer[100];
	private HashMap<String, Taxpayer> hashTaxpayer = new HashMap<>();
	private ArrayList<Taxpayer> listTaxpayer = new ArrayList<>();
	private int arrayIndex = 0;
	private JTextField tfQuery;
	private JTextField tfCPFConsult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Presentation window = new Presentation();
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
	public Presentation() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 426);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome do contribuinte:");
		lblNewLabel.setBounds(10, 32, 144, 14);
		frame.getContentPane().add(lblNewLabel);
		
		tfName = new JTextField();
		tfName.setBounds(164, 29, 239, 20);
		frame.getContentPane().add(tfName);
		tfName.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("CPF:");
		lblNewLabel_1.setBounds(34, 65, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		tfCPF = new JTextField();
		tfCPF.setBounds(78, 62, 111, 20);
		frame.getContentPane().add(tfCPF);
		tfCPF.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Estado:");
		lblNewLabel_2.setBounds(235, 65, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Renda anual:  R$");
		lblNewLabel_3.setBounds(10, 112, 144, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		tfIncome = new JTextField();
		tfIncome.setBounds(164, 109, 111, 20);
		frame.getContentPane().add(tfIncome);
		tfIncome.setColumns(10);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Taxpayer newTaxpayer = new Taxpayer();
				newTaxpayer.setName(tfName.getText());
				newTaxpayer.setCpf(tfCPF.getText());
				newTaxpayer.setUf(tfUF.getText());
				newTaxpayer.setAnualIncome(Double.parseDouble(tfIncome.getText()));
				double tax = newTaxpayer.getTaxToPay();
				String msg = "O contribuinte " + newTaxpayer.getName() + " pagará de imposto R$" + tax;
				
				JOptionPane.showMessageDialog(null, msg);
				hashTaxpayer.put(newTaxpayer.getCpf(), newTaxpayer);
				listTaxpayer.add(newTaxpayer);
			}
		});
		btnNewButton.setBounds(284, 108, 119, 23);
		frame.getContentPane().add(btnNewButton);
		
		tfUF = new JTextField();
		tfUF.setText("");
		tfUF.setBounds(284, 62, 46, 20);
		frame.getContentPane().add(tfUF);
		tfUF.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Valor a consultar:  R$");
		lblNewLabel_4.setBounds(10, 203, 144, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		tfQuery = new JTextField();
		tfQuery.setBounds(164, 200, 111, 20);
		frame.getContentPane().add(tfQuery);
		tfQuery.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Consultar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double value = Double.parseDouble(tfQuery.getText());
				String msg = "Contribuintes com imposto acima de R$" + value;
				for (int i = 0; i < listTaxpayer.size(); i++) {
					Taxpayer t = listTaxpayer.get(i);
					double tax = t.getTaxToPay();
					if (tax > value) {
						msg += t.getName() + ", CPF " + t.getCpf() + " paga R$" + tax;
					}
				}
				JOptionPane.showMessageDialog(null, msg);
			}
		});
		btnNewButton_1.setBounds(284, 199, 119, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_5 = new JLabel("CPF a consultar");
		lblNewLabel_5.setBounds(10, 266, 92, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		tfCPFConsult = new JTextField();
		tfCPFConsult.setBounds(112, 263, 111, 20);
		frame.getContentPane().add(tfCPFConsult);
		tfCPFConsult.setColumns(10);
		
		JButton btn_ConsultCPF = new JButton("Consultar CPF");
		btn_ConsultCPF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Taxpayer t = hashTaxpayer.get(tfCPFConsult.getText());
				String msg;
				
				if (t == null) {
					msg = "CPF não localizado";
				}
				else {
					msg = "Contribuinte " + t.getName() + " - CPF " + t.getCpf() + " pagará de imposto R$" + t.getTaxToPay();
				}
				
				JOptionPane.showMessageDialog(frame, msg);
				//janela spawnará em referência a janela frame
			}
		});
		btn_ConsultCPF.setBounds(284, 262, 119, 23);
		frame.getContentPane().add(btn_ConsultCPF);
		
		JButton btnNewButton_2 = new JButton("% dos estados");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double totSC, totPR, totRS, totGeneral;
				totSC = totPR = totRS = totGeneral = 0;
				
				for(int i = 0; i < listTaxpayer.size(); i++) {
					Taxpayer t = listTaxpayer.get(i);
					double tax = t.getTaxToPay();
					if (t.getUf().equals("SC")) {
						totSC += tax;
					}
					else if (t.getUf().equals("PR")) {
						totPR += tax;
					}
					else if (t.getUf().equals("RS")) {
						totRS += tax;
					}
				}
				String msg = "Participação % dos estados\n";
				msg += "\nSC = " + totSC + " = " + (totSC/totGeneral)*100 + "%";
				msg += "\nPR = " + totPR + " = " + (totPR/totGeneral)*100 + "%";
				msg += "\nRS = " + totRS + " = " + (totRS/totGeneral)*100 + "%";
				msg += "\nGeral = " + totGeneral;
				
				JOptionPane.showMessageDialog(frame, msg);
			}
		});
		btnNewButton_2.setBounds(141, 322, 166, 23);
		frame.getContentPane().add(btnNewButton_2);
	}
}
