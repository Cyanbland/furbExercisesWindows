import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class Prasentation {

	private JFrame frame;
	private JTextField tfSize;
	private JTextField tfValue;
	private JTextField tfPos;
	private JButton btnOk;
	private RealArray myObjRA, prevObjRA;
	private JButton btnEven;
	private JButton btnDifference;
	private JButton btnReverse;
	private JButton btnShow;
	private JButton btnStore;
	private JButton btnDivide;
	private JButton btnMulti;
	private JTextArea textArea;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prasentation window = new Prasentation();
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
	public Prasentation() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 658);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Digite o tamanho do vetor:");
		lblNewLabel.setBounds(10, 25, 166, 14);
		frame.getContentPane().add(lblNewLabel);
		
		tfSize = new JTextField();
		tfSize.setBounds(175, 22, 86, 20);
		frame.getContentPane().add(tfSize);
		tfSize.setColumns(10);
		
		JButton btn = new JButton("Criar");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				myObjRA = new RealArray(Integer.parseInt(tfSize.getText()));
				tfValue.setEditable(true);
				tfPos.setEditable(true);
				btnOk.setEnabled(true);
				btnEven.setEnabled(true);
				btnReverse.setEnabled(true);
				btnDifference.setEnabled(true);
				btnShow.setEnabled(true);
				btnStore.setEnabled(true);
				btnDivide.setEnabled(true);
				btnMulti.setEnabled(true);
				
			}
		});
		btn.setBounds(335, 21, 89, 23);
		frame.getContentPane().add(btn);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(20, 50, 392, 2);
		frame.getContentPane().add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Entre com");
		lblNewLabel_1.setBounds(10, 88, 59, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		tfValue = new JTextField();
		tfValue.setEditable(false);
		tfValue.setBounds(79, 85, 86, 20);
		frame.getContentPane().add(tfValue);
		tfValue.setColumns(10);
		
		tfPos = new JTextField();
		tfPos.setEditable(false);
		tfPos.setBounds(220, 88, 86, 20);
		frame.getContentPane().add(tfPos);
		tfPos.setColumns(10);
		
		btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myObjRA.setValue(Double.parseDouble(tfValue.getText()), Integer.parseInt(tfPos.getText()));
				tfValue.setText("");
				tfPos.setText("");
			}
		});
		btnOk.setEnabled(false);
		btnOk.setBounds(335, 87, 89, 23);
		frame.getContentPane().add(btnOk);
		
		JLabel lblNewLabel_2 = new JLabel("Valor");
		lblNewLabel_2.setBounds(107, 63, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Posi\u00E7\u00E3o");
		lblNewLabel_3.setBounds(244, 63, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		btnEven = new JButton("Quantos pares");
		btnEven.setEnabled(false);
		btnEven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Quantidade de pares: " + myObjRA.getEvenQuantity());
			}
		});
		btnEven.setBounds(10, 158, 200, 23);
		frame.getContentPane().add(btnEven);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(20, 146, 392, -17);
		frame.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(20, 133, 385, 2);
		frame.getContentPane().add(separator_2);
		
		btnDifference = new JButton("Maior diferen\u00E7a consecutiva");
		btnDifference.setEnabled(false);
		btnDifference.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Maior diferença consecutiva: " + myObjRA.getGreatestConsecutiveDifference());
			}
		});
		btnDifference.setBounds(220, 158, 204, 23);
		frame.getContentPane().add(btnDifference);
		
		btnReverse = new JButton("Inverter");
		btnReverse.setEnabled(false);
		btnReverse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				myObjRA.reverseArray();
			}
		});
		btnReverse.setBounds(220, 213, 204, 23);
		frame.getContentPane().add(btnReverse);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 353, 414, 180);
		frame.getContentPane().add(scrollPane);
		
		btnShow = new JButton("Exibir vetor");
		btnShow.setEnabled(false);
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				textArea.append("\n[");
//				for (int i = 0; i < myObjRA.getSize(); i++) {
//					textArea.append(myObjRA.getValue(i) + ", ");
//				}
//				textArea.append("]");
				textArea.append("\n" + myObjRA.toString());
			}
		});
		btnShow.setBounds(151, 567, 155, 23);
		frame.getContentPane().add(btnShow);
		
		btnStore = new JButton("Armazenar");
		btnStore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				prevObjRA = myObjRA;
			}
		});
		btnStore.setEnabled(false);
		btnStore.setBounds(10, 265, 200, 23);
		frame.getContentPane().add(btnStore);
		
		btnDivide = new JButton("Dividir");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RealArray newVR = myObjRA.division(prevObjRA);
				textArea.append("\nDivisão = " + newVR.toString());
			}
		});
		btnDivide.setEnabled(false);
		btnDivide.setBounds(220, 265, 204, 23);
		frame.getContentPane().add(btnDivide);
		
		textArea = new JTextArea();
		textArea.setBounds(12, 353, 412, 178);
		frame.getContentPane().add(textArea);
		
		btnMulti = new JButton("Multiplicar");
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double result = myObjRA.multiplication(prevObjRA);
				textArea.append("\nMultiplicação = " + result);
			}
		});
		btnMulti.setEnabled(false);
		btnMulti.setBounds(10, 213, 200, 23);
		frame.getContentPane().add(btnMulti);
		
		btnNewButton = new JButton("Limpar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
			}
		});
		btnNewButton.setBounds(20, 542, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
