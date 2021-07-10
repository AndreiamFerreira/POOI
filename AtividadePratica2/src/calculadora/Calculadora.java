package calculadora;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField FieldResultado;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton buttonSoma;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton buttonSubtração;
	private JButton button7;
	private JButton button8;
	private JButton button9;
	private JButton buttonDivisão;
	private JButton button0;
	private JButton buttonPot;
	private JButton buttonC;
	private JButton buttonCE;
	private JPanel panel;
	private JButton buttonCalcular;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	public Calculadora() {
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 243, 309);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel1 = new JPanel();
		contentPane.add(panel1, BorderLayout.NORTH);
		panel1.setLayout(new BoxLayout(panel1, BoxLayout.X_AXIS));
		
		FieldResultado = new JTextField();
		FieldResultado.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel1.add(FieldResultado);
		FieldResultado.setColumns(10);
		FieldResultado.setPreferredSize(new Dimension(5, 40));
		
		JPanel panel2 = new JPanel();
		contentPane.add(panel2, BorderLayout.CENTER);
		panel2.setLayout(new GridLayout(0, 4, 0, 0));
		
		button1 = new JButton("1");
		panel2.add(button1);
		
		button2 = new JButton("2");
		panel2.add(button2);
		
		button3 = new JButton("3");
		panel2.add(button3);
		
		buttonSoma = new JButton("+");
		panel2.add(buttonSoma);
		
		button4 = new JButton("4");
		panel2.add(button4);
		
		button5 = new JButton("5");
		panel2.add(button5);
		
		button6 = new JButton("6");
		panel2.add(button6);
		
		buttonSubtração = new JButton("-");
		panel2.add(buttonSubtração);
		
		button7 = new JButton("7");
		panel2.add(button7);
		
		button8 = new JButton("8");
		panel2.add(button8);
		
		button9 = new JButton("9");
		panel2.add(button9);
		
		buttonDivisão = new JButton("/");
		panel2.add(buttonDivisão);
		
		button0 = new JButton("0");
		panel2.add(button0);
		
		buttonPot = new JButton("^");
		panel2.add(buttonPot);
		
		buttonC = new JButton("C");
		panel2.add(buttonC);
		
		buttonCE = new JButton("CE");
		panel2.add(buttonCE);
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		
		buttonCalcular = new JButton("Calcular");
		buttonCalcular.setHorizontalTextPosition(SwingConstants.LEFT);
		buttonCalcular.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(buttonCalcular);
	}

}
