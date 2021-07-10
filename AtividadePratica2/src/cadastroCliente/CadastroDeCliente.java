package cadastroCliente;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.BoxLayout;

public class CadastroDeCliente extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField TextFieldCPF;
	private JTextField textField_1;
	private JTextField textFieldNome;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroDeCliente frame = new CadastroDeCliente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CadastroDeCliente() {
		setTitle("Janela de Cadastro de Clientes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 461, 181);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		
		JPanel panel = new JPanel();
		panel.setAlignmentX(Component.LEFT_ALIGNMENT);
		contentPane.add(panel);
		
		JLabel LabelCPF = new JLabel("CPF: ");
		panel.add(LabelCPF);
		
		TextFieldCPF = new JTextField();
		panel.add(TextFieldCPF);
		TextFieldCPF.setColumns(10);
		
		JLabel LabelNome = new JLabel("Nome");
		panel.add(LabelNome);
		
		textFieldNome = new JTextField();
		panel.add(textField_1);
		
		textFieldNome = new JTextField();
		panel.add(textFieldNome);
		textFieldNome.setColumns(20);
		
		JPanel panel_2 = new JPanel();
		panel_2.setAlignmentX(Component.LEFT_ALIGNMENT);
		contentPane.add(panel_2);
		
		JLabel LabelEndereco = new JLabel("Endere\u00E7o: ");
		LabelEndereco.setHorizontalAlignment(SwingConstants.LEFT);
		panel_2.add(LabelEndereco);
		
		textField = new JTextField();
		textField.setColumns(15);
		panel_2.add(textField);
		
		JLabel LabelProfissao = new JLabel("Profiss\u00E3o:");
		panel_2.add(LabelProfissao);
		
		@SuppressWarnings("rawtypes")
		JComboBox comboBoxProfissao = new JComboBox();
		comboBoxProfissao.setForeground(new Color(255, 255, 255));
		comboBoxProfissao.setEditable(true);
		panel_2.add(comboBoxProfissao);
		comboBoxProfissao.setPreferredSize(new Dimension(122,24));
		

		
		JPanel panel_1 = new JPanel();
		panel_1.setAlignmentX(Component.LEFT_ALIGNMENT);
		contentPane.add(panel_1);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBackground(new Color(255, 255, 255));
		btnCadastrar.setForeground(Color.BLACK);
		panel_1.add(btnCadastrar);
		
		JButton btnLimpar = new JButton("Limpar");
		panel_1.add(btnLimpar);
		textField_1.setColumns(10);
	}
	
	

}
