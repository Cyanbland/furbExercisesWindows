import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.HashMap;
import java.awt.event.ActionEvent;

public class Apresentacao {

	private JFrame frmLista;
	private JTextField tfTitulo;
	private JTextField tfAutor;
	private JTextField tfParecerista;
	private JTextField tfData;
	private JTextField tfTituloConsulta;
	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private HashMap<String, Obra> acervo = new HashMap<>();
	private Obra obraAtual;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Apresentacao window = new Apresentacao();
					window.frmLista.setVisible(true);
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
		frmLista = new JFrame();
		frmLista.setTitle("Lista 3 - Exerc\u00EDcio 2");
		frmLista.setBounds(100, 100, 450, 419);
		frmLista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLista.getContentPane().setLayout(null);

		JLabel lblTtuloDaObra = new JLabel("T\u00EDtulo da obra:");
		lblTtuloDaObra.setBounds(10, 11, 93, 14);
		frmLista.getContentPane().add(lblTtuloDaObra);

		tfTitulo = new JTextField();
		tfTitulo.setBounds(113, 8, 216, 20);
		frmLista.getContentPane().add(tfTitulo);
		tfTitulo.setColumns(10);

		JLabel lblNomeDoAutor = new JLabel("Nome do autor:");
		lblNomeDoAutor.setBounds(10, 36, 93, 14);
		frmLista.getContentPane().add(lblNomeDoAutor);

		tfAutor = new JTextField();
		tfAutor.setBounds(113, 33, 216, 20);
		frmLista.getContentPane().add(tfAutor);
		tfAutor.setColumns(10);

		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				obraAtual = new Obra(tfTitulo.getText(), tfAutor.getText());
				acervo.put(obraAtual.getTitulo(), obraAtual);
				JOptionPane.showMessageDialog(frmLista, "Obra cadastrada");
			}
		});
		btnCadastrar.setBounds(335, 32, 89, 23);
		frmLista.getContentPane().add(btnCadastrar);

		JLabel lblNomeDoParecerista = new JLabel("Nome do parecerista:");
		lblNomeDoParecerista.setBounds(10, 95, 141, 14);
		frmLista.getContentPane().add(lblNomeDoParecerista);

		tfParecerista = new JTextField();
		tfParecerista.setBounds(153, 92, 155, 20);
		frmLista.getContentPane().add(tfParecerista);
		tfParecerista.setColumns(10);

		JLabel lblData = new JLabel("Data:");
		lblData.setBounds(10, 120, 46, 14);
		frmLista.getContentPane().add(lblData);

		tfData = new JTextField();
		tfData.setBounds(97, 120, 86, 20);
		frmLista.getContentPane().add(tfData);
		tfData.setColumns(10);

		JLabel lblContedo = new JLabel("Conte\u00FAdo:");
		lblContedo.setBounds(10, 155, 75, 14);
		frmLista.getContentPane().add(lblContedo);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(95, 151, 234, 99);
		frmLista.getContentPane().add(scrollPane);

		JTextArea taConteudo = new JTextArea();
		scrollPane.setViewportView(taConteudo);

		JButton btnInserir = new JButton("Inserir");
		btnInserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Parecer umParecer = new Parecer(tfParecerista.getText(), LocalDate.parse(tfData.getText(), formatter),
						taConteudo.getText());
				String msg;
				if (obraAtual.addParecer(umParecer)) {
					msg = "Parecer inclu�do";
				} else {
					msg = "Parecer N�O inclu�do!";
				}
				JOptionPane.showMessageDialog(frmLista, msg);
			}
		});
		btnInserir.setBounds(335, 155, 89, 23);
		frmLista.getContentPane().add(btnInserir);

		JLabel lblTtuloAConsultar = new JLabel("T\u00EDtulo a consultar:");
		lblTtuloAConsultar.setBounds(10, 282, 103, 14);
		frmLista.getContentPane().add(lblTtuloAConsultar);

		tfTituloConsulta = new JTextField();
		tfTituloConsulta.setBounds(119, 279, 210, 20);
		frmLista.getContentPane().add(tfTituloConsulta);
		tfTituloConsulta.setColumns(10);

		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Obra obraPesq = acervo.get(tfTituloConsulta.getText());
				String msg;
				if (obraPesq == null) {
					msg = "T�tulo n�o encontrado!";
				} else {
					msg = obraPesq.mostrarObra();
				}
				JOptionPane.showMessageDialog(frmLista, msg);
			}
		});
		btnConsultar.setBounds(335, 278, 89, 23);
		frmLista.getContentPane().add(btnConsultar);
	}
}