package pct_01;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.function.ToDoubleFunction;
import java.awt.event.KeyAdapter;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	public int numero1;
	public int numero2;
	public int botao;
	public double visor;
	public double numeroCompleto;
	public double numeroCompleto2;
	public String operacao;
	public Double resultado;
	public String valorInserido;
	JPanel painel;
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
		setFont(new Font("Dialog", Font.BOLD, 10));
		setBackground(Color.WHITE);
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 759, 692);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea taVisor = new JTextArea();
		taVisor.setEditable(false);
		taVisor.setForeground(new Color(0, 128, 0));
		taVisor.setLineWrap(true);
		taVisor.setFont(new Font("Monospaced", Font.BOLD, 35));
		taVisor.setBackground(new Color(0, 0, 0));
		taVisor.setBounds(15, 31, 707, 108);
		contentPane.add(taVisor);
		
		JButton btnN1 = new JButton("1");
		btnN1.setMnemonic(java.awt.event.KeyEvent.VK_1);
		btnN1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnN1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	
				
				botao = 1;
				numero2 = 1;
				taVisor.setText(taVisor.getText()+botao);
				
				numeroCompleto = Double.parseDouble(taVisor.getText());
			}
		});
		
		btnN1.setBounds(15, 195, 92, 61);
		contentPane.add(btnN1);
		
		JButton btnN2 = new JButton("2");
		btnN2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		        
				botao = 2;
				numero1 = 2;
				taVisor.setText(taVisor.getText()+botao);
				
				numeroCompleto = Double.parseDouble(taVisor.getText());
			}
		});
		btnN2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnN2.setBounds(130, 195, 92, 61);
		contentPane.add(btnN2);
		
		JButton btnN3 = new JButton("3");
		btnN3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				botao = 3;
				numero1 = 3;
				taVisor.setText(taVisor.getText()+botao);
				
				numeroCompleto = Double.parseDouble(taVisor.getText());
			}
		});
		btnN3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnN3.setBounds(254, 195, 92, 61);
		contentPane.add(btnN3);
		
		JButton btnN4 = new JButton("4");
		btnN4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                
				botao = 4;
				numero1 = 4;
				taVisor.setText(taVisor.getText()+botao);
				
				numeroCompleto = Double.parseDouble(taVisor.getText());
			}
		});
		btnN4.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnN4.setBounds(15, 275, 92, 61);
		contentPane.add(btnN4);
		
		JButton btnN5 = new JButton("5");
		btnN5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				botao = 5;
				numero1 = 5;
				taVisor.setText(taVisor.getText()+botao);
				
				numeroCompleto = Double.parseDouble(taVisor.getText());
			}
		});
		btnN5.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnN5.setBounds(130, 275, 92, 61);
		contentPane.add(btnN5);
		
		JButton btnN6 = new JButton("6");
		btnN6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    
				botao = 6;
				numero1 = 6;
				taVisor.setText(taVisor.getText()+botao);
				
				numeroCompleto = Double.parseDouble(taVisor.getText());
			}
		});
		btnN6.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnN6.setBounds(254, 275, 92, 61);
		contentPane.add(btnN6);
		
		JButton btnN7 = new JButton("7");
		btnN7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                
				botao = 7;
				numero1 = 7;
				taVisor.setText(taVisor.getText()+botao);
				
				numeroCompleto = Double.parseDouble(taVisor.getText());
			}
		});
		btnN7.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnN7.setBounds(15, 359, 92, 61);
		contentPane.add(btnN7);
		
		JButton btnN8 = new JButton("8");
		btnN8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				botao = 8;
				numero1 = 8;
				taVisor.setText(taVisor.getText()+botao);
				
				numeroCompleto = Double.parseDouble(taVisor.getText());
			}
		});
		btnN8.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnN8.setBounds(130, 359, 92, 61);
		contentPane.add(btnN8);
		
		JButton btnN9 = new JButton("9");
		btnN9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				botao = 9;
				numero1 = 9;
				taVisor.setText(taVisor.getText()+botao);
				
				numeroCompleto = Double.parseDouble(taVisor.getText());
			}
		});
		btnN9.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnN9.setBounds(254, 359, 92, 61);
		contentPane.add(btnN9);
		
		JButton btnN0 = new JButton("0");
		btnN0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				botao = 0;
				numero1 = 0;
				taVisor.setText(taVisor.getText()+botao);
				
				numeroCompleto = Double.parseDouble(taVisor.getText());
			}
		});
		btnN0.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnN0.setBounds(130, 436, 92, 61);
		contentPane.add(btnN0);
		
		JButton btnNewButton_1 = new JButton("+");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				visor = Double.parseDouble(taVisor.getText()); // variável visor recebendo todos os números da textArea taVisor e sendo convertida para double 
		     	taVisor.setText(null); // configurando a textArea para mostrar nada np visor.
				operacao = "soma"; // variável operação recebendo uma string soma.
				numeroCompleto2 = visor; // variável numeroCompleto2 recebe o valor de visor que é igual ao valor que se encontra no visor
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_1.setBounds(375, 195, 92, 61);
		contentPane.add(btnNewButton_1);
		
		
		JButton btnSubtrao = new JButton("-");
		btnSubtrao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				visor = Double.parseDouble(taVisor.getText()); 
				taVisor.setText(null);
				operacao = "subtração";
				numeroCompleto2 = visor; 
			}
		});
		btnSubtrao.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnSubtrao.setBounds(375, 359, 92, 61);
		contentPane.add(btnSubtrao);
		
		JButton btnMultiplicao = new JButton("x");
		btnMultiplicao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
				visor = Double.parseDouble(taVisor.getText());
				taVisor.setText(null);
				operacao = "multiplicação";
				numeroCompleto2 = visor;
			}
		});
		btnMultiplicao.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnMultiplicao.setBounds(375, 275, 92, 61);
		contentPane.add(btnMultiplicao);
		
		JButton btnDiviso = new JButton("/");
		btnDiviso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				visor = Double.parseDouble(taVisor.getText());
				taVisor.setText(null);
				operacao = "divisão";
				numeroCompleto2 = visor;
			}
		});
		btnDiviso.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnDiviso.setBounds(375, 436, 92, 61);
		contentPane.add(btnDiviso);

		JButton btnApagar = new JButton("CE");
		btnApagar.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnApagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				taVisor.setText("");
			}
		});
		btnApagar.setBounds(15, 436, 92, 61);
		contentPane.add(btnApagar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setMnemonic('x');
		btnSair.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnSair.setBounds(499, 539, 133, 61);
		contentPane.add(btnSair);
		
		JButton btnIgual = new JButton("=");
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		           
				/* Todas as operações acontecem com os ultimos numeros digitados*/
				switch(operacao){
				case "soma": resultado = (double) (numeroCompleto + numeroCompleto2);
				     taVisor.setText(String.valueOf(resultado));break;  
				case "subtração": resultado = (double) (numeroCompleto2 - numeroCompleto);
				     taVisor.setText(String.valueOf(resultado));break;
				case "multiplicação": resultado = (double) (numeroCompleto * numeroCompleto2); 
				     taVisor.setText(String.valueOf(resultado));break;
				case "divisão": resultado = (double) (numeroCompleto2 / numeroCompleto);
				     taVisor.setText(String.valueOf(resultado));break;
				}
				    
			    
			}
		});
		btnIgual.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnIgual.setBounds(254, 436, 92, 61);
		contentPane.add(btnIgual);
		
		JTextArea taDescrição = new JTextArea();
		taDescrição.setLineWrap(true);
		taDescrição.setFont(new Font("Microsoft JhengHei", Font.BOLD | Font.ITALIC, 20));
		taDescrição.setText("Autor: Guilherme Abreu\r\nCurso: Ci\u00EAncias da Computa\u00E7\u00E3o\r\nInstitui\u00E7\u00E3o: Universidade Paulista- UNIP");
		taDescrição.setBounds(15, 513, 443, 107);
		contentPane.add(taDescrição);
		
	}
}

