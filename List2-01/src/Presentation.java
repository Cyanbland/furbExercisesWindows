import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Presentation {

	private JFrame frame;
	private JTextField tfName;
	private JTextField tfCPF;
	private JTextField tfIncome;
	private JTextField tfUF;
	
	private Taxpayer[] taxpayerArr = new Taxpayer[100];
	private int arrayIndex = 0;
	private JTextField tfQuery;

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
		frame.setBounds(100, 100, 450, 300);
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
				taxpayerArr[arrayIndex] = newTaxpayer;
				arrayIndex++;
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
				for (int i = 0; i < arrayIndex; i++) {
					double tax = taxpayerArr[i].getTaxToPay();
					if (tax > value) {
						msg += taxpayerArr[i].getName() + ", CPF " + taxpayerArr[i].getCpf() + " paga R$" + tax;
					}
				}
				JOptionPane.showMessageDialog(null, msg);
			}
		});
		btnNewButton_1.setBounds(284, 199, 119, 23);
		frame.getContentPane().add(btnNewButton_1);
	}
}
