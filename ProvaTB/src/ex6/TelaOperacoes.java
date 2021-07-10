package ex6;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.Insets;
import java.awt.Component;

public class TelaOperacoes extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField fieldCodigo;
	private JTextField fieldRG;
	private JTextField fieldCPF;
	private JTextField fieldClasse;
	private JTextField fieldEndereco;
	private JTextField textNumero;
	private JTextField fieldBairro;
	private JTextField fieldComplemento;
	private JTextField fieldCidade;
	private JTextField fieldUF;
	private JTextField fieldCEP;
	private JTextField fieldFone;
	private JTextField fieldFax;
	private JTextField fieldCelular;
	private JTextField fieldEmail;
	private JTextField fieldCadastro;
	private JTextField fieldSuframa;
	private JTextField fieldObservacao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaOperacoes frame = new TelaOperacoes();
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
	public TelaOperacoes() {
		setEnabled(false);
		setTitle("Tela de Opera\u00E7\u00F5es");
		getContentPane().setLayout(new MigLayout("", "[]", "[]"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 702, 528);
		contentPane = new JPanel();
		contentPane.setSize(new Dimension(4, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[115.00,grow][100.00,grow][100.00,grow][90.00,grow][68.00,grow][119.00]", "[][][][][][][][][][][][][][][][][][]"));
		
		JLabel labelCliente = new JLabel("Cliente");
		labelCliente.setPreferredSize(new Dimension(50, 14));
		contentPane.add(labelCliente, "cell 0 0");
		
		JLabel labelCodigo = new JLabel("C\u00F3digo");
		labelCodigo.setPreferredSize(new Dimension(18, 14));
		contentPane.add(labelCodigo, "cell 5 0,grow");
		
		JComboBox<String> comboBox = new JComboBox<String>();
		contentPane.add(comboBox, "cell 0 1 5 1,growx");
		comboBox.addItem("");
		comboBox.addItem("Mariana Silva");
		comboBox.addItem("José Carlos Oliveira");
		
		fieldCodigo = new JTextField();
		fieldCodigo.setPreferredSize(new Dimension(0, 20));
		fieldCodigo.setMaximumSize(new Dimension(2147483630, 2147483647));
		fieldCodigo.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		contentPane.add(fieldCodigo, "cell 5 1,grow");
		fieldCodigo.setColumns(1);
		
		JLabel labelRG = new JLabel("RG");
		labelRG.setPreferredSize(new Dimension(30, 14));
		labelRG.setHorizontalTextPosition(SwingConstants.LEFT);
		labelRG.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(labelRG, "flowx,cell 0 2");
		
		JLabel labelCPF = new JLabel("CPF");
		contentPane.add(labelCPF, "cell 1 2");
		
		JLabel labelClasse = new JLabel("Classe");
		contentPane.add(labelClasse, "cell 2 2");
		
		fieldRG = new JTextField();
		contentPane.add(fieldRG, "cell 0 3,grow");
		fieldRG.setColumns(15);
		
		fieldCPF = new JTextField();
		contentPane.add(fieldCPF, "cell 1 3,growx");
		fieldCPF.setColumns(10);
		
		fieldClasse = new JTextField();
		contentPane.add(fieldClasse, "cell 2 3 3 1,growx");
		fieldClasse.setColumns(10);
		
		JCheckBox checkBoxInativo = new JCheckBox("Inativo");
		contentPane.add(checkBoxInativo, "cell 5 3");
		
		JLabel labelEndereco = new JLabel("Endere\u00E7o");
		contentPane.add(labelEndereco, "cell 0 4");
		
		JLabel labelNumero = new JLabel("N\u00FAmero");
		contentPane.add(labelNumero, "cell 3 4");
		
		JLabel labelBairro = new JLabel("Bairro");
		contentPane.add(labelBairro, "cell 4 4,alignx left,aligny baseline");
		
		fieldEndereco = new JTextField();
		fieldEndereco.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(fieldEndereco, "cell 0 5 3 1,growx");
		fieldEndereco.setColumns(10);
		
		textNumero = new JTextField();
		contentPane.add(textNumero, "cell 3 5,growx");
		textNumero.setColumns(10);
		
		fieldBairro = new JTextField();
		contentPane.add(fieldBairro, "cell 4 5 2 1,growx");
		fieldBairro.setColumns(10);
		
		JLabel labelComplemento = new JLabel("Complemento");
		contentPane.add(labelComplemento, "cell 0 6");
		
		JLabel labelCidade = new JLabel("Cidade");
		contentPane.add(labelCidade, "cell 1 6");
		
		JLabel labelUF = new JLabel("UF");
		contentPane.add(labelUF, "cell 3 6");
		
		JLabel labelCEP = new JLabel("CEP");
		contentPane.add(labelCEP, "cell 4 6");
		
		fieldComplemento = new JTextField();
		contentPane.add(fieldComplemento, "cell 0 7,growx");
		fieldComplemento.setColumns(10);
		
		fieldCidade = new JTextField();
		contentPane.add(fieldCidade, "cell 1 7 2 1,growx");
		fieldCidade.setColumns(10);
		
		fieldUF = new JTextField();
		contentPane.add(fieldUF, "cell 3 7,growx");
		fieldUF.setColumns(10);
		
		fieldCEP = new JTextField();
		contentPane.add(fieldCEP, "cell 4 7 2 1,growx");
		fieldCEP.setColumns(10);
		
		JLabel labelFone = new JLabel("Fone");
		contentPane.add(labelFone, "cell 0 8,alignx left");
		
		JLabel labelFax = new JLabel("Fax");
		contentPane.add(labelFax, "cell 2 8");
		
		fieldFone = new JTextField();
		fieldFone.setPreferredSize(new Dimension(7, 100));
		contentPane.add(fieldFone, "cell 0 9 2 1,growx");
		fieldFone.setColumns(10);
		
		fieldFax = new JTextField();
		fieldFax.setPreferredSize(new Dimension(7, 100));
		contentPane.add(fieldFax, "cell 2 9 3 1,growx");
		fieldFax.setColumns(10);
		
		JLabel labelCelular = new JLabel("Celular");
		contentPane.add(labelCelular, "cell 0 10");
		
		JLabel labelEmail = new JLabel("E-mail");
		contentPane.add(labelEmail, "cell 2 10");
		
		fieldCelular = new JTextField();
		contentPane.add(fieldCelular, "cell 0 11 2 1,growx");
		fieldCelular.setColumns(10);
		
		fieldEmail = new JTextField();
		contentPane.add(fieldEmail, "cell 2 11 3 1,growx");
		fieldEmail.setColumns(10);
		
		JLabel labelCadastroProdutorRural = new JLabel("Cadastro Produtor Rural");
		contentPane.add(labelCadastroProdutorRural, "cell 0 12");
		
		JLabel labelCadastroSuframa = new JLabel("Cadastro SUFRAMA");
		contentPane.add(labelCadastroSuframa, "cell 2 12");
		
		fieldCadastro = new JTextField();
		contentPane.add(fieldCadastro, "cell 0 13 2 1,growx");
		fieldCadastro.setColumns(10);
		
		fieldSuframa = new JTextField();
		contentPane.add(fieldSuframa, "cell 2 13 3 1,growx");
		fieldSuframa.setColumns(10);
		
		JLabel labelObservacao = new JLabel("Observa\u00E7\u00E3o");
		contentPane.add(labelObservacao, "cell 0 14");
		
		fieldObservacao = new JTextField();
		fieldObservacao.setPreferredSize(new Dimension(7, 55));
		contentPane.add(fieldObservacao, "cell 0 15 6 1,growx");
		fieldObservacao.setColumns(10);
		
		JButton buttonBuscaAvancada = new JButton("Busca Ava\u00E7ada");
		buttonBuscaAvancada.setPreferredSize(new Dimension(150, 23));	
		buttonBuscaAvancada.setHorizontalTextPosition(SwingConstants.CENTER);
		contentPane.add(buttonBuscaAvancada, "flowx,cell 0 16");
		
		JButton buttonUltimaBusca = new JButton("\u00DAltima Busca");
		buttonUltimaBusca.setPreferredSize(new Dimension(120, 23));
		buttonUltimaBusca.setAlignmentX(Component.CENTER_ALIGNMENT);
		contentPane.add(buttonUltimaBusca, "cell 1 16");
		
		JButton buttonMenor = new JButton("<|");
		buttonMenor.setPreferredSize(new Dimension(60, 23));
		buttonMenor.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(buttonMenor, "flowx,cell 2 16,alignx left,growy");
		
		JButton buttonMaior = new JButton("|>");
		buttonMaior.setPreferredSize(new Dimension(60, 23));
		buttonMaior.setHorizontalAlignment(SwingConstants.RIGHT);
		buttonMaior.setMargin(new Insets(2, 9, 2, 14));
		contentPane.add(buttonMaior, "cell 2 16,alignx right,growy");
		
		JButton buttonCrediario = new JButton("Credi\u00E1rio");
		buttonCrediario.setPreferredSize(new Dimension(150, 23));
		contentPane.add(buttonCrediario, "cell 0 17");
		
		JButton buttonOperacoes = new JButton("Opera\u00E7\u00F5es");
		buttonOperacoes.setPreferredSize(new Dimension(120, 23));
		contentPane.add(buttonOperacoes, "cell 1 17");
		
		JButton buttonResumo = new JButton("Resumo");
		buttonResumo.setPreferredSize(new Dimension(100, 23));
		contentPane.add(buttonResumo, "cell 2 17");
		
		JButton buttonDevedores = new JButton("Devedores");
		buttonDevedores.setPreferredSize(new Dimension(100, 23));
		contentPane.add(buttonDevedores, "cell 3 17");
		
		JButton buttonEditarFicha = new JButton("Editar Ficha");
		buttonEditarFicha.setPreferredSize(new Dimension(80, 23));
		contentPane.add(buttonEditarFicha, "cell 4 17");
		
		JButton buttonSair = new JButton("Sair");
		buttonSair.setPreferredSize(new Dimension(100, 23));
		contentPane.add(buttonSair, "cell 5 17,alignx center");
	}

}
